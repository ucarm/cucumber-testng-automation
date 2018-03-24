Feature: SugarCRM menu options

@f&f
  Scenario: Verify Collaboration menu options
    #Given I logged into suiteCRM
    #When I hover over the Collaboration menu
    Then following menu options should be visible for Collaboration:
      | Home      |
      | Emails    |
      | Documents |
      | Projects  |
