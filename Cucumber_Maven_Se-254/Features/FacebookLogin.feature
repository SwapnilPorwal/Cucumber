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
Feature: Facebook Login Scenario
  I want to test Facebook Login scenario

  @tag1
  Scenario: Login to Facebook with Valid Credentials - No Parameter
    Given Open Chrome and launch Facebook
    When User Enter valid UserName and Password
    And Click login button
    Then User should login successfully
    And Close Browser

  @tag1
  Scenario: Login to Facebook with Valid Credentials - with Parameter
    Given Open Chrome and launch Facebook
    When User Enter valid "UserName" and "Password"
    And Click login button
    Then User should login successfully
    And Close Browser

  @tag1
  Scenario Outline: Login to Facebook with Valid Credentials - Parameter with scenario outline
    Given Open Chrome and launch Facebook
    When User Enter valid "<UserName>" and "<Password>"
    And Click login button
    Then User should login successfully
    And Close Browser

    Examples: 
      | UserName | Password    |
      | SwapOne  | PasswordOne |
      | SwapTwo  | PasswordTwo |
