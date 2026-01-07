Feature: Account Creation 

Scenario Outline: Create Account in Lead

When click on Create Account 
And Enter the Account Name <aName>
And Enter the Phone Number <pNum>
And Enter To Name <toName>
Then Click on Create Button

Examples:
|aName|pNum|toName|
|'yath'|'9876'|'mega'|



