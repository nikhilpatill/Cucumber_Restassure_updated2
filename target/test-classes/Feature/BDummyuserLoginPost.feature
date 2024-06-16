#Author: your.email@your.domain.com
Feature: Create DummyuserUser API test scenarios


  Scenario: Create User API test scenario
    Given Create DummyuserUser payload
    When LoginToken DummyuserUser API using post method
    Then The "post" DummyuserUser API call got success with status code 200
    Then The "id" DummyuserUser API  varify ResponceId 1
    Then The "email" DummyuserUser API  varify Responce_email "emily.johnson@x.dummyjson.com"
    Then The "firstName" DummyuserUser API  varify ResponceId_firstName "Emily"
    Then The "lastName" DummyuserUser API  varify Responce_lastName "Johnson"
    Then The "gender" DummyuserUser API  varify Responce_gender "female"
    Then The "image" DummyuserUser API  varify Responce_image "https://dummyjson.com/icon/emilys/128",
    Then The "content-type" DummyuserUser API  varify Responce_Header "application/json; charset=utf-8",
    Then The "server" DummyuserUser API  varify Responce_Header "railway",
    
    
    
    
 