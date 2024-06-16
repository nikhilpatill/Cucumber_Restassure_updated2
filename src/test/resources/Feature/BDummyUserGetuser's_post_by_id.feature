
Feature: Get posts by user id API test scenarios


  Scenario: GET DummyGetAllUsbyers posts  user id  API test scenario
    Given AllreadyCreated  DummyuserUser_posts_user_id payload
    When  DummyuserUser_posts_user_id API using GET method
    Then The "Get" DummyuserUser_posts_user_id API call got success with status code 200
    Then The "content-type" DummyuserUser_posts_user_id API  varify Responce_Header "application/json; charset=utf-8",
    Then The "server" DummyuserUser_posts_user_id API  varify Responce_Header "railway",
    Then The varify DummyuserUser_posts_user_id responce 
    
    
    
    
 