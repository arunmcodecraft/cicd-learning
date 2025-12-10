Feature: Launch Application

  @Smoke
  Scenario: Open Google page
    Given I launch the browser
    When I open Google
    Then the page title should contain "Google"