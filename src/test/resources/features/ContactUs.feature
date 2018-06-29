#Author: Tarun Goswami
#Website: ProgramsBuzz
@contactus
Feature: As an Ecommerce store owner,
  I want customer are able to contact me in case of any query

  Background: 
    Given I am on the homepage
    And I follow "Contact us"

  @regression @test123
  Scenario: Fill in Contact Us form
    When I fill "email address" with "goswami.tarun77"
    And I fill in "message" with:
      """
      Dear,
      
      Its been more than a week, I have not received my order.
      
      Thanks,
      Tarun Goswami
      """

  @regression @smoke
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
