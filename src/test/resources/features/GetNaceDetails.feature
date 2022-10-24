@getNaceDetails
Feature: Get NACE details
  As a user I should be able to fetch an NACE details

// Used naceDetails.json to validate the response instead of writing them in feature file

  Scenario: Fetch NACE details
    Given I have a valid endpoint to fetch NACE details
    When I send a get request to access the NACE details
    Then I see the NACE details



  Scenario: Error displayed for invalid id
    Given I have a valid endpoint to fetch NACE details
    And I send a get request to access NACE detail using invalid id
    Then I receive 404 status code in response



