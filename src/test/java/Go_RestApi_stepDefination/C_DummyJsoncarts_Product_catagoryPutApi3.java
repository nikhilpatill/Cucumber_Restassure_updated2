package Go_RestApi_stepDefination;

import java.util.HashMap;

import java.util.HashMap;

import org.junit.After;
import org.junit.Assert;
import org.testng.asserts.SoftAssert;

import com.mongodb.util.JSON;

import Hashmap_apiBody.C_DummyCart_DummyData;
import Hashmap_apiBody.C_UpdateDummyCart_DummyData2;
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

public class C_DummyJsoncarts_Product_catagoryPutApi3 {

	C_UpdateDummyCart_DummyData2 data = new C_UpdateDummyCart_DummyData2();
	static Response res;
	SoftAssert softAssert = new SoftAssert();
	JsonPath jp;

	@When("LoginToken dummyJson_carts_Product_catagory_APII using get method")
	public void login_token_dummy_json_carts_product_catagory_apii_using_get_method() {

		baseURI = "https://dummyjson.com/carts/5";
		res = given().log().all().header("Authorization",
				"Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MTUsInVzZXJuYW1lIjoia21pbmNoZWxsZSIsImVtYWlsIjoia21pbmNoZWxsZUBxcS5jb20iLCJmaXJzdE5hbWUiOiJKZWFubmUiLCJsYXN0TmFtZSI6IkhhbHZvcnNvbiIsImdlbmRlciI6ImZlbWFsZSIsImltYWdlIjoiaHR0cHM6Ly9yb2JvaGFzaC5vcmcvSmVhbm5lLnBuZz9zZXQ9c2V0NCIsImlhdCI6MTcxNDcxNDA0NiwiZXhwIjoxNzE0NzE3NjQ2fQ.ei8R9jZrJf-of7y3Oqr3uYOFhURzY9u6GIvG-E5ayxk")
				.header("Content-Type", "application/json").contentType(ContentType.JSON)
				.body(data.mapLogin_User()).when().put().then().log().all()
				.header("Content-Type", "application/json; charset=utf-8").extract().response();

		jp = new JsonPath(res.asString());
		
		
	}

	@Then("The {string} dummyJson_carts_Product_catagory_APII call got success with status code {int}")
	public void the_dummy_json_carts_product_catagory_apii_call_got_success_with_status_code(String httpmethod,
			Integer status_code) {

		if (httpmethod.equalsIgnoreCase("Put")) {
			softAssert.assertEquals(res.getStatusCode(), status_code);

		}

		softAssert.assertAll();

	}

	@Then("The {string} dummyJson_carts_Product_catagory_APII  varify Responce_Header {string},")
	public void the_dummy_json_carts_product_catagory_apii_varify_responce_header(String httpmethod,
			String responce_heade) {

		if (httpmethod.equalsIgnoreCase("post")) {
			softAssert.assertEquals(res.contentType(), responce_heade);

		}

		softAssert.assertAll();

	}

	@Then("The {string} dummyJson_carts_Product_catagory_APII varify Responcee {int}")
	public void the_dummy_json_carts_product_catagory_apii_varify_responcee(String httpmethod, Integer responcee) {

		if (httpmethod.equalsIgnoreCase("id")) {
			softAssert.assertEquals(jp.getInt("id"), responcee);

		}

		softAssert.assertAll();

	}

	@Then("The {string} dummyJson_carts_Product_catagory_APII varify Responce {string}")
	public void the_dummy_json_carts_product_catagory_apii_varify_responce(String httpmethod, String responcee) {

		if (httpmethod.equalsIgnoreCase("title")) {
			softAssert.assertEquals(jp.getString("title"), responcee);

		}

		softAssert.assertAll();

		
		
	}

}