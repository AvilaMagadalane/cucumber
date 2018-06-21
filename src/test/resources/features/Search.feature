@search
Feature: Search
  I want to search the website

	Background:
	Given I am on the homepage

  @smoke
  Scenario: Keyword Search
    When I fill "search textbox" with "dress"
    Then I click "search button"
