Feature: Search

  Scenario: Verify Search Result
    Given User opens the home page
    When User click About Us menu link
      And User click Career menu link
      And User click Search all jobs button
      And User search for keyword 'automation tester'
    Then User checks the search results is returned