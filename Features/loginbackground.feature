Feature: checking login page feature for orangehrm
 
 Background:
 Given i launch the chrome browser
When i open orangehrm home page
 
Scenario: Logo present in orangehrm webpage
Then I verify logo is present on the page
And close browser


Scenario: Login to orangehrm with valid credentials

When Enter username and password
And click on login button
Then User should successfully login to the dashboard page
And close browser