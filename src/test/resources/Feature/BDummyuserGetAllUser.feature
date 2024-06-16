#Author: your.email@your.domain.com
Feature: Get DummyGetAllUser API test scenarios


  Scenario: GET DummyGetAllUsers API test scenario
    Given AllreadyCreated  DummyuserUser payload
    When  DummyGetAllUser API using GET method
    Then The "Get" DummyGetAllUser API call got success with status code 200
    Then The "content-type" DummyGetAllUser API  varify Responce_Header "application/json; charset=utf-8",
    Then The "server" DummyGetAllUser API  varify Responce_Header "railway",
    Then The varify DummyGetAllUser responce 
    
    
    
    
 