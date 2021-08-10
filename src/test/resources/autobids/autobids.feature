Feature: Autobids login
  Agile story: as an user should be able to login into Autobids

  Background:Common steps
    Given User should be able to go to main page of AutoBids
    Then User should be able to click Login functionality

  @autobids
  Scenario: Login as an user
   And User should be able to enter all credentials
    And User should be able to click login button
  @negativelogin
  Scenario: Invalid password
    When user logs in with "user@email.com" email and "wrong" password
    Then user verifies that "Sorry, user does not exist in the system." message is displayed