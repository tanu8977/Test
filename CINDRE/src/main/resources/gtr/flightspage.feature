Feature: Test flight functionality

  Scenario Outline: Title of your scenario outline
    Given Open firefox and Start Application
    Then I click on the <flights> page
    And I check for the "<Leaving from>" and "<Going to>"
    And I check for the "<Departing>"
    And I check for the "<Returning>"
    When I verify the <Search> in step

    Examples: 
      | Leaving from | Going To  | Departing | Returning |
      | Madurai      | Bengaluru | 19 Apr    | 20 May    |
      | Vijayawada   | Kochi     | 23 Apr    | 21 May    |
