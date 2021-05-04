package RestAssuredExample;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.qameta.allure.Story;
import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static io.restassured.RestAssured.get;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.nullValue;

@Story("Case 1")
@Tag("api")
public class ApiTests {
    public static void main(String[] args) {
        RestAssured.filters(new AllureRestAssured());
        RestAssured.baseURI = "http://localhost:9601/JavaREST_war/";



        AccountData[] accountsDataList = get("api/v1/companies").as(AccountData[].class);

        for (AccountData accountData: accountsDataList) {
            get("api/v1/companies" + accountData.getTitle())
                    .then()
                    .body("title", notNullValue());
        }

        for (int i = 0; i < accountsDataList.length; i++) {
            System.out.println(accountsDataList[i].toString());
        }
    }
}



@JsonIgnoreProperties(ignoreUnknown = true)
 class AccountData {
    @JsonProperty("title")
    private String title;

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "AccountData{" +
                "title='" + title + '\'' +
                '}';
    }
}

