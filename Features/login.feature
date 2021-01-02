Feature: checking login page feature for orangehrm
 
Scenario: Logo present in orangehrm webpage

Given i launch the chrome browser
When i open orangehrm home page
Then I verify logo is present on the page
And close browser


Scenario: Login to orangehrm with valid credentials

Given i launch the chrome browser
When i open orangehrm home page
And Enter username and password
And click on login button
Then User should successfully login to the dashboard page
And close browser


Scenario: Login to orangehrm with valid credentials entering username and password from file

Given i launch the chrome browser
When i open orangehrm home page
And Enter username "Admin" and password "admin123"
And click on login button
Then User should successfully login to the dashboard page
And close browser

 Scenario Outline: Login to orangehrm with valid credentials entering username and password from file

Given i launch the chrome browser
When i open orangehrm home page
And Enter username "<username>" and password "<password>"
And click on login button
Then User should successfully login to the dashboard page
And close browser

Examples:
| username | password |
|admin|admin123|
|admin|123admin|
|Admin|admin123|
