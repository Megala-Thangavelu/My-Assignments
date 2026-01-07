Feature: Delete the Account

Scenario Outline: Deleting the Existing Account
When Click the Find Accounts tab
And Enter the Account Name <findName>
And Click on Find Button
And Click on First Account ID
Then Click on Deactivate Account
And Click on OK Button


Examples:

|findName|
|'Mega'|
