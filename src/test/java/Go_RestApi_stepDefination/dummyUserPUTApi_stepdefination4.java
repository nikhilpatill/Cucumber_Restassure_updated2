package Go_RestApi_stepDefination;

import java.util.HashMap;

import java.util.HashMap;

import org.junit.After;
import org.junit.Assert;
import org.testng.asserts.SoftAssert;

import com.mongodb.util.JSON;

import Hashmap_apiBody.Login_UserDummyBody;
import Hashmap_apiBody.UPdateUserDummyBody;
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

public class dummyUserPUTApi_stepdefination4 {

	UPdateUserDummyBody UPdateData = new UPdateUserDummyBody();
	static Response res;
	SoftAssert softAssert = new SoftAssert();
	JsonPath jp;

	@Given("Create Dummyuser_Update_User payload")
	public void create_dummyuser_update_user_payload() {

	}

	@When("ADD Dummyuser_Update_User API using put method")
	public void add_dummyuser_update_user_api_using_put_method() {

		baseURI = "https://dummyjson.com/products/1";
		res = given().log().all().header("Authorization",
				"Bearer b0382ed473964bd19dc7a2eb6363e3a44463b2402e2c9d8eac0bc6dee77cc5e0")
				.header("Content-Type", "application/json").contentType(ContentType.JSON)
				.body(UPdateData.mapUpfate_User()).when().put().then().log().all()
				.header("Content-Type", "application/json; charset=utf-8").extract().response();

		jp = new JsonPath(res.asString());

	}

	@Then("The {string} Dummyuser_Update_User API call got success with status code {int}")
	public void the_dummyuser_update_user_api_call_got_success_with_status_code(String httpmethod, Integer int1) {

		if (httpmethod.equalsIgnoreCase("post")) {
			softAssert.assertEquals(res.getStatusCode(), 200);
		}

	}

	@Then("The {string} Dummyuser_Update_User API  varify Responce_Header {string},")
	public void the_dummyuser_update_user_api_varify_responce_header(String httpmethod, String string2) {

		if (httpmethod.equalsIgnoreCase("content-type")) {
			softAssert.assertEquals(res.contentType(), "application/json; charset=utf-8");
		} else if (httpmethod.equalsIgnoreCase("server")) {
			softAssert.assertEquals(res.getHeader("server"), "railway");
		}

	}

	@Then("The {string} varify Dummyuser_Update_User responce {int}")
	public void the_varify_dummyuser_update_user_responce(String string, Integer int1) {

	}

	@Then("The {string} varify Dummyuser_Update_User responce {string}")
	public void the_varify_dummyuser_update_user_responce(String string, String string2) {

	}

}
