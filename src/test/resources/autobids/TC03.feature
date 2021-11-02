@wip1
Feature: TC03 test case

  Background:Common steps
    Given User should be able to go to main page of AutoBids
    Then User should be able to click Login functionality
#@wip1
#  Scenario:User should be able to enter year , condition and seller type
#    Given User should be able to click Sell Your Vehicle button
#    Then User should be able to select the Year in box
#    Then User should be able to select Item Condition
#    And User should be able to select Seller type

  @wip1
  Scenario Outline:Checking year, condition and seller
    Then User should be able to select the "<year>" in box
    Then User should be able to select "<item Condition>"
    And User should be able to choose a seller "<Seller Type>"
    Examples:
      | year | item Condition | Seller Type       |
      | 2018 | Used           | Dealer            |
      | 2016 | New            | Individual Seller |
      | 2002 | Used           | Dealer            |
      | 2010 | New            | Individual Seller |
