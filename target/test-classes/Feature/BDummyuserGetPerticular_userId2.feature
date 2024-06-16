#Author: your.email@your.domain.com
Feature: Get DummyGetperticularUserID API test scenarios

 
  Scenario: GET DummyGetAllUsers API test scenario
    Given AllreadyCreated  GetperticularUserID payload
    When  GetperticularUserID API using GET method
     Then The "Get" GetperticularUserID API call got success with status code 200
     Then The "content-type" GetperticularUserID API  varify Responce_Header "application/json; charset=utf-8",
     Then The "server" GetperticularUserID API  varify Responce_Header "railway",
     Then The "id" varify GetperticularUserID responce 5
     Then The "firstName" varify GetperticularUser responce "Emma"
     Then The "lastName" varify GetperticularUser responce "Miller"
     Then The "maidenName" varify GetperticularUser responce "Johnson"
     Then The "age" varify GetperticularUserID responce 30
     Then The "gender" varify GetperticularUser responce "female"
     Then The "email" varify GetperticularUser responce "emma.miller@x.dummyjson.com"
     Then The "phone" varify GetperticularUser responce "+91 759-776-1614"
     Then The "username" varify GetperticularUser responce "emmaj"
     Then The "password" varify GetperticularUser responce "emmajpass"
     Then The "bloodGroup" varify GetperticularUser responce "AB-"
     Then The "eyeColor" varify GetperticularUser responce "Green"
     Then The "haircolor" varify GetperticularUser responce "White"
     Then The "hairtype" varify GetperticularUser responce "Straight"
     Then The "address" varify GetperticularUser responce "607 Fourth Street"
     Then The "city" varify GetperticularUser responce "Jacksonville"
     Then The "lat" varify GetperticularUser responcee 0.505589
     Then The "lng" varify GetperticularUser responcee -157.43281
     Then The "macAddress" varify GetperticularUser responce "32:b9:7e:8d:f5:e8"
     Then The "university" varify GetperticularUser responce "Northeastern University"
     Then The "cardExpire" varify GetperticularUser responce "03/26"
     Then The "cardNumber" varify GetperticularUser responce "5772950119588627"
     Then The "cardType" varify GetperticularUser responce "American Express"
     Then The "currency" varify GetperticularUser responce "CAD"
     Then The "iban" varify GetperticularUser responce "TAVHURD845KVBTB8W81AQXRY"
     Then The "Company_address" varify GetperticularUser responce "1460 Sixth Street"
     Then The "Company_city" varify GetperticularUser responce "San Antonio"
     Then The "Company_lat" varify GetperticularUser responcee 44.346545
     Then The "Company_lng" varify GetperticularUser responcee -26.944701
     Then The "postalCode" varify GetperticularUser responce "26593"
     Then The "state" varify GetperticularUser responce "Colorado"
    
    
    
    
    
    
 