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

public class C_DummyJsoncarts_Product_CommentGetApi {

	C_DummyCart_DummyData data = new C_DummyCart_DummyData();
	static Response res;
	SoftAssert softAssert = new SoftAssert();
	JsonPath jp;

	@When("dummyJson_carts_Product_Comments_APII using get method")
	public void dummy_json_carts_product_comments_apii_using_get_method() {

		baseURI = "https://dummyjson.com";
		res = given().log().all().header("Authorization",
				"Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MTUsInVzZXJuYW1lIjoia21pbmNoZWxsZSIsImVtYWlsIjoia21pbmNoZWxsZUBxcS5jb20iLCJmaXJzdE5hbWUiOiJKZWFubmUiLCJsYXN0TmFtZSI6IkhhbHZvcnNvbiIsImdlbmRlciI6ImZlbWFsZSIsImltYWdlIjoiaHR0cHM6Ly9yb2JvaGFzaC5vcmcvSmVhbm5lLnBuZz9zZXQ9c2V0NCIsImlhdCI6MTcxNDcxNDA0NiwiZXhwIjoxNzE0NzE3NjQ2fQ.ei8R9jZrJf-of7y3Oqr3uYOFhURzY9u6GIvG-E5ayxk")
				.header("Content-Type", "application/json").contentType(ContentType.JSON).basePath("/posts/2/comments")
				.when().get().then().log().all().header("Content-Type", "application/json; charset=utf-8").extract()
				.response();

		jp = new JsonPath(res.asString());

	}

	@Then("The {string} dummyJson_carts_Product_Comments_APII call got success with status code {int}")
	public void the_dummy_json_carts_product_comments_apii_call_got_success_with_status_code(String httpmethod,
			Integer status_code) {

		if (httpmethod.equalsIgnoreCase("Get")) {
			softAssert.assertEquals(res.statusCode(), status_code);

		}

		softAssert.assertAll();

	}

	@Then("The {string} dummyJson_carts_Product_Comments_APII  varify Responce_Header {string},")
	public void the_dummy_json_carts_product_comments_apii_varify_responce_header(String httpmethod,
			String responce_header) {

		if (httpmethod.equalsIgnoreCase("content-type")) {
			softAssert.assertEquals(res.contentType(), responce_header);

		}

		softAssert.assertAll();

	}

	@Then("The {string} dummyJson_carts_Product_Comments_APII varify Responcee {int}")
	public void the_dummy_json_carts_product_comments_apii_varify_responcee(String httpmethod, Integer respoce) {

		if (httpmethod.equalsIgnoreCase("id1")) {
			softAssert.assertEquals(jp.getInt("comments[0].id"), respoce);

		} else if (httpmethod.equalsIgnoreCase("userid1")) {
			softAssert.assertEquals(jp.getInt("comments[0].user.id"), respoce);

		}else if (httpmethod.equalsIgnoreCase("postId1")) {
			softAssert.assertEquals(jp.getInt("comments[0].postId"), respoce);

		}else if (httpmethod.equalsIgnoreCase("likes1")) {
			softAssert.assertEquals(jp.getInt("comments[0].likes"), respoce);

		}else if (httpmethod.equalsIgnoreCase("id2")) {
			softAssert.assertEquals(jp.getInt("comments[1].id"), respoce);

		}else if (httpmethod.equalsIgnoreCase("postId2")) {
			softAssert.assertEquals(jp.getInt("comments[1].postId"), respoce);

		}else if (httpmethod.equalsIgnoreCase("likes1")) {
			softAssert.assertEquals(jp.getInt("comments[1].likes"), respoce);

		}
		

		softAssert.assertAll();

	}

	@Then("The {string} dummyJson_carts_Product_Comments_APII varify Responce {string}")
	public void the_dummy_json_carts_product_comments_apii_varify_responce(String httpmethod, String responcee) {

		if (httpmethod.equalsIgnoreCase("body1")) {
			softAssert.assertEquals(jp.getString("comments[0].body"), responcee);

		} else if (httpmethod.equalsIgnoreCase("username1")) {
			softAssert.assertEquals(jp.getString("comments[0].user.username"), responcee);

		} else if (httpmethod.equalsIgnoreCase("fullName1")) {
			softAssert.assertEquals(jp.getString("comments[0].user.fullName"), responcee);

		}else if (httpmethod.equalsIgnoreCase("username2")) {
			softAssert.assertEquals(jp.getString("comments[1].user.username"), responcee);

		} else if (httpmethod.equalsIgnoreCase("fullName2")) {
			softAssert.assertEquals(jp.getString("comments[1].user.fullName"), responcee);

		}

		softAssert.assertAll();

	}

}
