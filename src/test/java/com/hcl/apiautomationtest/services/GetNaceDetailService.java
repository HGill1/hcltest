package com.hcl.apiautomationtest.services;

import io.restassured.response.Response;

public class GetNaceDetailService {

    private Response response;

    public GetNaceDetailService(Response response) {
        this.response = response;
    }
}
