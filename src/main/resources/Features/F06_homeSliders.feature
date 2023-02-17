@smoke
Feature: F06 | User can select between options in home slider
  Scenario: first slider is clickable on home page
    Given  user go to home page
    When  User click on first slider
    Then User should be navigated to first slider details page




    Scenario: second slider is clickable on home page
      Given  user go to home page
      When  user click on second slider
      Then User should be navigated to second slider details page
