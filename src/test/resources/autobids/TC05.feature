@wip
Feature:As seller I want to be able to enter title,fuel and vin info

  Background:Common steps
    Given User should be able to go to main page of AutoBids
    Then User should be able to click Login functionality

  Scenario Outline: Checking title, fuel type and vin number
    Then User should be able to select title "<Title Status>" in box
    Then User should be able to select fuel "<Fuel Type>" in box
    Then User should be able to write Vin "<VIN Number>" in box
    Examples:Data set
      | Title Status | Fuel Type | VIN Number        |
      | Salvage      | Diesel    | 123456789ASDFGPIL |
      | Clean Title  | Gasoline  | 123456789ASDFGHKP |
      | R-Title      | Electric  | 123456789ASDFGHKT |
