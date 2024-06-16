package Go_RestApi_stepDefination;

import java.util.HashMap;

import java.util.HashMap;

import org.junit.After;
import org.junit.Assert;
import org.testng.asserts.SoftAssert;

import com.mongodb.util.JSON;

import Hashmap_apiBody.C_DummyCart_DummyData;
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

public class C_DummyJsoncartsLogin_PostApi {

	C_DummyCart_DummyData data = new C_DummyCart_DummyData()  ;
	static Response res;
	SoftAssert softAssert = new SoftAssert();
	JsonPath jp;

	@Given("Create dummyJson_carts_API payload")
	public void create_dummy_json_carts_api_payload() {
		
		
		
	}

	
	@When("LoginToken dummyJson_carts_API API using post method")
	public void login_token_dummy_json_carts_api_api_using_post_method() {
		
		baseURI = "https://dummyjson.com/auth/login";
		res = given().log().all().header("Authorization",
				"Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MTUsInVzZXJuYW1lIjoia21pbmNoZWxsZSIsImVtYWlsIjoia21pbmNoZWxsZUBxcS5jb20iLCJmaXJzdE5hbWUiOiJKZWFubmUiLCJsYXN0TmFtZSI6IkhhbHZvcnNvbiIsImdlbmRlciI6ImZlbWFsZSIsImltYWdlIjoiaHR0cHM6Ly9yb2JvaGFzaC5vcmcvSmVhbm5lLnBuZz9zZXQ9c2V0NCIsImlhdCI6MTcxNDcxNDA0NiwiZXhwIjoxNzE0NzE3NjQ2fQ.ei8R9jZrJf-of7y3Oqr3uYOFhURzY9u6GIvG-E5ayxk")
				.header("Content-Type", "application/json").contentType(ContentType.JSON)
				.body(data.mapLogin_User()).when().post().then().log().all()
				.header("Content-Type", "application/json; charset=utf-8").extract().response();

		       jp = new JsonPath(res.asString());
		
		
	}

	@Then("The {string} dummyJson_carts_API API call got success with status code {int}")
	public void the_dummy_json_carts_api_api_call_got_success_with_status_code(String httpmethod, Integer status_code) {
		
		if(httpmethod.equalsIgnoreCase("post"))
		{
			softAssert.assertEquals(res.getStatusCode(), status_code);
			
		}
		
		
	}

	@Then("The {string} dummyJson_carts_API API  varify ResponceId {int}")
	public void the_dummy_json_carts_api_api_varify_responce_id(String httpmethod, Integer responce_id) {
		
		
		if(httpmethod.equalsIgnoreCase("id"))
		{
			softAssert.assertEquals(jp.getInt("id"), responce_id);
			
		}
		
	}

	@Then("The {string} dummyJson_carts_API API  varify Responce_email {string}")
	public void the_dummy_json_carts_api_api_varify_responce_email(String httpmethod, String responce) {
		if(httpmethod.equalsIgnoreCase("email"))
		{
			softAssert.assertEquals(jp.getString("email"), responce);
			
		}
		
		
	}

	@Then("The {string} dummyJson_carts_API API  varify ResponceId_firstName {string}")
	public void the_dummy_json_carts_api_api_varify_responce_id_first_name(String httpmethod, String responce) {
		
		if(httpmethod.equalsIgnoreCase("firstName"))
		{
			softAssert.assertEquals(jp.getString("firstName"), responce);
			
		}
	
		
	}

	@Then("The {string} dummyJson_carts_API API  varify Responce_lastName {string}")
	public void the_dummy_json_carts_api_api_varify_responce_last_name(String httpmethod, String responce) {
		
		if(httpmethod.equalsIgnoreCase("lastName"))
		{
			softAssert.assertEquals(jp.getString("lastName"), responce);
			
		}
		
	}

	@Then("The {string} dummyJson_carts_API API  varify Responce_gender {string}")
	public void the_dummy_json_carts_api_api_varify_responce_gender(String httpmethod, String responce) {
		

		if(httpmethod.equalsIgnoreCase("gender"))
		{
			softAssert.assertEquals(jp.getString("gender"), responce);
			
		}
		
	}

	@Then("The {string} dummyJson_carts_API API  varify Responce_image {string},")
	public void the_dummy_json_carts_api_api_varify_responce_image(String httpmethodng, String responce) {
		
		if(httpmethodng.equalsIgnoreCase("image"))
		{
			softAssert.assertEquals(jp.getString("image"), responce);
			
		}
	
		
	}

	@Then("The {string} dummyJson_carts_API API  varify Responce_Header {string},")
	public void the_dummy_json_carts_api_api_varify_responce_header(String httpmethodng, String responce) {
		
		if(httpmethodng.equalsIgnoreCase("content-type"))
		{
			softAssert.assertEquals(res.contentType(), responce);
			
		}  else if(httpmethodng.equalsIgnoreCase("server"))
		{
			softAssert.assertEquals(res.header("server"), responce);
			
		}
		{
			
		}
	}

}
