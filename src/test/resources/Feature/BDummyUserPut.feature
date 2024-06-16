#Author: your.email@your.domain.com
Feature: Update NEW_DummyuserUser API test scenarios

 
     Scenario: Update DummyuserUser API test scenario
     Given Create Dummyuser_Update_User payload
     When ADD Dummyuser_Update_User API using put method
     Then The "post" Dummyuser_Update_User API call got success with status code 200
     Then The "content-type" Dummyuser_Update_User API  varify Responce_Header "application/json; charset=utf-8",
     Then The "server" Dummyuser_Update_User API  varify Responce_Header "railway",
     Then The "title" varify Dummyuser_Update_User responce "infinix"
     Then The "price" varify Dummyuser_Update_User responce "600"
     
    
    
    
    
    
    
 