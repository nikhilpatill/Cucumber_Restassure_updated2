#Author: your.email@your.domain.com
Feature: Create dummyJson_carts_API test scenarios

 
   Scenario: Create User API test scenario
    Given Create dummyJson_carts_API payload
    When LoginToken dummyJson_carts_API API using post method
    Then The "post" dummyJson_carts_API API call got success with status code 200
    Then The "id" dummyJson_carts_API API  varify ResponceId 1
    Then The "email" dummyJson_carts_API API  varify Responce_email "emily.johnson@x.dummyjson.com"
    Then The "firstName" dummyJson_carts_API API  varify ResponceId_firstName "Emily"
    Then The "lastName" dummyJson_carts_API API  varify Responce_lastName "Johnson"
    Then The "gender" dummyJson_carts_API API  varify Responce_gender "female"
    Then The "image" dummyJson_carts_API API  varify Responce_image "https://dummyjson.com/icon/emilys/128",
    Then The "content-type" dummyJson_carts_API API  varify Responce_Header "application/json; charset=utf-8",
    Then The "server" dummyJson_carts_API API  varify Responce_Header "railway",
    
    
    
    
