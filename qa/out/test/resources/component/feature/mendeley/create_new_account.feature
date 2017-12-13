@mendeley_e2e_tests
Feature: New Account Creation
    As a user
    I want to create a new mendeley account,
    So that users can engage with our services
Background:
  Given the user is on the mendeley homepage
  And the user clicks on the "Create Account" link

  Scenario Outline: New Account Registration

	Given the user is on the "Elsevier global signin" page
	And the user enters the "<email>" id
	And the user clicks on the "Continue"
	And the user is on the "Register" page
	And the user enters the following information
      | given_name | family_name | password    |
      | arshiya    | hussain     | password123 |
	When the user clicks on the "Register"
	Then the user sees the "You are registered" message displayed
	And the user clicks on the "Continue to Mendeley"
	And the user is on the "Welcome to Mendeley" page
    And the user clicks on the "Skip this step"
	And the user sees the profile link on the top right corner of the page

	Examples:
	| email              |
	| arshiya.hussain    |


