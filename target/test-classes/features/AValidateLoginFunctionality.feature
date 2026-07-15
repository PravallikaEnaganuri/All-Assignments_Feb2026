@login
Feature: Login functionality of registered user

  Scenario: login via email and password
   Given user is home page
   When clicks login
   And  user enters email "eanaganuripravallika@gmail.com" and password "Pravallika@123"
   Then user is sucessfully logged in