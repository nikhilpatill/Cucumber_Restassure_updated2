
Feature: Auth_login GET_AllUsers API test scenarios
  
  @now
  Scenario: Create User API test scenario
    When Auth_login GET_AllUsers API using get method
    Then Auth_login GET_AllUsers "get" API call got success with status code 200
    Then The "id" varify GET_AllUsers responce "1"
    Then The "email" varify GET_AllUsers responce "john@mail.com"
    Then The "password" varify GET_AllUsers responce "changeme"
    Then The "name" varify GET_AllUsers responce "mossad"
    Then The "role" varify GET_AllUsers responce "admin"
    Then The "avatar" varify GET_AllUsers responce "https://i.imgur.com/LDOO4Qs.jpg"
    Then The "creationAt" varify GET_AllUsers responce "2025-08-15T23:04:13.000Z"
    Then The "updatedAt" varify GET_AllUsers responce "2025-08-15T23:04:13.000Z"
    
    
    
     
    
    
    
    
    
    
 
 
 
 