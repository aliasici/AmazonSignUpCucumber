@etsy
Feature: Etsy main page and search future
  Agile story : We want to buy something from Etsy after searching see relevant results
  in the page in the title

  Background: User should be able to go to Etsy
    Given User should be able to go to Etsy.com
    @etsyTitle
    Scenario: Title verification
      Given User should see the title as excepted

  Scenario: Go to main page of Etsy
    Then User should be able to search what user wants
    Then User should be able to click Big Leo Energy
    Then User should be able to choose gold
    Then User should be able to click add to cart button
    And User should be able to check item info of the cart

    @verificationTitle
    Scenario: Title verification after search term
      When User searches "wooden spoon" in the search box
      And User clicks to search button
      Then User should see "Wooden spoon" in the Etsy title


