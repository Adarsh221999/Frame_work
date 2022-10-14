@loginFeatures
Feature: Login feature

@loginValidation
Scenario: validation of login page
Given user navigates to application url
When user enters usename and password
Then user clicks login button
 