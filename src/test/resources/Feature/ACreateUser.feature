#Author: your.email@your.domain.com
Feature: Create User API test scenarios
  
  Scenario: Create User API test scenario
    Given Create user payload "nikhil","patil@ttipai","male","active"
    When User calls user API using post method
    Then The "post" API call got success with status code 201
 