@filterByRefund
Feature: Validating price by filter functionality

Scenario Outline: Validating price by filter
   Given user is home page
   When clicks login
   And  user enters email "eanaganuripravallika@gmail.com" and password "Pravallika@123"
   Then user is sucessfully logged in
	Given user is on search screen and desination "Hyderabad" is entered 
	When  Filter  is selected
	Then hotel is validated





 