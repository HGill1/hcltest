package com.hcl.apiautomationtest.stepdefs;

import com.google.gson.Gson;
import com.hcl.apiautomationtest.models.NaceDetailResponse;
import com.hcl.apiautomationtest.services.SendNaceDetailRequest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.assertj.core.api.SoftAssertions;

import java.io.FileReader;
import java.io.IOException;

public class GetNaceDetails extends BaseStepDef {

    private BaseStepDef baseStepDef;

    public GetNaceDetails(BaseStepDef baseStepDef) {
        this.baseStepDef = baseStepDef;
    }

    @And("I send a get request to access the NACE details")
    public void iSendAGetRequestToAccessTheNaceDetails() {
        SendNaceDetailRequest sendNaceDetailRequest = new SendNaceDetailRequest(baseStepDef.response);
        baseStepDef.response = sendNaceDetailRequest.getRequest(endPoint);
    }

    @Then("I see the NACE details")
    public void iSeeTheNaceDetail() throws IOException {
        Gson gson = new Gson();
        NaceDetailResponse naceDetailResponse = gson.fromJson(new FileReader("json/naceDetails.json"), NaceDetailResponse.class); // This can be created as a generic method

//         I can't find the API document or .yaml file with the test. So can't figure out how the actual/mocked response will
//         look like so below validation code is based on my assumption if the response is very straight forward

        SoftAssertions.assertSoftly(softly -> {
            softly.assertThat(naceDetailResponse.getId()).isEqualTo(baseStepDef.naceDetailResponse.getId());
            softly.assertThat(naceDetailResponse.getLevel()).isEqualTo(baseStepDef.naceDetailResponse.getLevel());
            softly.assertThat(naceDetailResponse.getCode()).isEqualTo(baseStepDef.naceDetailResponse.getCode());
            softly.assertThat(naceDetailResponse.getParent()).isEqualTo(baseStepDef.naceDetailResponse.getParent());
            softly.assertThat(naceDetailResponse.getDescription()).isEqualTo(baseStepDef.naceDetailResponse.getDescription());
            softly.assertThat(naceDetailResponse.getThisItemInclude()).isEqualTo(baseStepDef.naceDetailResponse.getThisItemInclude());
            softly.assertThat(naceDetailResponse.getRulings()).isEqualTo(baseStepDef.naceDetailResponse.getRulings());
            softly.assertThat(naceDetailResponse.getThisItemAlsoIncludes()).isEqualTo(baseStepDef.naceDetailResponse.getThisItemAlsoIncludes());
            softly.assertThat(naceDetailResponse.getThisItemExcludes()).isEqualTo(baseStepDef.naceDetailResponse.getThisItemExcludes());
            softly.assertThat(naceDetailResponse.getReference()).isEqualTo(baseStepDef.naceDetailResponse.getReference());
        });
    }

    @And("I send a get request to access NACE detail using invalid id")
    public void iSendAGetRequestToAccessAnNACEDetailUsingInvalidId() {
        SendNaceDetailRequest sendNaceDetailRequest = new SendNaceDetailRequest(baseStepDef.response);
        baseStepDef.response = sendNaceDetailRequest.getRequest("/abc123");
    }

    @Then("I receive {int} status code in response")
    public void iReceiveStatusCodeInResponse(int statusCode) {
        baseStepDef.response.then()
                .assertThat()
                .statusCode(statusCode)
                .log()
                .ifError(); // Response logs
    }
}
