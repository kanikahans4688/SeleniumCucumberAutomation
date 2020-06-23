
Feature: Wordpress loginPage
 

 
  Scenario: Verify login with valid credentials
    Given I want to launch the browser and open url 
    Then I verify the page title
    When I enter username and password
    Then Verify the homepage title
    Then I close the browser
    

  
