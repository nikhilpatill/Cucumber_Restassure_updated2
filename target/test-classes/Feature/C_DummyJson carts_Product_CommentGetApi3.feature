#Author: your.email@your.domain.com
Feature: Create dummyJson_carts_Product_Comments_APII test scenarios

   @post
   Scenario: Create dummyJson_carts_Product_Comments_APII test scenario
    When dummyJson_carts_Product_Comments_APII using get method
    Then The "Get" dummyJson_carts_Product_Comments_APII call got success with status code 200
    Then The "content-type" dummyJson_carts_Product_Comments_APII  varify Responce_Header "application/json; charset=utf-8",
    
    Then The "id1" dummyJson_carts_Product_Comments_APII varify Responcee 76
    Then The "body1" dummyJson_carts_Product_Comments_APII varify Responce "This really sparkles!"
    Then The "postId1" dummyJson_carts_Product_Comments_APII varify Responcee 2
    Then The "likes1" dummyJson_carts_Product_Comments_APII varify Responcee 8
    Then The "postId1" dummyJson_carts_Product_Comments_APII varify Responcee 2
    Then The "body1" dummyJson_carts_Product_Comments_APII varify Responce "This really sparkles!"
    Then The "userid1" dummyJson_carts_Product_Comments_APII varify Responcee 68
    Then The "username1" dummyJson_carts_Product_Comments_APII varify Responce "laylas"
    Then The "fullName1" dummyJson_carts_Product_Comments_APII varify Responce "Layla Sullivan"
    
     Then The "id2" dummyJson_carts_Product_Comments_APII varify Responcee 198
    Then The "body2" dummyJson_carts_Product_Comments_APII varify Responce "What did I just see, that's amazing, oh sorry it's you!"
    Then The "postId2" dummyJson_carts_Product_Comments_APII varify Responcee 2
    Then The "likes2" dummyJson_carts_Product_Comments_APII varify Responcee 5
    Then The "userid2" dummyJson_carts_Product_Comments_APII varify Responcee 150
    Then The "username2" dummyJson_carts_Product_Comments_APII varify Responce "stellas"
    Then The "fullName2" dummyJson_carts_Product_Comments_APII varify Responce "Stella Morris"
    
