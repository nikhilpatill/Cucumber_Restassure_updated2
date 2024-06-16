#Author: your.email@your.domain.com
Feature: Create dummyJson_ADD_Cart_APII test scenarios

    @post
   Scenario: Create User ADD_Cart_APIIAPI test scenario
    When LoginToken dummyJson_ADD_Cart_APII using get method
    Then The "Post" dummyJson_ADD_Cart_APII call got success with status code 201
    Then The "content-type" dummyJson_ADD_Cart_APII  varify Responce_Header "application/json; charset=utf-8",
    Then The "id" dummyJson_ADD_Cart_APII varify Responceeid 51
    Then The "total" dummyJson_ADD_Cart_APII varify Responcee 19.98
    Then The "discountedTotal" dummyJson_ADD_Cart_APII varify ResponceediscountedTotal 17
    Then The "userId" dummyJson_ADD_Cart_APII varify ResponceeuserId 1
    Then The "totalProducts" dummyJson_ADD_Cart_APII varify ResponceetotalProducts 2
    Then The "totalQuantity" dummyJson_ADD_Cart_APII varify ResponceetotalQuantity 2
    Then The "Product_title" dummyJson_ADD_Cart_APII varify Responce "Essence Mascara Lash Princess"
    Then The "quantity" dummyJson_ADD_Cart_APII varify ProductResponce 1
    Then The "Producttotal" dummyJson_ADD_Cart_APII varify ProductResponcee 9.99
    Then The "price" dummyJson_ADD_Cart_APII varify ProductResponcee 9.99
    Then The "discountPercentage" dummyJson_ADD_Cart_APII varify ProductResponcee 7.17
    Then The "discountedPrice" dummyJson_ADD_Cart_APII varify ProductResponce 9
    
   
  
    Then The "Product_title2" dummyJson_ADD_Cart_APII varify Responce "Black Whisk"
    Then The "quantity2" dummyJson_ADD_Cart_APII varify ProductResponce 1
    Then The "Producttotal2" dummyJson_ADD_Cart_APII varify ProductResponcee 9.99
    Then The "price2" dummyJson_ADD_Cart_APII varify ProductResponcee 9.99
    Then The "discountPercentage2" dummyJson_ADD_Cart_APII varify ProductResponcee 16.87
    Then The "discountedPrice2" dummyJson_ADD_Cart_APII varify ProductResponce 8