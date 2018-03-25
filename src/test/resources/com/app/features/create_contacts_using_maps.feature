Feature: Creating contacts

  @create_contact
  Scenario: Create contact using a map
    Given I logged into suiteCRM
    When I create a new contact:
      | first_name | John         |
      | last_name  | Smith        |
      | cell_phone | 801-888-8889 |
    Then I should see contact information for "John Smith"
