Feature: Registration, Login and MyAccount

  @login
  Scenario Outline: Verify Login Functionality
    Given I am on the homepage
    And I follow "Sign in"
    And I fill "email address textbox" with "<email>"
    And I fill "password textbox" with "<password>"
    And I click "sign in button"
    Then I should see "<heading>" heading

    Examples: 
      | email                     | password   | heading        |
      | goswami.tarun77@gmail.com | 1acgaihigo | MY ACCOUNT     |
      | wrongusername             | test       | AUTHENTICATION |
