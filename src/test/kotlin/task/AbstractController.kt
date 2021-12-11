package automation.api.task

import io.restassured.RestAssured
import io.restassured.response.Response
import io.restassured.specification.RequestSpecification

abstract class AbstractController(var requestSpecification: RequestSpecification) {
    fun get(url:String): Response {
        return RestAssured.given(requestSpecification)
            .with()
            .get(url)
    }

    fun <T: Any> post(url: String, body: T): Response {
        return RestAssured.given(requestSpecification)
            .body(body)
            .with()
            .post(url)
    }
}
