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

public class BDummyuserGetPerticular_use_post_by_idstepdefination {

	Response res;
	JsonPath jp;
	SoftAssert as = new SoftAssert();

	@Given("AllreadyCreated  DummyuserUser_posts_user_id payload")
	public void allready_created_dummyuser_user_posts_user_id_payload() {

	}

	@When("DummyuserUser_posts_user_id API using GET method")
	public void dummyuser_user_posts_user_id_api_using_get_method() {

		baseURI = "https://dummyjson.com";
		res = given().log().all().header("Authorization",
				"Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MTUsInVzZXJuYW1lIjoia21pbmNoZWxsZSIsImVtYWlsIjoia21pbmNoZWxsZUBxcS5jb20iLCJmaXJzdE5hbWUiOiJKZWFubmUiLCJsYXN0TmFtZSI6IkhhbHZvcnNvbiIsImdlbmRlciI6ImZlbWFsZSIsImltYWdlIjoiaHR0cHM6Ly9yb2JvaGFzaC5vcmcvSmVhbm5lLnBuZz9zZXQ9c2V0NCIsImlhdCI6MTcxNDcxNDA0NiwiZXhwIjoxNzE0NzE3NjQ2fQ.ei8R9jZrJf-of7y3Oqr3uYOFhURzY9u6GIvG-E5ayxk")
				.header("Content-Type", "application/json").request().basePath("users/5/posts").contentType(ContentType.JSON).when().get().then().log()
				.all().header("Content-Type", "application/json; charset=utf-8").extract().response();

		jp = new JsonPath(res.asString());

	}

	@Then("The {string} DummyuserUser_posts_user_id API call got success with status code {int}")
	public void the_dummyuser_user_posts_user_id_api_call_got_success_with_status_code(String httpMethod,
			Integer Expected_Statuscode) {

		if (httpMethod.equalsIgnoreCase("Get")) {
			as.assertEquals(res.getStatusCode(), Expected_Statuscode);

		}

	}

	@Then("The {string} DummyuserUser_posts_user_id API  varify Responce_Header {string},")
	public void the_dummyuser_user_posts_user_id_api_varify_responce_header(String responce, String expected) {

		if (responce.equalsIgnoreCase("content-type")) {
			as.assertEquals(res.contentType(), expected);

		}

		else if (responce.equalsIgnoreCase("server")) {
			as.assertEquals(res.header("server"), expected);

		}

	}

	@Then("The varify DummyuserUser_posts_user_id responce")
	public void the_varify_dummyuser_user_posts_user_id_responce() {
		
		
		

	}

}