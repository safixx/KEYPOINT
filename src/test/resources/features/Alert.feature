@wip
Feature:  Alert

  Background:
    Given the user is on the demoqa webpage
    And the user clicks "Alerts, Frame & Windows" module
    Then The user clicks the "Alerts" tab

  Scenario: 1
    When the user click AlertButton
    Then the user verify "You clicked a button" Alert Message

  Scenario: 2
    When the user click timerAlertButton
    Then the user verify "This alert appeared after 5 seconds" Alert Message

  Scenario: 3
    When the user click confirmButton
    Then the user verify "Do you confirm action?" Alert Message

  Scenario: 4
    When the user click promtButton
    Then the user verify "Please enter your name" Alert Message
    And the user enters name
    Then the user verify name






