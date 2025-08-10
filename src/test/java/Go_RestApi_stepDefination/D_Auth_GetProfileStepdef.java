package Go_RestApi_stepDefination;

import java.util.HashMap;

import org.junit.After;
import org.junit.Assert;

import Hashmap_apiBody.D_Auth_login_Ploadbody;
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
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

public class D_Auth_GetProfileStepdef {

	static Response res;
	static Response res2;
	static int userId;
	static JsonPath jp;
	static JsonPath jp2;
	UpdateUser_Date data;
	RestApi_User user;
	String token = D_Auth_login_stepdef.getToken();

	@When("Auth_login GET_profile API using get method")
	public void auth_login_get_profile_api_using_get_method() {
		{
			RestAssured.baseURI = "https://api.escuelajs.co";
			res = given().log().all().header("Authorization", "Bearer " + token)
					.header("Content-Type", "application/json").when().get("/api/v1/auth/profile").then().log().all()
					.extract().response();

			jp = new JsonPath(res.asPrettyString());

		}
	}

	@Then("Auth_login GET_profile {string} API call got success with status code {int}")
	public void auth_login_get_profile_api_call_got_success_with_status_code(String httpmethod, int expected) {

		if (httpmethod.equalsIgnoreCase("post")) {
			Assert.assertEquals(res.getStatusCode(), expected);
		}
		if (httpmethod.equalsIgnoreCase("get"))

		{
			Assert.assertEquals(res.getStatusCode(), expected);
		}
		
		

	}
	

	@Then("The {string} varify GET_profile responce {string}")
	public void the_varify_get_profile_responce(String httpmethod, String expected ) {
		
		if (httpmethod.equalsIgnoreCase("id")) {
			Assert.assertEquals(jp.getString("id"), expected);
		}
		if (httpmethod.equalsIgnoreCase("email"))

		{
			Assert.assertEquals(jp.getString("email"), expected);
		}
		if (httpmethod.equalsIgnoreCase("password"))

		{
			Assert.assertEquals(jp.getString("password"), expected);
		}
		if (httpmethod.equalsIgnoreCase("name"))

		{
			Assert.assertEquals(jp.getString("name"), expected);
		}
	}

}
