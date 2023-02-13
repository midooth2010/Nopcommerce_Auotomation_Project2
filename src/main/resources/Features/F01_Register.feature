
  Feature: F01_Registration | guest users can create new accounts for them
    # happy positive scenario
    Scenario: user could be able to create new account with valid data
      Given user go to register page

      When user enter gender type
      And user enter "mohamed" and "Tharwat"
      And user enter Date of birth
      And user enter "eng.mohamed.s24kajgrwat@gkr4mairlll.com" email
      And user enter "Voda@2023" password and Confirm password
      And user Click on Register button
      Then account is created sucessfully