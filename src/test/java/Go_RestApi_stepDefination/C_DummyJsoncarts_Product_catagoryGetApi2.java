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

public class C_DummyJsoncarts_Product_catagoryGetApi2 {

	C_DummyCart_DummyData data = new C_DummyCart_DummyData();
	static Response res;
	SoftAssert softAssert = new SoftAssert();
	JsonPath jp;

	@When("LoginToken dummyJson_carts_Product_catagory_API using get method")
	public void login_token_dummy_json_carts_product_catagory_api_using_get_method() {

		baseURI = "https://dummyjson.com";
		res = given().log().all().header("Authorization",
				"Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MTUsInVzZXJuYW1lIjoia21pbmNoZWxsZSIsImVtYWlsIjoia21pbmNoZWxsZUBxcS5jb20iLCJmaXJzdE5hbWUiOiJKZWFubmUiLCJsYXN0TmFtZSI6IkhhbHZvcnNvbiIsImdlbmRlciI6ImZlbWFsZSIsImltYWdlIjoiaHR0cHM6Ly9yb2JvaGFzaC5vcmcvSmVhbm5lLnBuZz9zZXQ9c2V0NCIsImlhdCI6MTcxNDcxNDA0NiwiZXhwIjoxNzE0NzE3NjQ2fQ.ei8R9jZrJf-of7y3Oqr3uYOFhURzY9u6GIvG-E5ayxk")
				.header("Content-Type", "application/json").request().basePath("/products/categories").request()
				.contentType(ContentType.JSON).when().get().then().log().all()
				.header("Content-Type", "application/json; charset=utf-8").extract().response();

		jp = new JsonPath(res.asString());

		String name = jp.getString("slug[0]");

		System.out.println(name);
	}

	@Then("The {string} dummyJson_carts_Product_catagory_API call got success with status code {int}")
	public void the_dummy_json_carts_product_catagory_api_call_got_success_with_status_code(String httpmethod,
			Integer status_code) {

		if (httpmethod.equalsIgnoreCase("post")) {
			softAssert.assertEquals(res.getStatusCode(), status_code);

		}

		softAssert.assertAll();

	}

	@Then("The {string} dummyJson_carts_Product_catagory_API  varify Responce_Header {string},")
	public void the_dummy_json_carts_product_catagory_api_varify_responce_header(String httpmethod, String responce) {

		if (httpmethod.equalsIgnoreCase("content-type")) {
			softAssert.assertEquals(res.contentType(), responce);

		}

		softAssert.assertAll();

	}

	@Then("The {string} dummyJson_carts_Product_catagory_API varify Responce {string}")
	public void the_dummy_json_carts_product_catagory_api_varify_responce(String httpmethod, String responce) {

		if (httpmethod.equalsIgnoreCase("slug")) {
			softAssert.assertEquals(jp.getString("slug[0]"), responce);

		} else if (httpmethod.equalsIgnoreCase("name")) {
			softAssert.assertEquals(jp.getString("name[0]"), responce);

		}

		 else if (httpmethod.equalsIgnoreCase("slug1")) {
			softAssert.assertEquals(jp.getString("slug[1]"), responce);

		} else if (httpmethod.equalsIgnoreCase("name1")) {
			softAssert.assertEquals(jp.getString("name[1]"), responce);

		}
		
		else if (httpmethod.equalsIgnoreCase("slug2")) {
			softAssert.assertEquals(jp.getString("slug[2]"), responce);

		} else if (httpmethod.equalsIgnoreCase("name2")) {
			softAssert.assertEquals(jp.getString("name[2]"), responce);

		}
		
		else if (httpmethod.equalsIgnoreCase("slug3")) {
			softAssert.assertEquals(jp.getString("slug[3]"), responce);

		} else if (httpmethod.equalsIgnoreCase("name3")) {
			softAssert.assertEquals(jp.getString("name[3]"), responce);

		}
		
		else if (httpmethod.equalsIgnoreCase("slug4")) {
			softAssert.assertEquals(jp.getString("slug[4]"), responce);

		} else if (httpmethod.equalsIgnoreCase("name4")) {
			softAssert.assertEquals(jp.getString("name[4]"), responce);

		}

		else if (httpmethod.equalsIgnoreCase("slug5")) {
			softAssert.assertEquals(jp.getString("slug[5]"), responce);

		} else if (httpmethod.equalsIgnoreCase("name5")) {
			softAssert.assertEquals(jp.getString("name[5]"), responce);

		}
		
		else if (httpmethod.equalsIgnoreCase("slug6")) {
			softAssert.assertEquals(jp.getString("slug[6]"), responce);

		} else if (httpmethod.equalsIgnoreCase("name6")) {
			softAssert.assertEquals(jp.getString("name[6]"), responce);

		}

		softAssert.assertAll();
	}

}
