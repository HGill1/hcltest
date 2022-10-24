package com.hcl.apiautomationtest.stepdefs;

import com.hcl.apiautomationtest.models.NaceDetailResponse;
import io.restassured.response.Response;

public class BaseStepDef {
    static protected String endPoint;

    protected Response response;

    protected NaceDetailResponse naceDetailResponse;
}
