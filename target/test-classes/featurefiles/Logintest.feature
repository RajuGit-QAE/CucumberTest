
Feature: Login Functionality

	Background: launching browser
	Given launch the webdriver

 @Mounika
  Scenario: validating login module1
    Given User is on login page
    When enter uname as "tomsmith" and pword as "SuperSecretPassword!"
    Then check the success message
    
    #Scenario Outline: validating login module
    #Given User is on login page
    #When enter usernamefield as <username> and passwordwordfield as <password>
    #Then check the success message
    #
    #Examples:
    #|username|password|
    #|raj     | 12345|
    #|pranjali| 11111|
    #|mounika | 09877|
    @Mounika
    Scenario: validating login module2
    Given User is on login page
    When enter uname as "raja" and pword as "12345!"
    Then check the success message
    
    @Mounika
    Scenario: validating login module3
    Given User is on login page
    When enter uname as "mounika" and pword as "09876"
    Then check the success message
    

    
 

