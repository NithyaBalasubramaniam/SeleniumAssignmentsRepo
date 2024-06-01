Feature: Login with leaftaps application

Background: 
Given Open the chrome browser
And Load the application url

Scenario: Login valid credentials
GivenEnter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When click on the login button
Then Homepage should be displayed


Scenario: Login Invalid credentials
GivenEnter the username as 'Demosalesmanager'
And Enter the password as 'crms123fa'
When click on the login button
But Homepage should not be displayed


Scenario Outline: Login valid credentials
Given Enter the username as <username>
And Enter the password as <password>
When click on the login button
Then Homepage should be displayed
Examples:
|username|password|
|'demosalesmanager'|'crmsfa'|
|'demoCSR'|'crmsfa'|


Scenario Outline: Login Invalid credentials
GivenEnter the username as <username>
And Enter the password as <password>
When click on the login button
Then Homepage should be displayed
Examples:
|username|password|
|'demosalesmanger'|'crsfa'|
|'demCSR'|'crmsdasfa'|

