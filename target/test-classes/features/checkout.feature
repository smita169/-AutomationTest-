
Feature: To test secure checkout
  
 
 Scenario: Check if user is able add items in the basket

 Given User opens Chrome browser
 When User is on site "https://www.belazu.com/"
 And User enters text in the Search box
 And I click Enter
 And I select an item
 And I Add item to the bag
 And I click View bag and checkout 
 And I click on Guest checkout
 Then I should be navigated to the Secure checkout Screen
