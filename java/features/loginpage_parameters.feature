Feature: Create Lead with leaftaps application

#Background: 
#Given Open the chrome browser
#And Load the application url

Scenario Outline: Create Lead
Given Enter the username as <username>
And Enter the password as <password>
When click on the login button
And click on crmsfa link button
And click on leads tab
And click on createLead
Then Click on submitbutton
Examples:
|username|password|
|'demosalesmanager'|'crmsfa'|
