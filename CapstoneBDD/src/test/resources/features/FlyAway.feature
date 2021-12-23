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
@tagFlyAway
Feature: FlyAway Ticket Booking
  This would contain scenarios for FlyAway Ticket Booking
 

  @tag1
  Scenario: User opens Home Page
    Given user has opened Application
    When user opens Home page
    Then user should be navigated to home page
    

  @tag1
  Scenario: User Registration
    Given user has opened login page 
    And user opts to register
    When user enters details required
    Then user registered successfully
    
    @tag1
  Scenario: Login Page
    Given user opened login page and enter details
    When user clicks on login button
    Then user is on login page
    
    
    @tag1
  Scenario: Flight Ticket Booking
    Given user has loged successfully and clicks on home
    When Select "Bangalore" as source and "Hyderabad" as destination
    And User books flight
    Then User completes booking
    
     @tag1
  Scenario: View Booking Status 
    Given user complete booking
    Then user will check booking status
    And user logout
