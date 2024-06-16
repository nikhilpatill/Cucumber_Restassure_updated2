package Go_RestApi_stepDefination;

import java.util.HashMap;

import java.util.HashMap;

import org.junit.After;
import org.junit.Assert;
import org.testng.asserts.SoftAssert;

import com.mongodb.util.JSON;

import Hashmap_apiBody.Login_UserDummyBody;
import Hashmap_apiBody.createuser;
import PojoClasses.CreateUser_Date;
import PojoClasses.UpdateUser_Date;
import RestAssure_pages.RestApi_User;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class BDummyuserLoginPost_stepdefination {

	Login_UserDummyBody LoginData;
	static Response res;
	SoftAssert softAssert = new SoftAssert();
	JsonPath jp;

	@Given("Create DummyuserUser payload")
	public void create_dummyuser_user_payload() {

		LoginData = new Login_UserDummyBody();

		LoginData.mapLogin_User("emilys", "0lelplR");

	}

	@When("LoginToken DummyuserUser API using post method")
	public void login_token_dummyuser_user_api_using_post_method() {

		baseURI = "https://dummyjson.com/auth/login";
		res = given().log().all().header("Authorization",
				"Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MTUsInVzZXJuYW1lIjoia21pbmNoZWxsZSIsImVtYWlsIjoia21pbmNoZWxsZUBxcS5jb20iLCJmaXJzdE5hbWUiOiJKZWFubmUiLCJsYXN0TmFtZSI6IkhhbHZvcnNvbiIsImdlbmRlciI6ImZlbWFsZSIsImltYWdlIjoiaHR0cHM6Ly9yb2JvaGFzaC5vcmcvSmVhbm5lLnBuZz9zZXQ9c2V0NCIsImlhdCI6MTcxNDcxNDA0NiwiZXhwIjoxNzE0NzE3NjQ2fQ.ei8R9jZrJf-of7y3Oqr3uYOFhURzY9u6GIvG-E5ayxk")
				.header("Content-Type", "application/json").contentType(ContentType.JSON)
				.body(LoginData.mapLogin_User("emilys", "emilyspass")).when().post().then().log().all()
				.header("Content-Type", "application/json; charset=utf-8").extract().response();

		       jp = new JsonPath(res.asString());

	}

	
		
		
	
			@Then("The {string} DummyuserUser API call got success with status code {int}")
			public void the_dummyuser_user_api_call_got_success_with_status_code(String HttpMethod, Integer Expectedstatuscode) {
			    	
				
				if(HttpMethod.equalsIgnoreCase("post"))
				{
					softAssert.assertEquals(res.getStatusCode(), Expectedstatuscode);
				}
				
				
				softAssert.assertAll();
				
			}


			@Then("The {string} DummyuserUser API  varify ResponceId {int}")
			public void the_dummyuser_user_api_varify_responce_id(String HttpMethod, Integer ExpectedResponceID) {
				

				if(HttpMethod.equalsIgnoreCase("id"))
				{
					softAssert.assertEquals(jp.getInt("id"), ExpectedResponceID);
					
				}
				softAssert.assertAll();
			   
			}
		
			@Then("The {string} DummyuserUser API  varify Responce_email {string}")
				public void the_dummyuser_user_api_varify_responce_email(String HttpMethod, String ExpectedResponceemail) {
				  
				if(HttpMethod.equalsIgnoreCase("email"))
				{
					softAssert.assertEquals(jp.getString("email"), ExpectedResponceemail);
				}
				softAssert.assertAll();
				
				}


				

				@Then("The {string} DummyuserUser API  varify ResponceId_firstName {string}")
				public void the_dummyuser_user_api_varify_responce_id_first_name(String HttpMethod, String ExpectedResponce_firstName) {
				    
					if(HttpMethod.equalsIgnoreCase("firstName"))
					{
						softAssert.assertEquals(jp.getString("firstName"), ExpectedResponce_firstName);
					}
					softAssert.assertAll();
					
				}
				@Then("The {string} DummyuserUser API  varify Responce_lastName {string}")
				public void the_dummyuser_user_api_varify_responce_last_name(String HttpMethod, String ExpectedResponce_lastName) {
				   
					if(HttpMethod.equalsIgnoreCase("lastName"))
					{
						softAssert.assertEquals(jp.getString("lastName"), ExpectedResponce_lastName);
					}
					softAssert.assertAll();
					
				}
				@Then("The {string} DummyuserUser API  varify Responce_gender {string}")
				public void the_dummyuser_user_api_varify_responce_gender(String HttpMethod, String ExpectedResponce_gender) {
				   
					if(HttpMethod.equalsIgnoreCase("gender"))
					{
						softAssert.assertEquals(jp.getString("gender"), ExpectedResponce_gender);
					}
					softAssert.assertAll();
					
				}
				@Then("The {string} DummyuserUser API  varify Responce_image {string},")
				public void the_dummyuser_user_api_varify_responce_image(String HttpMethod, String ExpectedResponce_image) {
				  
					if(HttpMethod.equalsIgnoreCase("image"))
					{
						softAssert.assertEquals(jp.getString("image"), ExpectedResponce_image);
					}
					softAssert.assertAll();

				}
				
				@Then("The {string} DummyuserUser API  varify Responce_Header {string},")
					public void the_dummyuser_user_api_varify_responce_header(String HttpMethod, String ExpectedResponce_content_type) {
					if(HttpMethod.equalsIgnoreCase("content-type"))
					{
						softAssert.assertEquals(res.contentType(), ExpectedResponce_content_type);
					}
					else if(HttpMethod.equalsIgnoreCase("server"))
					{
						softAssert.assertEquals(res.header("server"), ExpectedResponce_content_type);
					} 
					softAssert.assertAll();
					
					}



}
			


				
			



		
		
	

	

