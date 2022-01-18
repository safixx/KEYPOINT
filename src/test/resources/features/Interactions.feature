

Feature: User should drag “drag me” box to the “drop me” box

  Background:
    Given the user is on the demoqa webpage
    And the user clicks "Interactions" module
    Then The user clicks the "Droppable" tab

    Scenario: User should verify that box dropped
     When The user drag the “drag me” box to the “drop me” box
      Then The user verify that the box dropped


