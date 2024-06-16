#Author: your.email@your.domain.com
Feature: Create dummyJson_cartsaddUser_API test scenarios

     @post
   Scenario: Create User API test scenario
    Given Create dummyJson_cartsaddUser_API payload
    When LoginToken dummyJson_cartsaddUser_API API using post method
    Then The "post" dummyJson_cartsaddUser_API API call got success with status code 200
    Then The "id" dummyJson_cartsaddUser_API API  varify ResponceId 1
    Then The "title"  dummyJson_cartsaddUser_API varify Responce "job pedrson"
    Then The "content-type" dummyJson_cartsaddUser_API API  varify Responce_Header "application/json; charset=utf-8",
    Then The "server" dummyJson_cartsaddUser_API API  varify Responce_Header "railway",
    
    
    
    
