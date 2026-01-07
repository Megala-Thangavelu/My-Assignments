Feature: Create Account in Salesforce application

Scenario Outline:Login into Salesforce application and Create Account
Given Launch the Browser
And Load the URL <url>
And Enter the Username <uName>
And Enter the Passowrd <pwd>
And Click on Login Button
When Click on toggle button
And Click on View All
And Click on Sales
And Click on Accounts tab
And Click on New Button
Then Enter the Account Name <name>
And Click on Ownership in public
And Click save and verify the Account Name

Examples:
|url|uName|pwd|name|
|'https://login.salesforce.com'|'t.megaladevi104@agentforce.com'|'Yathvikmeg@22'|'Megala'|

