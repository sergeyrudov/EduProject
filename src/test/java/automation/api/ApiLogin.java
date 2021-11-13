package automation.api;

import automation.models.Employee;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.Bean;

import java.net.http.HttpRequest;
import java.util.*;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;

public class ApiLogin {

    @Test
    void successUserListTest() {
        Employee[] accountsDataList = get("https://krolevarka-api.herokuapp.com/api/employees").as(Employee[].class);

        List<Employee> list = new ArrayList<>(Arrays.asList(accountsDataList));


        for (Employee employee : list) {
            System.out.println("---------------------------");
            System.out.println(employee.getId());
            System.out.println(employee.getName());
            System.out.println(employee.getSurname());
            System.out.println(employee.getDepartment());
            System.out.println(employee.getSalary());
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
