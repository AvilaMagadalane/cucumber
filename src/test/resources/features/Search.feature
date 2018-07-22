@search
Feature: Search
  I want to search the website

  Background: 
    Given I am on the home page

  #Example of Optional Capture Group
  @smoke
  Scenario: Keyword Search
    When I fill "search textbox" with "dress"
    Then I click "search button"
    #Positive
    Then I see link "TOP SELLERS"
    #Negative
    Then I do not see link "TOP SALE"
    
  #Example of Non-Optional Capture Group
  @smoke @nonoptional
  Scenario: Keyword Search
    When I fill "search textbox" with "dress"
    Then I click "search button"
    Then I follow "TOP SELLERS" link
    Then She follow "TOP SELLERS" link
    Then He follow "TOP SELLERS" link
    Then User follow "TOP SELLERS" link