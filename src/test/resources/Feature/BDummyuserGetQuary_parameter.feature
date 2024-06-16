#Author: your.email@your.domain.com
Feature: Get DummyGetusersQuaryparameter API test scenarios


  Scenario: GET DummyGetAllUsers API test scenario
    Given AllreadyCreated  DummyGetusersQuaryparameter payload
    When  DummyGetusersQuaryparameter API using GET method
     Then The "Get" DummyGetusersQuaryparameter API call got success with status code 200
     Then The "content-type" DummyGetusersQuaryparameter API  varify Responce_Header "application/json; charset=utf-8",
     Then The "server" DummyGetusersQuaryparameter API  varify Responce_Header "railway",
     Then The "id" varify DummyGetusersQuaryparameter responce 1
     Then The "firstName" varify GetperticularUserr responce "Emily"
     Then The "lastName" varify GetperticularUserr responce "Johnson"
     Then The "maidenName" varify GetperticularUserr responce "Smith"
     Then The "age" varify GetperticularUserr responce 28
     Then The "gender" varify GetperticularUserr responce "female"
     Then The "email" varify GetperticularUserr responce "emily.johnson@x.dummyjson.com"
     Then The "phone" varify GetperticularUserr responce "+81 965-431-3024"
     Then The "username" varify GetperticularUserr responce "emilys"
     Then The "password" varify GetperticularUserr responce "emilyspass"
     Then The "bloodGroup" varify GetperticularUserr responce "O-"
     Then The "eyeColor" varify GetperticularUserr responce "Green"
     Then The "haircolor" varify GetperticularUserr responce "Brown"
     Then The "hairtype" varify GetperticularUserr responce "Curly"
     Then The "address" varify GetperticularUserr responce "626 Main Street"
     Then The "city" varify GetperticularUserr responce "Phoenix"
     Then The "lat" varify GetperticularUserr responcee -77.16213
     Then The "lng" varify GetperticularUserr responcee -92.08482
     Then The "macAddress" varify GetperticularUserr responce "47:fa:41:18:ec:eb"
     Then The "university" varify GetperticularUserr responce "University of Wisconsin--Madison"
     Then The "cardExpire" varify GetperticularUserr responce "03/26"
     Then The "cardNumber" varify GetperticularUserr responce "9289760655481815"
     Then The "cardType" varify GetperticularUserr responce "Elo"
     Then The "currency" varify GetperticularUserr responce "CNY"
     Then The "iban" varify GetperticularUserr responce "YPUXISOBI7TTHPK2BR3HAIXL"
     Then The "Company_address" varify GetperticularUserr responce "263 Tenth Street"
     Then The "Company_city" varify GetperticularUserr responce "San Francisc"
     Then The "Company_lat" varify GetperticularUserr responcee 71.814525
     Then The "Company_lng" varify GetperticularUserr responcee -161.150263
     Then The "crypto_coin" varify GetperticularUserr responce "Bitcoin"
     Then The "crypto_wallet" varify GetperticularUserr responce "0xb9fc2fe63b2a6c003f1c324c3bfa53259162181a"
    
    
    
    
    
    
 