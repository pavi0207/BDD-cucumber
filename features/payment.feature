Feature: Validating payment functionality

@gpayTest
Scenario: Gpay integration is selecgted
Given user already has an account on gpay
When userid is correct
Then gpay message should be sent


@phonepeTest
Scenario: PhonePe integration is selecgted
Given user already has an account on PhonePe
When userid is correct
Then PhonePe message should be sent
 

 
