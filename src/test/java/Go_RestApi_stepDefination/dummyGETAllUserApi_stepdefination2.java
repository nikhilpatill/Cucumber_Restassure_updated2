package Go_RestApi_stepDefination;

import java.util.HashMap;

import java.util.HashMap;

import org.junit.After;
import org.junit.Assert;
import org.testng.asserts.SoftAssert;

import com.mongodb.util.JSON;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class dummyGETAllUserApi_stepdefination2 {

	static Response res;
	SoftAssert softAssert = new SoftAssert();
	JsonPath jp;
	int userId;

	@Given("AllreadyCreated  DummyuserUser payload")
	public void allready_created_dummyuser_user_payload() {

		System.out.println();
	}

	@When("DummyGetAllUser API using GET method")
	public void dummy_get_all_user_api_using_get_method() {

		baseURI = "https://dummyjson.com/users";
		res = given().log().all().header("Authorization",
				"Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MTUsInVzZXJuYW1lIjoia21pbmNoZWxsZSIsImVtYWlsIjoia21pbmNoZWxsZUBxcS5jb20iLCJmaXJzdE5hbWUiOiJKZWFubmUiLCJsYXN0TmFtZSI6IkhhbHZvcnNvbiIsImdlbmRlciI6ImZlbWFsZSIsImltYWdlIjoiaHR0cHM6Ly9yb2JvaGFzaC5vcmcvSmVhbm5lLnBuZz9zZXQ9c2V0NCIsImlhdCI6MTcxNDcxNDA0NiwiZXhwIjoxNzE0NzE3NjQ2fQ.ei8R9jZrJf-of7y3Oqr3uYOFhURzY9u6GIvG-E5ayxk")
				.header("Content-Type", "application/json").contentType(ContentType.JSON).when().get().then().log()
				.all().header("Content-Type", "application/json; charset=utf-8").extract().response();

		jp = new JsonPath(res.asString());

	}

	@Then("The {string} DummyGetAllUser API call got success with status code {int}")
	public void the_dummy_get_all_user_api_call_got_success_with_status_code(String HttpMethod,
			Integer Expectedstatus_code) {

		if (HttpMethod.equalsIgnoreCase("Get")) {
			softAssert.assertEquals(res.getStatusCode(), Expectedstatus_code);
		}

		softAssert.assertAll();

	}

	@Then("The {string} DummyGetAllUser API  varify Responce_Header {string},")
	public void the_dummy_get_all_user_api_varify_responce_header(String HttpMethod, String responce_header) {

		if (HttpMethod.equalsIgnoreCase("content-type")) {
			softAssert.assertEquals(res.getHeader("content-type"), responce_header);
		}

		softAssert.assertAll();

	}

	@Then("The varify DummyGetAllUser responce")
	public void the_varify_dummy_get_all_user_responce() {

		res.prettyPrint();
		System.out.println("responce body " + res.prettyPrint());

	}

}
