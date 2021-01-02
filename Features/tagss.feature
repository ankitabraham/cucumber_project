Feature: It is a dummy experiment

@Sanity @Regression
Scenario: i am i going for sanity and regression
Given i am in web browser_SR
When i clicked a button_SR
Then i am redirected to it_SR

@Sanity
Scenario: in am going for only sanity
Given i am in web browser_s
When i clicked a button_s
Then i am redirected to it_s

@Sanity @DB
Scenario: i am checking sanity and database
Given i am in web browser_SD
When i clicked a button_SD
Then i am redirected to it_SD