
Feature: Auth_login GET_AllUsers API test scenarios
  
  Scenario: Create User API test scenario
    When Auth_login GET_AllUsers API using get method
    Then Auth_login GET_AllUsers "get" API call got success with status code 200
    Then The "id" varify GET_AllUsers responce "1"
    Then The "email" varify GET_AllUsers responce "john@mail.com"
    Then The "password" varify GET_AllUsers responce "changeme"
    Then The "name" varify GET_AllUsers responce "Jhon"
    
    
    
    
    
 
 
 
 