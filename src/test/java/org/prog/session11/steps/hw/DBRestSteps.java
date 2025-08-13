package org.prog.session11.steps.hw;

import io.cucumber.java.en.Given;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.prog.session11.DataHolder;
import org.prog.session9.ResultsDto;

public class DBRestSteps {
    @Given("I get {int} random person from API as {string}")
    public void getPersonFromAPI(int amount, String alias) {
        Response response = RestAssured.given()
                .baseUri("https://randomuser.me/")
                .basePath("api/")
                .queryParam("inc", "gender,name,nat,location")
                .queryParam("results", amount)
                .queryParam("noinfo")
                .get();
        response.prettyPrint();
        DataHolder.DATA.put(alias, response.as(ResultsDto.class));
    }
}
