#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Casino entrance control
Scenario: A groupe of persons who are allowed to enter the casino ask the bouncer
Given the following persons
| age |gambler |
| 18 | false |
| 26 | false |
| 120 | false |
When they ask if they could go in a casino
Then the bouncer should say "of course, come in"

Scenario: A groupe of persons who are not allowed to enter the
casino ask the bouncer
Given the following persons
| age |gambler |
| 18 | true |
| 26 | true |
| 12 | false |
When they ask if they could go in a casino
Then the bouncer should say "no way, get out my face !"