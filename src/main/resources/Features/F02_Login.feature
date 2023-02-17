  @smoke
    Feature: F02_Login.feature  user can login sucessfully

      Scenario: user could be able to login with valid username and password
        Given  user go to login page
          When user enter email "eng.mohamed.sarwat@gmail.com" and "Voda@2023"
          And user click on login button
          Then user shall login sucessfully



      Scenario: user couldn't login with invalid email and password
      Given    user go to login page
        When user enter email "test@wrong.com" and "P@assword"
        And  user click on login button
        Then user couldnt login to the system


