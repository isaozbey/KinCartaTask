Feature: Search

  Story :As a Customer when I search for Alexa, I want to see if the third option on the second page is available
         for purchase and can be added to the cart.

  @Search
  Scenario: search "Alexa" on Amazon page
    Given the user navigates to Amazon website
    And   searches "Alexa"
    And   navigates to the second page
    And   selects the third item
    Then  item in the chart

