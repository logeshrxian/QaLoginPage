Feature: Login page functionality

Scenario Outline:

Given  User launches the application
When user enters valid username "<username>"
And  user enter valid password "<password>"

And user clicks the login button


Examples:
|username     |password    |
|standard-user|secret-sauce|
|1234567      |sauce       |

