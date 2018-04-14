@search
Feature: Search
  I want to search the website

  Background: 
    Given I am on the homepage

  @smoke
  Scenario: Keyword Search
    When I fill in "Search Textbox" with "dress" on "Home" page
    Then I press "Search Button" on "Home" page
