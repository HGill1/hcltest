package com.hcl.apiautomationtest.stepdefs;

import com.hcl.apiautomationtest.util.PropertiesUtil;
import io.cucumber.java.en.Given;

public class CommonSteps extends BaseStepDef {

    @Given("I have a valid endpoint to fetch NACE details")
    public void iHaveAValidEndpointToFetchNaceDetails() {
        final PropertiesUtil propertiesUtil = PropertiesUtil.getInstance();
        endPoint = propertiesUtil.getApiURI("endPoint");
    }
}
