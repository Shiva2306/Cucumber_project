
@tag
Feature: Login feature

  @smoke
  Scenario: To verify login page and all textboxes present
    Given User opens chrome browser and enters facebook url
    When user enters email ID and password
    And clicks on submit button
    Then a confirmation message should be displayed

