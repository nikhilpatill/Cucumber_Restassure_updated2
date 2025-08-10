package Go_RestApi_stepDefination;

import java.util.HashMap;
import java.util.List;
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

public class BDummyuserGetQuary_parameter_idstepdefination {

	Response res;
	JsonPath jp;
	SoftAssert as = new SoftAssert();

	@Given("AllreadyCreated  DummyGetusersQuaryparameter payload")
	public void allready_created_dummy_getusers_quaryparameter_payload() {

	}

	@When("DummyGetusersQuaryparameter API using GET method")
	public void dummy_getusers_quaryparameter_api_using_get_method() {

		baseURI = "https://dummyjson.com";
		res = given().log().all().header("Authorization",
				"Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MTUsInVzZXJuYW1lIjoia21pbmNoZWxsZSIsImVtYWlsIjoia21pbmNoZWxsZUBxcS5jb20iLCJmaXJzdE5hbWUiOiJKZWFubmUiLCJsYXN0TmFtZSI6IkhhbHZvcnNvbiIsImdlbmRlciI6ImZlbWFsZSIsImltYWdlIjoiaHR0cHM6Ly9yb2JvaGFzaC5vcmcvSmVhbm5lLnBuZz9zZXQ9c2V0NCIsImlhdCI6MTcxNDcxNDA0NiwiZXhwIjoxNzE0NzE3NjQ2fQ.ei8R9jZrJf-of7y3Oqr3uYOFhURzY9u6GIvG-E5ayxk")
				.header("Content-Type", "application/json").request().basePath("/users/filter").request()
				.queryParam("key", "id").queryParam("value", "1").contentType(ContentType.JSON).when().get().then()
				.log().all().header("Content-Type", "application/json; charset=utf-8").extract().response();

		jp = new JsonPath(res.asString());

		String hairColor = jp.getString("users[0].hair.color");
		System.out.println(hairColor);

		String address = jp.getString("users[0].address.address");
		System.out.println(address);

		String firstName = jp.getString("users[0].firstName");
		System.out.println(firstName);

	}

	@Then("The {string} DummyGetusersQuaryparameter API call got success with status code {int}")
	public void the_dummy_getusers_quaryparameter_api_call_got_success_with_status_code(String httpmethod,
			Integer Exoectedstatus) {

		if (httpmethod.equalsIgnoreCase("Get")) {

			as.assertEquals(res.getStatusCode(), Exoectedstatus);

		}

		as.assertAll();

	}

	@Then("The {string} DummyGetusersQuaryparameter API  varify Responce_Header {string},")
	public void the_dummy_getusers_quaryparameter_api_varify_responce_header(String httpmethod,
			String responce_header) {

		if (httpmethod.equalsIgnoreCase("content-type")) {

			as.assertEquals(res.contentType(), responce_header);

		} else if (httpmethod.equalsIgnoreCase("server")) {

			as.assertEquals(res.header("server"), responce_header);

		}

		as.assertAll();

	}

	@Then("The {string} varify DummyGetusersQuaryparameter responce {int}")
	public void the_varify_dummy_getusers_quaryparameter_responce(String httpmethod, Integer Expectedresponce) {

		if (httpmethod.equalsIgnoreCase("id")) {
			as.assertEquals(jp.getInt("users[0].id"), Expectedresponce);
		}

	}

	@Then("The {string} varify GetperticularUserr responce {string}")
	public void the_varify_getperticular_userr_responce(String httpmethod, String Expectedresponce) {

		if (httpmethod.equalsIgnoreCase("firstName")) {
			as.assertEquals(jp.getString("users[0].firstName"), Expectedresponce);
		} else if (httpmethod.equalsIgnoreCase("lastName")) {
			as.assertEquals(jp.getString("users[0].lastName"), Expectedresponce);
		} else if (httpmethod.equalsIgnoreCase("maidenName")) {
			as.assertEquals(jp.getString("users[0].maidenName"), Expectedresponce);
		} else if (httpmethod.equalsIgnoreCase("gender")) {
			as.assertEquals(jp.getString("users[0].gender"), Expectedresponce);
		} else if (httpmethod.equalsIgnoreCase("email")) {
			as.assertEquals(jp.getString("users[0].email"), Expectedresponce);
		} else if (httpmethod.equalsIgnoreCase("phone")) {
			as.assertEquals(jp.getString("users[0].phone"), Expectedresponce);
		} else if (httpmethod.equalsIgnoreCase("username")) {
			as.assertEquals(jp.getString("users[0].username"), Expectedresponce);
		} else if (httpmethod.equalsIgnoreCase("password")) {
			as.assertEquals(jp.getString("users[0].password"), Expectedresponce);
		} else if (httpmethod.equalsIgnoreCase("bloodGroup")) {
			as.assertEquals(jp.getString("users[0].bloodGroup"), Expectedresponce);
		} else if (httpmethod.equalsIgnoreCase("eyeColor")) {
			as.assertEquals(jp.getString("users[0].eyeColor"), Expectedresponce);
		} else if (httpmethod.equalsIgnoreCase("haircolor")) {
			as.assertEquals(jp.getString("users[0].hair.color"), Expectedresponce);
		} else if (httpmethod.equalsIgnoreCase("hairtype")) {
			as.assertEquals(jp.getString("users[0].hair.type"), Expectedresponce);
		} else if (httpmethod.equalsIgnoreCase("address")) {
			as.assertEquals(jp.getString("users[0].address.address"), Expectedresponce);
		} else if (httpmethod.equalsIgnoreCase("city")) {
			as.assertEquals(jp.getString("users[0].address.city"), Expectedresponce);
		}

		else if (httpmethod.equalsIgnoreCase("macAddress")) {
			as.assertEquals(jp.getString("users[0].macAddress"), Expectedresponce);
		} else if (httpmethod.equalsIgnoreCase("university")) {
			as.assertEquals(jp.getString("users[0].university"), Expectedresponce);
		} else if (httpmethod.equalsIgnoreCase("cardExpire")) {
			as.assertEquals(jp.getString("users[0].bank.cardExpire"), Expectedresponce);
		} else if (httpmethod.equalsIgnoreCase("cardNumber")) {
			as.assertEquals(jp.getString("users[0].bank.cardNumber"), Expectedresponce);
		} else if (httpmethod.equalsIgnoreCase("cardType")) {
			as.assertEquals(jp.getString("users[0].bank.cardType"), Expectedresponce);
		} else if (httpmethod.equalsIgnoreCase("currency")) {
			as.assertEquals(jp.getString("users[0].bank.currency"), Expectedresponce);
		} else if (httpmethod.equalsIgnoreCase("iban")) {
			as.assertEquals(jp.getString("users[0].bank.iban"), Expectedresponce);
		}

		as.assertAll();

	}

	@Then("The {string} varify GetperticularUserr responce {int}")
	public void the_varify_getperticular_userr_responce(String httpmethod, Integer Expectedresponce) {

		if (httpmethod.equalsIgnoreCase("age")) {
			as.assertEquals(jp.getInt("users[0].age"), Expectedresponce);
		}

		as.assertAll();

	}

	@Then("The {string} varify GetperticularUserr responcee {double}")
	public void the_varify_getperticular_userr_responcee(String httpmethod, Double Expectedresponce) {

		if (httpmethod.equalsIgnoreCase("lat")) {
			as.assertEquals(jp.getDouble("users[0].address.coordinates.lat"), Expectedresponce);
		} else if (httpmethod.equalsIgnoreCase("lng")) {
			as.assertEquals(jp.getDouble("users[0].address.coordinates.lng"), Expectedresponce);
		}

	}

}