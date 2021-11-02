@wip4
Feature:Listing a car

  Background:Common steps
    Given User should be able to go to main page of AutoBids
    Then User should be able to click Login functionality

  Scenario Outline:
    And User should be select to "<Location>" in box
    And User should be click the submit button
    Examples:
      | Location      |
      | Abbott, TX    |
      | Abell, MD     |
      | Aberdeen, OH  |
      | Abie, NE      |
      | Acampo, CA    |
      | Ace, TX       |
      | Adamstown, PA |
