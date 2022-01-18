@wip
Feature:
  User should be able to login with valid credentials.


  Scenario Outline: Login with different valid credentials

    Given The user is on login page
    When The user enters "<username>" and "<password>"
    Then The user should be on the home page

    Examples:
      | username                | password     |
      | standard_user           | secret_sauce |
      | locked_out_user         | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |