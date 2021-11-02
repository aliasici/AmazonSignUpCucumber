Feature: Register
  Agile story: As an user should be able to register into AutoBids page

  Background:Common steps
    Given User should be able to go to main page of AutoBids
    Then User should be able to click Login functionality

  @register
  Scenario: Register to AutoBids web page
    When user should be able to click signUp button
    And User should be able to enter unique user name
    And User should be able to enter unique email
    And User should be bale to enter unique password
    And User should be able to click checkbox for policy
    And User should be able to agree policy clicking by Accept
    And User should be able to click register button