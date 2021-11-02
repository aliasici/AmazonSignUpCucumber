Feature: Autobids login
  Agile story: as an user should be able to login into Autobids
  @wip
  Background:Common steps
    Given User should be able to go to main page of AutoBids
    Then User should be able to click Login functionality

  @wip
  Scenario: Login as an user
    And User should be able to enter all credentials
    And User should be able to click login button

  @wip
  Scenario: Invalid password
    When user logs in with "user@email.com" email and "wrong" password
    Then user verifies that "Sorry, user does not exist in the system." message is displayed

  @phoneLogin
  Scenario: Login with a phone number
    Given User should be able to click checkbox
    And User should be able to click Accept button
    And User should be bale to click sign in with phone button
    And User should be able to enter user name in field
    And User should be able to enter phone number
    And User should be able to click Login button

  @wip
  Scenario Outline: User login into AutoBids
    When User can input "<email>" and "<password>"
    And User should be able to click login button

    Examples:
      | email                     | password   |
      | ali.asici@theautobids.com | Irvine1130 |
      | aliasici@hotmail.com      | Irvine     |
      | eyben.eyben@gmail.com     | 123456789  |
