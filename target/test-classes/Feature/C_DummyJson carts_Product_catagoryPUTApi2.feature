#Author: your.email@your.domain.com
Feature: Create dummyJson_carts_Product_catagory_APII test scenarios

     @post
   Scenario: Create User API test scenario
    When LoginToken dummyJson_carts_Product_catagory_APII using get method
    Then The "Put" dummyJson_carts_Product_catagory_APII call got success with status code 200
    Then The "content-type" dummyJson_carts_Product_catagory_APII  varify Responce_Header "application/json; charset=utf-8",
    Then The "id" dummyJson_carts_Product_catagory_APII varify Responcee 2
    Then The "title" dummyJson_carts_Product_catagory_APII varify Responce "Chargerhhhh RWD"
   
   