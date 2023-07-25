@loginTest
Feature: Validating Login Functionality

Scenario Outline: Test Successfulnlogin case
Given User is on the login screen
When user provides correct username
|user123|
|user456|

#And user provides correct password=<password>
#Then User must login 
#But error should not be there


Examples:
|username|
|user@123|
|user@456|
|user@789|