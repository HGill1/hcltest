package com.hcl.apiautomationtest.services;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class SendNaceDetailRequest {
    private Response response;

    public SendNaceDetailRequest(Response response) {
        this.response = response;
    }

    public Response getRequest(String endpoint) {

        return response = given().contentType("application/json")
                .when()
                .log().ifValidationFails() //Request logs used for debugging
                .get(endpoint);
    }
}
