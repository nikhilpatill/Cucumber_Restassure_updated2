#Author: your.email@your.domain.com
Feature: Get DummyGetusersQuaryparameter API test scenarios


  Scenario: GET DummyGetAllUsers API test scenario
     Given AllreadyCreated  DummyGetusersQuaryparameterr payload
     When  DummyGetusersQuaryparameterr API using GET method
     Then The "Get" DummyGetusersQuaryparameterr API call got success with status code 200
     Then The "content-type" DummyGetusersQuaryparameterr API  varify Responce_Header "application/json; charset=utf-8",
     Then The "server" DummyGetusersQuaryparameterr API  varify Responce_Header "railway",
     
     Then The "id" varify DummyGetusersQuaryparameterr responce 1
     Then The "firstName" varify DummyGetusersQuaryparameterr responce "Emily"
     Then The "lastName" varify DummyGetusersQuaryparameterr responce "Johnson"
     Then The "maidenName" varify DummyGetusersQuaryparameterr responce "Smith"
     Then The "age" varify DummyGetusersQuaryparameterr responce 28
     Then The "hairtype" varify DummyGetusersQuaryparameterr responce "Curly"
     Then The "haircolor" varify DummyGetusersQuaryparameterr responce "Brown"
     
     
     Then The "id2" varify DummyGetusersQuaryparameterr responce 2
     Then The "firstName2" varify DummyGetusersQuaryparameterr responce "Michael"
     Then The "lastName2" varify DummyGetusersQuaryparameterr responce "Williams"
     Then The "maidenName2" varify DummyGetusersQuaryparameterr responce ""
     Then The "age2" varify DummyGetusersQuaryparameterr responce 35
     Then The "hairtype2" varify DummyGetusersQuaryparameterr responce "Straight"
     Then The "haircolor2" varify DummyGetusersQuaryparameterr responce "Green"
     
      Then The "id3" varify DummyGetusersQuaryparameterr responce 3
     Then The "firstName3" varify DummyGetusersQuaryparameterr responce "Sophia"
      Then The "lastName3" varify DummyGetusersQuaryparameterr responce "Brown"
     Then The "maidenName3" varify DummyGetusersQuaryparameterr responce ""
     Then The "age3" varify DummyGetusersQuaryparameterr responce 42
     Then The "hairtype3" varify DummyGetusersQuaryparameterr responce "Wavy"
     Then The "haircolor3" varify DummyGetusersQuaryparameterr responce "White"
    
    
    
 