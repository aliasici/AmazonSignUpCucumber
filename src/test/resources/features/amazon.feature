Feature: Amazon sign up
  Agile Story: As a user, I should be able to sign up when I am on Amazon main page

    Background:Common steps
      Given User should be able to go Amazon main page
      And User should be able to click Sign In functionality
      And User should be able to click create your Amazon account button

  @regression
  Scenario: Sign Up on Amazon
    Then User should be able to enter all credentials and click create your Amazon account button
  @smoke
  Scenario Outline: Sign up with <username> and <email> and <password> and <reenterpassword>
    When user enters  "<username>" username and "<email>" email and "<password>" password and "<reenterpassword>" reenterpassword


    Examples: data set
      | username   | email                       | password            | reenterpassword|
      | username   |cebotal733@eyeremind.com     |Kilkuyruk1           | Kilkuyruk1     |
