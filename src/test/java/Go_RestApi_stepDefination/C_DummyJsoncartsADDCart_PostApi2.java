package Go_RestApi_stepDefination;

import java.util.HashMap;

import java.util.HashMap;

import org.junit.After;
import org.junit.Assert;
import org.testng.asserts.SoftAssert;

import com.mongodb.util.JSON;

import Hashmap_apiBody.C_ADDDummyCart_DummyData3;
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

public class C_DummyJsoncartsADDCart_PostApi2 {

	C_ADDDummyCart_DummyData3 data = new C_ADDDummyCart_DummyData3();
	static Response res;
	SoftAssert softAssert = new SoftAssert();
	JsonPath jp;

	@When("LoginToken dummyJson_ADD_Cart_APII using get method")
	public void login_token_dummy_json_add_cart_apii_using_get_method() {

		baseURI = "https://dummyjson.com";
		res = given().log().all().header("Authorization",
				"Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MTUsInVzZXJuYW1lIjoia21pbmNoZWxsZSIsImVtYWlsIjoia21pbmNoZWxsZUBxcS5jb20iLCJmaXJzdE5hbWUiOiJKZWFubmUiLCJsYXN0TmFtZSI6IkhhbHZvcnNvbiIsImdlbmRlciI6ImZlbWFsZSIsImltYWdlIjoiaHR0cHM6Ly9yb2JvaGFzaC5vcmcvSmVhbm5lLnBuZz9zZXQ9c2V0NCIsImlhdCI6MTcxNDcxNDA0NiwiZXhwIjoxNzE0NzE3NjQ2fQ.ei8R9jZrJf-of7y3Oqr3uYOFhURzY9u6GIvG-E5ayxk")
				.header("Content-Type", "application/json").contentType(ContentType.JSON).basePath("/carts/add")
				.body(data.addCartData()).when().post().then().log().all()
				.header("Content-Type", "application/json; charset=utf-8").extract().response();

		jp = new JsonPath(res.asString());

	}

	@Then("The {string} dummyJson_ADD_Cart_APII varify Responceeid {int}")
	public void the_dummy_json_add_cart_apii_varify_responceeid(String httpmmethod, Integer Responceee) {

		if (httpmmethod.equalsIgnoreCase("id")) {

			softAssert.assertEquals(jp.getInt("id"), Responceee);

		}

		softAssert.assertAll();

	}

	@Then("The {string} dummyJson_ADD_Cart_APII varify ProductResponce {int}")
	public void the_dummy_json_add_cart_apii_varify_product_responce(String httpmmethod, Integer Responceee) {

		if (httpmmethod.equalsIgnoreCase("quantity")) {

			softAssert.assertEquals(jp.getInt("products[0].quantity"), Responceee);

		} else if (httpmmethod.equalsIgnoreCase("discountedPrice")) {

			softAssert.assertEquals(jp.getInt("products[0].discountedPrice"), Responceee);

		} else if (httpmmethod.equalsIgnoreCase("quantity2")) {

			softAssert.assertEquals(jp.getInt("products[1].quantity"), Responceee);

		}

		else if (httpmmethod.equalsIgnoreCase("discountedPrice2")) {

			softAssert.assertEquals(jp.getInt("products[1].discountedPrice"), Responceee);

		}

		softAssert.assertAll();

	}

	@Then("The {string} dummyJson_ADD_Cart_APII varify ProductResponcee {double}")
	public void the_dummy_json_add_cart_apii_varify_product_responcee(String httpmmethod, Double product_responcee) {

		if (httpmmethod.equalsIgnoreCase("Producttotal")) {

			softAssert.assertEquals(jp.getDouble("products[0].total"), product_responcee);
		}

		else if (httpmmethod.equalsIgnoreCase("price")) {

			softAssert.assertEquals(jp.getDouble("products[0].price"), product_responcee);
		} else if (httpmmethod.equalsIgnoreCase("discountPercentage")) {

			softAssert.assertEquals(jp.getDouble("products[0].discountPercentage"), product_responcee);
		} else if (httpmmethod.equalsIgnoreCase("Producttotal2")) {

			softAssert.assertEquals(jp.getDouble("products[1].total"), product_responcee);
		} else if (httpmmethod.equalsIgnoreCase("price2")) {

			softAssert.assertEquals(jp.getDouble("products[1].price"), product_responcee);
		}

		else if (httpmmethod.equalsIgnoreCase("discountPercentage2")) {

			softAssert.assertEquals(jp.getDouble("products[1].discountPercentage"), product_responcee);
		}

		softAssert.assertAll();

	}

	@Then("The {string} dummyJson_ADD_Cart_APII varify ResponceediscountedTotal {int}")
	public void the_dummy_json_add_cart_apii_varify_responceediscounted_total(String httpmmethod,
			Integer responceediscounted_total) {

		if (httpmmethod.equalsIgnoreCase("discountedTotal")) {

			softAssert.assertEquals(jp.getInt("discountedTotal"), responceediscounted_total);
		}
		softAssert.assertAll();

	}

	@Then("The {string} dummyJson_ADD_Cart_APII varify ResponceeuserId {int}")
	public void the_dummy_json_add_cart_apii_varify_responceeuser_id(String httpmmethod, Integer responceeuser_id) {

		if (httpmmethod.equalsIgnoreCase("userId")) {

			softAssert.assertEquals(jp.getInt("userId"), responceeuser_id);
		}
		softAssert.assertAll();

	}

	@Then("The {string} dummyJson_ADD_Cart_APII varify ResponceetotalProducts {int}")
	public void the_dummy_json_add_cart_apii_varify_responceetotal_products(String httpmmethod,
			Integer responceetotal_products) {

		if (httpmmethod.equalsIgnoreCase("totalProducts")) {

			softAssert.assertEquals(jp.getInt("totalProducts"), responceetotal_products);
		}

		softAssert.assertAll();

	}

	@Then("The {string} dummyJson_ADD_Cart_APII varify ResponceetotalQuantity {int}")
	public void the_dummy_json_add_cart_apii_varify_responceetotal_quantity(String httpmmethod,
			Integer responceetotal_quantity) {

		if (httpmmethod.equalsIgnoreCase("totalQuantity")) {

			softAssert.assertEquals(jp.getInt("totalQuantity"), responceetotal_quantity);
		}

		softAssert.assertAll();

	}

	@Then("The {string} dummyJson_ADD_Cart_APII call got success with status code {int}")
	public void the_dummy_json_add_cart_apii_call_got_success_with_status_code(String httpmmethod,
			Integer status_code) {

		if (httpmmethod.equalsIgnoreCase("Post")) {

			softAssert.assertEquals(res.statusCode(), status_code);
		}

		softAssert.assertAll();

	}

	@Then("The {string} dummyJson_ADD_Cart_APII  varify Responce_Header {string},")
	public void the_dummy_json_add_cart_apii_varify_responce_header(String httpmmethod, String responce_header) {

		if (httpmmethod.equalsIgnoreCase("content-type")) {

			softAssert.assertEquals(res.contentType(), responce_header);
		}

		softAssert.assertAll();
	}

	@Then("The {string} dummyJson_ADD_Cart_APII varify Responcee {double}")
	public void the_dummy_json_add_cart_apii_varify_responcee(String httpmmethod, Double Responcee) {

		if (httpmmethod.equalsIgnoreCase("total")) {

			softAssert.assertEquals(jp.getDouble("total"), Responcee);
		}

		softAssert.assertAll();
	}

	@Then("The {string} dummyJson_ADD_Cart_APII varify Responce {string}")
	public void the_dummy_json_add_cart_apii_varify_responce(String httpmmethod, String Responce) {

		if (httpmmethod.equalsIgnoreCase("content-type")) {

			softAssert.assertEquals(res.contentType(), Responce);
		} else if (httpmmethod.equalsIgnoreCase("Product_title")) {

			softAssert.assertEquals(jp.getString("products[0].title"), Responce);
		}

		else if (httpmmethod.equalsIgnoreCase("Product_title2")) {

			softAssert.assertEquals(jp.getString("products[1].title"), Responce);
		}

		softAssert.assertAll();
	}

}
