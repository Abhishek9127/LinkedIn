Feature: Login Functionality

@Run
Scenario: Login functionality is working or not when user enter correct credentials


When User enters valid username and password
And User click on SignIn button
Then Validates user navigating to the homepage or not

@Run1
Scenario: Login functionality with credentials

When user enters valid "abhi912700@gmail.com" and "Abhi9127"
And user click on signIn button1
Then Validates user navigating to the homepage or not1

@Run2
Scenario Outline: Login with different values

When user enters valids "<name>" and "<pass>"
And user click on signIn button2
Then Validates user navigating to the homepage or not2

Examples:

|name|pass|
|abhi|111|
|abhi912700@gmail.com|Abhi9127|
|abhi0|1110|

