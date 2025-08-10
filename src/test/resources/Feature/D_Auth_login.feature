@nik
Feature: Auth_login API test scenarios
  
  Scenario: Create User API test scenario
    Given Auth_login payload 
    When Auth_login API using post method
    Then Auth_login "post" API call got success with status code 201
   
 