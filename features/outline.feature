@outlineTest
Feature: Validating Login Functionality

Scenario Outline: Test Successfulnlogin case outline
Given User is on the login screen outline
When user provides correct username outline=<username>
And user provides correct password outline=<password>
Then User must login outline



Examples:
|username|password|
|"userA"|"passA"|
|"userB"|"passB"|
