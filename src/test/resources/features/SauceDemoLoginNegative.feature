@wip
Feature: User can not  login with with invalid credentials

  Background:
    Given the user is on the login page

  Scenario: Login with different invalid credentials
    When the user enters by using "  " and "secret_sauce"
    Then the should not be on home page

  Scenario: Login with different invalid credentials
    When the user enters by using "standard_user" and "   "
    Then the should not be on home page

  Scenario: Login with different invalid credentials
    When the user enters by using "   " and "  "
    Then the should not be on home page
