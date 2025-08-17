
Feature: Auth_login GET_AllUsers API test scenarios
  

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
    Then The "id1" varify GET_AllUsers responce "2"
    Then The "email1" varify GET_AllUsers responce "maria@mail.com"
    Then The "password1" varify GET_AllUsers responce "12345"
    Then The "name1" varify GET_AllUsers responce "Maria"
    Then The "role1" varify GET_AllUsers responce "customer"
    Then The "avatar1" varify GET_AllUsers responce "https://i.imgur.com/DTfowdu.jpg"
    Then The "creationAt1" varify GET_AllUsers responce "2025-08-16T23:34:49.000Z"
    Then The "updatedAt1" varify GET_AllUsers responce "2025-08-16T23:34:49.000Z"
    
    
    
     
    
    
    
    
    
    
 
 
 
 