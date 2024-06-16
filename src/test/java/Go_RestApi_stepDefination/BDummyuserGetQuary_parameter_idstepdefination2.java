package Go_RestApi_stepDefination;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
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

public class BDummyuserGetQuary_parameter_idstepdefination2 {

	Response res;
	JsonPath jp;
	SoftAssert as = new SoftAssert();

	@Given("AllreadyCreated  DummyGetusersQuaryparameterr payload")
	public void allready_created_dummy_getusers_quaryparameterr_payload() {

	}

	@When("DummyGetusersQuaryparameterr API using GET method")
	public void dummy_getusers_quaryparameterr_api_using_get_method() {

		Map<String, String> queryParams = new HashMap<>();
	
		Map<String, String> hair = new HashMap<>();

		hair.put("color", "Brown");
		hair.put("type", "Curly");

		queryParams.put("limit", "3");
		queryParams.put("select", "firstName,age,lastName,maidenName,hair");

		baseURI = "https://dummyjson.com";
		res = given().log().all().header("Authorization",
				"Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MTUsInVzZXJuYW1lIjoia21pbmNoZWxsZSIsImVtYWlsIjoia21pbmNoZWxsZUBxcS5jb20iLCJmaXJzdE5hbWUiOiJKZWFubmUiLCJsYXN0TmFtZSI6IkhhbHZvcnNvbiIsImdlbmRlciI6ImZlbWFsZSIsImltYWdlIjoiaHR0cHM6Ly9yb2JvaGFzaC5vcmcvSmVhbm5lLnBuZz9zZXQ9c2V0NCIsImlhdCI6MTcxNDcxNDA0NiwiZXhwIjoxNzE0NzE3NjQ2fQ.ei8R9jZrJf-of7y3Oqr3uYOFhURzY9u6GIvG-E5ayxk")
				.header("Content-Type", "application/json").request().basePath("/users").queryParams(queryParams)
				.contentType(ContentType.JSON).when().get().then().log().all()
				.header("Content-Type", "application/json; charset=utf-8").extract().response();

		jp = new JsonPath(res.prettyPrint());

		String firstName = jp.getString("users[0].firstName");
		System.out.println(firstName);

		String firstName2 = jp.getString("users[1].firstName");
		System.out.println(firstName2);

		String firstName3 = jp.getString("users[2].firstName");
		System.out.println(firstName2);
		// --------------------------------------------------------------
		String haircolor = jp.getString("users[0].hair.color");
		System.out.println(haircolor);

		String hairtype = jp.getString("users[0].hair.type");
		System.out.println(hairtype);
		// -------------------------------------------------------------
		String haircolor2 = jp.getString("users[1].hair.color");
		System.out.println(haircolor2);

		String hairtype2 = jp.getString("users[1].hair.type");
		System.out.println(hairtype2);

	}

	@Then("The {string} DummyGetusersQuaryparameterr API call got success with status code {int}")
	public void the_dummy_getusers_quaryparameterr_api_call_got_success_with_status_code(String httpmethod,
			Integer statuscode) {

		if (httpmethod.equalsIgnoreCase("Get")) {

			as.assertEquals(res.getStatusCode(), statuscode);
		}

	}

	@Then("The {string} DummyGetusersQuaryparameterr API  varify Responce_Header {string},")
	public void the_dummy_getusers_quaryparameterr_api_varify_responce_header(String httpmethod,
			String responce_header) {

		if (httpmethod.equalsIgnoreCase("content-type")) {
			as.assertEquals(res.contentType(), responce_header);
		} else if (httpmethod.equalsIgnoreCase("server")) {
			as.assertEquals(res.header("server"), responce_header);
		}

	}

	@Then("The {string} varify DummyGetusersQuaryparameterr responce {int}")
	public void the_varify_dummy_getusers_quaryparameterr_responce(String httpmethod, Integer responce) {

		if (httpmethod.equalsIgnoreCase("age")) {
			as.assertEquals(jp.getInt("users[0].age"), responce);
		} else if (httpmethod.equalsIgnoreCase("age2")) {
			as.assertEquals(jp.getInt("users[1].age"), responce);
		} else if (httpmethod.equalsIgnoreCase("age3")) {
			as.assertEquals(jp.getInt("users[2].age"), responce);
		}
		if (httpmethod.equalsIgnoreCase("id")) {
			as.assertEquals(jp.getInt("users[0].id"), responce);
		} else if (httpmethod.equalsIgnoreCase("id2")) {
			as.assertEquals(jp.getInt("users[1].id"), responce);
		} else if (httpmethod.equalsIgnoreCase("id3")) {
			as.assertEquals(jp.getInt("users[2].id"), responce);
		}

		as.assertAll();
	}

	@Then("The {string} varify DummyGetusersQuaryparameterr responce {string}")
	public void the_varify_dummy_getusers_quaryparameterr_responce(String httpmethod, String responce) {

		if (httpmethod.equalsIgnoreCase("hairtype")) {
			as.assertEquals(jp.getString("users[0].hair.type"), responce);
		} else if (httpmethod.equalsIgnoreCase("hairtype2")) {
			as.assertEquals(jp.getString("users[1].hair.type"), responce);
		} else if (httpmethod.equalsIgnoreCase("hairtype3")) {
			as.assertEquals(jp.getString("users[2].hair.type"), responce);
		}

		if (httpmethod.equalsIgnoreCase("haircolor")) {
			as.assertEquals(jp.getString("users[0].hair.color"), responce);
		} else if (httpmethod.equalsIgnoreCase("haircolor2")) {
			as.assertEquals(jp.getString("users[1].hair.color"), responce);
		} else if (httpmethod.equalsIgnoreCase("haircolor3")) {
			as.assertEquals(jp.getString("users[2].hair.color"), responce);
		}

		if (httpmethod.equalsIgnoreCase("firstName")) {
			as.assertEquals(jp.getString("users[0].firstName"), responce);
		} else if (httpmethod.equalsIgnoreCase("firstName2")) {
			String name = jp.getString("users[1].firstName");
			System.out.println(name);
			as.assertEquals(jp.getString("users[1].firstName"), responce);

		} else if (httpmethod.equalsIgnoreCase("firstName3")) {
			String name1 = jp.getString("users[2].firstName");
			System.out.println(name1);

			as.assertEquals(jp.getString("users[2].firstName"), responce);
		}

		// ------------------------------------lastname---------------------------
		else if (httpmethod.equalsIgnoreCase("lastName")) {
			String name = jp.getString("users[0].lastName");
			System.out.println(name);
			as.assertEquals(jp.getString("users[0].lastName"), responce);
		} else if (httpmethod.equalsIgnoreCase("lastName2")) {
			String name = jp.getString("users[1].lastName");
			System.out.println(name);
			as.assertEquals(jp.getString("users[1].lastName"), responce);

		} else if (httpmethod.equalsIgnoreCase("lastName3")) {
			String name1 = jp.getString("users[2].lastName");
			System.out.println(name1);

			as.assertEquals(jp.getString("users[2].lastName"), responce);
		}

		// ------------------------------------maidenName---------------------------
		else if (httpmethod.equalsIgnoreCase("maidenName")) {
			String name = jp.getString("users[0].maidenName");
			System.out.println(name);
			
			as.assertEquals(jp.getString("users[0].maidenName"), responce);
		} else if (httpmethod.equalsIgnoreCase("maidenName2")) {
			String name = jp.getString("users[1].maidenName");
			System.out.println(name);
			as.assertEquals(jp.getString("users[1].maidenName"), responce);
			
		} else if (httpmethod.equalsIgnoreCase("maidenName3")) {
			String name1 = jp.getString("users[2].maidenName");
			System.out.println(name1);

			as.assertEquals(jp.getString("users[2].maidenName"), responce);
		}

		as.assertAll();

	}

}