#Author: Tarun Goswami
#Website: ProgramsBuzz
@contactus
Feature: As an Ecommerce store owner,
  I want customer are able to contact me in case of any query

  Background: 
    Given I am on the home page
    And I follow "Contact us" link

  @regression @testing123
  Scenario: Fill in Contact Us form
    When I fill "email address" with "goswami.tarun77"
    And I fill in "message" with:
      """
      Dear,
      
      Its been more than a week, I have not received my order.
      
      Thanks,
      Tarun Goswami
      """
