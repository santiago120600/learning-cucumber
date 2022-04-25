Feature: Test different actions on a sandbox page
  Scenario: As a Test Engineer, I try out different actions on a sandbox page
    Given I navigate to the sandbox page
    And select a value from the dropdown

    @Test
    Scenario: As a Test Engineer, I want to retrieve the value of a static table
      Given I navigate to the static table
      Then I can return the value I wanted

    Scenario: As a user, I want to upload a file
      Given I navigate to the website
      Then I upload a file

    Scenario: As a user, I click and dismiss an alert
      Given I navigate to the alert website
      Then click on the alert button
      And dismiss the alert



