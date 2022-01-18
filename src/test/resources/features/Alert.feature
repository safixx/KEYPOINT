
Feature:  User  should handle all Alerts on "Alerts, Frame & Windows" module

  Background:
    Given the user is on the demoqa webpage
    And the user clicks "Alerts, Frame & Windows" module
    Then The user clicks the "Alerts" tab

  Scenario: User should click button to see Alert
    When the user click AlertButton
    Then the user verify "You clicked a button" Alert Message

  Scenario: User should see alert will appear button
    When the user click timerAlertButton
    Then the user verify "This alert appeared after 5 seconds" Alert Message

  Scenario: User should see confirm box
    When the user click confirmButton
    Then the user verify "Do you confirm action?" Alert Message

  Scenario: User should see prompt box
    When the user click promtButton
    Then the user verify "Please enter your name" Alert Message
    And the user enters name
    Then the user verify name






