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
@tag
Feature: AutomationPractice feature
  I want to use this template for my feature file

  @tag1
  Scenario: Login to AutomationPractice
    Given User navigated to AutomationPractice
    And User Click on Sign in link
    When User Enter UserName as "swapnilporwal2013@gmail.com" and Password as "Automationpractice123" for login to AuomationPractice
    And Click on Sign in Button
		Then user should be logged in successfully

 