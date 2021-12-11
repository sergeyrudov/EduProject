package automation.api

import automation.api.task.AbstractController
import automation.api.task.Employee
import automation.api.task.KrolevarkaAPI
import com.google.gson.JsonObject
import io.qameta.allure.Step
import io.restassured.RestAssured.post
import io.restassured.RestAssured.requestSpecification
import org.springframework.http.HttpStatus
import java.util.*

object EmployeeController : AbstractController(requestSpecification = KrolevarkaAPI.requestSpecification) {

    private const val BASE_PATH: String = "https://krolevarka-api.herokuapp.com/api/employees"

    @Step("Create employee")
    fun createEmployee(employee: Employee): Employee {
        return post(BASE_PATH, employee)
            .then()
            .statusCode(HttpStatus.OK.value())
            .extract().body().`as`(Employee::class.java)
    }

    @Step("Get Employee")
    fun getEmployee(id: Int): Employee {
        return get("$BASE_PATH/$id")
            .then()
            .statusCode(HttpStatus.OK.value())
            .extract().body().`as`(Employee::class.java)
    }
}