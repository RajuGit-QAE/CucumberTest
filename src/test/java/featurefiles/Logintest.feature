
Feature: Login Functionality
 
  Scenario: validating login module
    Given User is on login page
    When enter uname as "tomsmith" and pword as "SuperSecretPassword!"
    Then check the success message
 

  
