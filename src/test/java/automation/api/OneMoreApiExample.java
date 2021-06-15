package automation.api;

import automation.models.AccountData;
import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.get;
import static org.hamcrest.Matchers.notNullValue;

public class OneMoreApiExample {

    @BeforeEach
    void beforeEach() {
        RestAssured.filters(new AllureRestAssured());
        RestAssured.baseURI = "http://kn-ktapp.herokuapp.com";
    }

    @Test
    @DisplayName("Проверка, что в запросах к списку счетов account_id не пустой")
    void accountsTest() { // todo move to steps
        AccountData[] accountsDataList = get("/apitest/accounts").as(AccountData[].class);

        for (AccountData accountData: accountsDataList) {
            get("/apitest/accounts/" + accountData.getAccountId())
                    .then()
                    .body("account_id", notNullValue());
        }
    }

}
