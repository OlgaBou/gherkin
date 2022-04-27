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

Feature: Connexion JPetStore
  I want to connect to my profile at JPetStore


Scenario Outline: I want to connect to my profile at JPetStore
    Given I have opened new browser
    When I click on signon 
    And I add <login> and <password>
    Then I see <Nom utilisateur>


    Examples: 
  	| login | password | Nom utilisateur  |
		| "j2ee" |   "j2ee" | "Welcome ABC!" |
  	| "ACID" |   "ACID" | "Welcome ABC!"    |

