Feature: Login with leaftaps application

Scenario: Login valid credentials

Given Open the chrome browser
And Load the application url
And Enter the username as Demosalesmanager
And Enter the password as crmsfa
When click on the login button
Then Homepage should be displayed


Scenario: Login Invalid credentials
Given Open the chrome browser
And Load the application url
And Enter the username as Demosalesmanager
And Enter the password as crmsfa

When click on the login button

Then Homepage should be displayed

