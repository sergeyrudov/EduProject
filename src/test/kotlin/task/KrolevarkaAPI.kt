package automation.api.task

import io.qameta.allure.restassured.AllureRestAssured
import io.restassured.builder.RequestSpecBuilder
import io.restassured.http.ContentType
import io.restassured.specification.RequestSpecification
import org.apache.http.client.methods.RequestBuilder

object KrolevarkaAPI {
    var requestSpecification: RequestSpecification =
        RequestSpecBuilder()
            .setContentType(ContentType.JSON)
            .build()
}