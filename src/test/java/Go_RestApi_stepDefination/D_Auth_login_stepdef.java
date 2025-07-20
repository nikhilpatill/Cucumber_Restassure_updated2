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

public class D_Auth_login_stepdef {

	static Response res;
	static Response res2;
	static int userId;
	static JsonPath jp;
	static JsonPath jp2;
	UpdateUser_Date data;
	RestApi_User user;
	static  D_Auth_login_Ploadbody Cdata;
	static String token;
	
	

	
	 @Given("Auth_login payload")
	  public void auth_login_payload() {
		 
	   user=new RestApi_User();
	   Cdata= new D_Auth_login_Ploadbody();
		
	}

	 @When("Auth_login API using post method")
	   public static  void auth_login_api_using_post_method() {
		RestAssured.baseURI="https://api.escuelajs.co";
	 res=given().log().all()
		.header("Authorization","Bearer 3ca4fd3124efe137596b143d26a1dc89792b1644d2c82cfb53ac9bbdf40b2ea0")
		.header("Content-Type","application/json")
		.body(Cdata.mapLogin_User())
		.when().post("/api/v1/auth/login")
		.then().log().all().extract().response();
	   	
		jp = new JsonPath(res.asPrettyString());
		
		token = res.jsonPath().getString("access_token");
	}
	 
	 
	 public static  String getToken() {
	        try {
				if (token == null) {
					auth_login_api_using_post_method();
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        return token;
	    }


	 
	 @Then("Auth_login {string} API call got success with status code {int}")
	    public void auth_login_api_call_got_success_with_status_code(String httpmethod, int expected) {
		if(httpmethod.equalsIgnoreCase("post"))
		{
			Assert.assertEquals(res.getStatusCode(),expected);
		}
		if(httpmethod.equalsIgnoreCase("get"))
	
		{
			Assert.assertEquals(res.getStatusCode(),expected);
		}
		
	   
	}

	 
	 
	
	}


