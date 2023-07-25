@Makemytriptest
Feature:  Testing Make My Trip Website

Scenario: Testing MakeMyTrip Login Functionality
Given User is on the login page
When User is provide the phoneNumber "6374690593"
And  user click Continue
Then OTP is send "123456"
And  user is unable to login