@paralleltest
Feature: testing parallel

Scenario Outline: Parallel execution using testing

Given user on the site to test parallel
When url is launched<url> to test parallel
Then close the site to test parallel

Examples:
|url|
|"https://www.amazon.com/"|
|"https://www.flipkart.com/"| 