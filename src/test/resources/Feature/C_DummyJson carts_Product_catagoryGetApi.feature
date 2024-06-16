#Author: your.email@your.domain.com
Feature: Create dummyJson_carts_Product_catagory_API test scenarios

      @post
   Scenario: Create User API test scenario
    When LoginToken dummyJson_carts_Product_catagory_API using get method
    Then The "Get" dummyJson_carts_Product_catagory_API call got success with status code 200
    Then The "content-type" dummyJson_carts_Product_catagory_API  varify Responce_Header "application/json; charset=utf-8",
    Then The "slug" dummyJson_carts_Product_catagory_API varify Responce "beauty"
    Then The "name" dummyJson_carts_Product_catagory_API varify Responce "Beauty"
   
    Then The "slug1" dummyJson_carts_Product_catagory_API varify Responce "fragrances"
    Then The "name1" dummyJson_carts_Product_catagory_API varify Responce "Fragrances"

    Then The "slug2" dummyJson_carts_Product_catagory_API varify Responce "furniture"
    Then The "name2" dummyJson_carts_Product_catagory_API varify Responce "Furniture"
    
    Then The "slug3" dummyJson_carts_Product_catagory_API varify Responce "groceries"
    Then The "name3" dummyJson_carts_Product_catagory_API varify Responce "Groceries"
   
    Then The "slug4" dummyJson_carts_Product_catagory_API varify Responce "home-decoration"
    Then The "name4" dummyJson_carts_Product_catagory_API varify Responce "Home Decoration"
    
    Then The "slug5" dummyJson_carts_Product_catagory_API varify Responce "kitchen-accessories"
    Then The "name5" dummyJson_carts_Product_catagory_API varify Responce "Kitchen Accessories"
    
    Then The "slug6" dummyJson_carts_Product_catagory_API varify Responce "laptops"
    Then The "name6" dummyJson_carts_Product_catagory_API varify Responce "Laptops"
    
   