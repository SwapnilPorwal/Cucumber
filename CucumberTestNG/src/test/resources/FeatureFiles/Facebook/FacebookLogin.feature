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



Feature: Facebook login Feature
  Feature will test Login functionality of Facebook

  

  @Automation
  Scenario: Login with Invalid Credentials
    Given User Navigated to Facebook
    When User enter Username as "UserName" and Password as "Password"
    And Clcik on Login button
    Then User should be not ne logged In
    
  @Manual
  Scenario: Login with Invalid Credentials - Manual
    Given User Navigated to Facebook
    When User enter Username as "UserName" and Password as "Password"
    And Clcik on Login button
    Then User should be not ne logged In



