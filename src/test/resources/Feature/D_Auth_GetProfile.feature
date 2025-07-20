@nik
Feature: Auth_login GET_profile API test scenarios
  
  Scenario: Create User API test scenario
    When Auth_login GET_profile API using get method
    Then Auth_login GET_profile "get" API call got success with status code 200
    Then The "id" varify GET_profile responce "1"
    Then The "email" varify GET_profile responce "john@mail.com"
    Then The "password" varify GET_profile responce "changeme"
 
 
 
 