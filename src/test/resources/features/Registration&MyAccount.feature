Feature: Registration, Login and MyAccount

  Background:
    Given I am on the homepage
    And I follow "Sign in"
  
  @smoke
  Scenario Outline: Verify Login Functionality
    And I fill "email address textbox" with "<email>"
    And I fill "password textbox" with "<password>"
    And I click "sign in button"
    Then I should see "<heading>" heading

    Examples: 
      | email                     | password | heading        |
      | goswami.tarun77@gmail.com | test1234 | MY ACCOUNT     |
      | wrongusername             | test     | AUTHENTICATION |

  @register
  Scenario: Create New User
    And I fill "registration email textbox" with "goswami.tarun77+1@gmail.com"
    Then I click "create an account button"
    And I enter following details
      | First Name | Tarun    |
      | Last Name  | Goswami  |
      | Password   | Test1234 |
      | Date       |       13 |
      | Year       |     1989 |
    And I click "register button"