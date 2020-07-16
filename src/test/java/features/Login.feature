Feature: Application login

Scenario: Home page default login
Given user is on Netbanking landing page
When User log in to the application with userid "soumita" and password "12345"
Then Home page is populated
And cards are displayed "true"

Scenario: Home page default login
Given user is on Netbanking landing page
When User log in to the application with userid "moumita" and password "12396"
Then Home page is populated
And cards are displayed "false"