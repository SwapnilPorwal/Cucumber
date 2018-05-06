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
Feature: Jabong Login Feature
  I want to use this template for my feature file

  @tag1
  Scenario: Login to Jabong with Valid Credentials
    Given User Navigated to Jabong
    When Enter UserName as "Swapnilporwal2013@" and Password as "Jabong123" for login to Jabong
    And Click on Login button for Jabong 
		Then User should be able to Jabong
