Feature: Login to the site

Scenario: Testing the login features as a student
Given I have navigated to the site
And I entered my username
When I entered my password 
And I click on the login button
Then I should be able to sign in



Scenario: Testing onboarding with school
Given I have login in
And I clicked the verify later button
When I select to use with my school
And I enetered the class code
Then I should be able to join the class
