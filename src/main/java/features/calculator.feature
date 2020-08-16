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
Feature: This feature file will automate the Windows Calculator
  I want to use this template for my feature file

@tag1
  Scenario: Launch Winium Desktop Driver Exe
  	When Launch Winium Desktop Driver
    Then Validate Winium Desktop Driver Launch
    
	@tag2
  Scenario: Launch Windows Calculator Exe
  	When Launch Windows Calculator
    Then Validate Windows Calculator Launch
    
	@tag3
  Scenario: Perform Addition For Example 1, 2, 3
  	When Perform Addition of 1+2+3
    Then Validate Addition of 1+2+3