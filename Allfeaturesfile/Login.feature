Feature: Login Functionality for OrangeHRM Website

  As a user of the OrangeHRM website
  I want to be able to log in with my account
  So that I can access HR account-related features 

  Background:
    Given I am on the OrangeHRM login page

  Scenario: Successful login with valid credentials
    Given I have entered a valid username and password
    When I click on the login button
    Then I should be logged in successfully

  Scenario Outline: Unsuccessful login with invalid or empty credentials
    Given I have entered invalid "<username>" and "<password>"
    When I click on the login button
    Then I should see an error message indicating "<error_message>"

    Examples:
      | username          | password        | error_message                                         |
      | invalid@email.com | invalidPassword | Invalid credentials                                   |
      | abcccc            | validPassword   | Invalid credentials                                   |
      | valid@email.com   | abccc           | Invalid credentials                                   |