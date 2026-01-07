Feature: Edit the Existing Account

Scenario Outline:Edit the Created Account

When Click on Find Accounts
And Enter the Account Name <aName>
And Click on Find Button
Then Click on First Account ID
And Click on Edit Button
And Enter the Description <des>
Then Click on Save Button


Examples:

|aName|des|
|'Mega'|'changed'|