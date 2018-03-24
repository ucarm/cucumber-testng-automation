Feature: Creating contacts

  @create_contact
  Scenario: Create contact using CREATE page
    Given I logged into suiteCRM
    And I open the create contact page
    And I enter the first name "Donald" and the last name "Duck"
    And I enter the phone number "202-000-0000"
    And I enter the department "IT"
    When click on the save button
    Then I should see contact information for "Donald Duck"
