
Feature: Flight Search
 I want to search flights 
 
  
Scenario: Search for One-Way Flights
Given I am on the flight search page
When I enter "London Heathrow" as the departure city
And I enter "Dubai" as the destination city
And I select "One-way" as the trip type
And I select 2023-07-25 as the departure date
And I click on the Search button
Then I should see a list of available one-way flights from London to New York
    
Scenario: Search for Round-Trip Flights
  Given I am on the flight search page
  When I enter "Paris" as the departure city
	And I enter "Tokyo" as the destination city
	And I select "Round-trip" as the trip type
	And I select "2023-08-10" as the departure date
	And I select "2023-08-20" as the return date
	And I click on the "Search Flights" button
	Then I should see a list of available round-trip flights from Paris to Tokyo
	 
Scenario: Search for Flights with Specific Airline
Given I am on the flight search page
When I enter "New York" as the departure city
And I enter "London" as the destination city
And I select "One-way" as the trip type
And I select "2023-09-15" as the departure date
And I enter "Emirates" as the preferred airline
And I click on the "Search Flights" button
Then I should see a list of available one-way flights from New York to London operated by Emirates

Scenario: Search for Flights with Layovers
Given I am on the flight search page
When I enter "Sydney" as the departure city
And I enter "San Francisco" as the destination city
And I select "One-way" as the trip type
And I select "2023-10-05" as the departure date
And I select "1" as the maximum number of layovers
And I click on the "Search Flights" button
Then I should see a list of available one-way flights from Sydney to San Francisco with a maximum of 1 layover

 