Feature:  Search on Tesco Website
  AS a User.
  I want to open Tesco webpage.
  So that I can find Tesco search
  Scenario Outline: Verify the search Functionality on Tesco website
    Given User must be on Tesco Website
    When  User search for "<product>"  on search bar
    And   User click on Search button
    Then  User will able to see the "<product>" on webpage.
    Examples:
      |product|
      | milk  |
      |cheese |

