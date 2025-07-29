package org.prog.session9;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import java.util.List;

public class RestHW {

    @Test
    public void myRestHW() {


        RequestSpecification requestSpecification = RestAssured.given();

        Response response = requestSpecification.get("https://randomuser.me/documentation");
// response.prettyPrint();
        ValidatableResponse validatableResponse = response.then();
        validatableResponse.body("location.street.number", Matchers.notNullValue());
        ValidatableResponse validatableResponse2 = response.then();
        validatableResponse.body("location.street.name", Matchers.notNullValue());
        ValidatableResponse validatableResponse3 = response.then();
        validatableResponse.body("location.coordinates.latitude", Matchers.notNullValue());
        ValidatableResponse validatableResponse4 = response.then();
        validatableResponse.body("location.coordinates.longitude", Matchers.notNullValue());


    }
}