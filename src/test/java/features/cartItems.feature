
Feature: validate Items in the bag
  
  
   Scenario: Checking the items added in the bag is same as selected
    Given User Launch Chrome browser
    When User opens URL "https://www.belazu.com/"
    And User enters text as "Pasta" in the Search box
    And Clicks enter
    And selects the first product
    And adds to the bag
    And Click on the shopping bag
    Then the items in the bag should be same as the item selected.


  
  