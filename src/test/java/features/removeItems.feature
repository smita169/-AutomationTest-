Feature: validate removing Items from the bag
  
  
   Scenario: Checking if the user is able to remove items from the bag
    Given User is on Chrome browser
    When User opens website "https://www.belazu.com/"
    And User enters value in the Search box
    And Clicks on enter
    And select the first product
    And clicks add to the bag
    And click View basket and checkout 
    And clicks on the delete icon.
    Then the items in the bag should be removed and bag should be empty.


