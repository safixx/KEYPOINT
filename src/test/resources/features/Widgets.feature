
Feature: User should hover over the button

Background:
Given the user is on the demoqa webpage
And the user clicks "Widgets" module
Then The user clicks the "Tool Tips" tab

Scenario: User should see hover over button and see the messages
  When the user hover over the Hover me to see button
  Then the user verify hover me message.
  And the user hover over the “Hover me to see” text field
  Then the user verify hover me text message.
