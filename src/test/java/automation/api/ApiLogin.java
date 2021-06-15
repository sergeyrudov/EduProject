package automation.api;

import automation.models.Employee;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.Bean;

import java.util.*;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;

public class ApiLogin {

    @Test
    void successUserListTest() {
        Employee[] accountsDataList = get("https://krolevarka-api.herokuapp.com/api/employees").as(Employee[].class);

        List<Employee> list = new ArrayList<>(Arrays.asList(accountsDataList));


        for (int i = 0; i < list.size(); i++) {
            System.out.println("---------------------------");
            System.out.println(list.get(i).getId());
            System.out.println(list.get(i).getName());
            System.out.println(list.get(i).getSurname());
            System.out.println(list.get(i).getDepartment());
            System.out.println(list.get(i).getSalary());
            System.out.println("---------------------------");

        }
    }

    @Test
    public void addUserToDB() {
        Faker data = new Faker();

        Map<String, Object> map = new HashMap<>();
        map.put("name", data.name().firstName());
        map.put("surname", data.name().lastName());
        map.put("department", data.company().profession());
        map.put("salary", data.random().nextInt(100, 5000));


        given()
                .contentType("application/json")
                .body(map)
                .post("https://krolevarka-api.herokuapp.com/api/employees")
                .then()
                .statusCode(200);
    }
}
