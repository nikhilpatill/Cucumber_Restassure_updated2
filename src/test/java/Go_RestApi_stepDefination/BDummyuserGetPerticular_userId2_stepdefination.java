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

public class BDummyuserGetPerticular_userId2_stepdefination {

	Login_UserDummyBody LoginData;
	static Response res;
	SoftAssert softAssert = new SoftAssert();
	JsonPath jp;
	int userId;

	@Given("AllreadyCreated  GetperticularUserID payload")
	public void allready_created_getperticular_user_id_payload() {

	}

	@When("GetperticularUserID API using GET method")
	public void getperticular_user_id_api_using_get_method() {

		baseURI = "https://dummyjson.com";
		res = given().log().all().header("Authorization",
				"Bearer eyJpZCI6MTUsInVzZXJuYW1lIjoia21pbmNoZWxsZSIsImVtYWlsIjoia21pbmNoZWxsZUBxcS5jb20iLCJmaXJzdE5hbWUiOiJKZWFubmUiLCJsYXN0TmFtZSI6IkhhbHZvcnNvbiIsImdlbmRlciI6ImZlbWFsZSIsImltYWdlIjoiaHR0cHM6Ly9yb2JvaGFzaC5vcmcvSmVhbm5lLnBuZz9zZXQ9c2V0NCIsImlhdCI6MTcxNDk4NzkzMywiZXhwIjoxNzE0OTkxNTMzfQ.qxcAxOIkMPefmw6WduxTSmrWEKYu5PfoGHNUn8iJ8qY")
				.pathParam("path1", "users").pathParam("path2", 5).header("Content-Type", "application/json")
				.contentType(ContentType.JSON).when().get("{path1}/{path2}").then().log().all()
				.header("Content-Type", "application/json; charset=utf-8").extract().response();

		jp = new JsonPath(res.asString());

	}

	@Then("The {string} GetperticularUserID API call got success with status code {int}")
	public void the_getperticular_user_id_api_call_got_success_with_status_code(String HttpMethod,
			Integer status_code) {

		if (HttpMethod.equalsIgnoreCase("Get")) {
			softAssert.assertEquals(res.getStatusCode(), status_code);
		}

	}

	@Then("The {string} GetperticularUserID API  varify Responce_Header {string},")
	public void the_getperticular_user_id_api_varify_responce_header(String HttpMrthod, String responce_header) {

		if (HttpMrthod.equalsIgnoreCase("content-type")) {
			softAssert.assertEquals(res.header("content-type"), responce_header);
		} else if (HttpMrthod.equalsIgnoreCase("server")) {
			softAssert.assertEquals(res.header("server"), responce_header);
		}

		softAssert.assertAll();
	}

	@Then("The {string} varify GetperticularUserID responce {int}")
	public void the_varify_getperticular_user_id_responce(String HttpMrthod, Integer responce) {

		if (HttpMrthod.equalsIgnoreCase("id")) {
			softAssert.assertEquals(jp.getInt("id"), responce);
		} else if (HttpMrthod.equalsIgnoreCase("age")) {
			softAssert.assertEquals(jp.getInt("age"), responce);
		}

		softAssert.assertAll();

	}

	@Then("The {string} varify GetperticularUser responce {string}")
	public void the_varify_getperticular_user_responce(String HttpMrthod, String responce) {

		if (HttpMrthod.equalsIgnoreCase("firstName")) {
			softAssert.assertEquals(jp.getString("firstName"), responce);
		} else if (HttpMrthod.equalsIgnoreCase("lastName")) {
			softAssert.assertEquals(jp.getString("lastName"), responce);
		} else if (HttpMrthod.equalsIgnoreCase("maidenName")) {
			softAssert.assertEquals(jp.getString("maidenName"), responce);
		} else if (HttpMrthod.equalsIgnoreCase("gender")) {
			softAssert.assertEquals(jp.getString("gender"), responce);
		} else if (HttpMrthod.equalsIgnoreCase("email")) {
			softAssert.assertEquals(jp.getString("email"), responce);
		} else if (HttpMrthod.equalsIgnoreCase("phone")) {
			softAssert.assertEquals(jp.getString("phone"), responce);
		} else if (HttpMrthod.equalsIgnoreCase("username")) {
			softAssert.assertEquals(jp.getString("username"), responce);
		} else if (HttpMrthod.equalsIgnoreCase("password")) {
			softAssert.assertEquals(jp.getString("password"), responce);
		} else if (HttpMrthod.equalsIgnoreCase("bloodGroup")) {
			softAssert.assertEquals(jp.getString("bloodGroup"), responce);
			System.out.println();
		} else if (HttpMrthod.equalsIgnoreCase("eyeColor")) {
			softAssert.assertEquals(jp.getString("eyeColor"), responce);
		}
		
		

		else if (HttpMrthod.equalsIgnoreCase("haircolor")) {
			HashMap<String, Object> data = jp.get("hair");
			System.out.println("hair:" + data);
			System.out.println("color" + data.get("color"));
			softAssert.assertEquals(data.get("color"), responce);
		} else if (HttpMrthod.equalsIgnoreCase("hairtype")) {

			HashMap<String, Object> data = jp.get("hair");
			System.out.println("hair" + data);
			System.out.println("Type:" + data.get("type"));
			softAssert.assertEquals(data.get("type"), responce);
		} else if (HttpMrthod.equalsIgnoreCase("address")) {

			HashMap<String, Object> data = jp.get("address");
			System.out.println("address :" + data);
			System.out.println("address" + data.get("address"));
			softAssert.assertEquals(data.get("address"), responce);
		} else if (HttpMrthod.equalsIgnoreCase("city")) {

			HashMap<String, Object> data = jp.get("address");
			System.out.println("address:" + data);
			System.out.println("City:" + data.get("city"));
			softAssert.assertEquals(data.get("city"), responce);
		}
		else if (HttpMrthod.equalsIgnoreCase("postalCode")) {

			HashMap<String, Object> data = jp.get("address");
			System.out.println("address:" + data);
			System.out.println("postalCode:" + data.get("postalCode"));
			softAssert.assertEquals(data.get("postalCode"), responce);
		}
		else if (HttpMrthod.equalsIgnoreCase("state")) {

			HashMap<String, Object> data = jp.get("address");
			System.out.println("address:" + data);
			System.out.println("state:" + data.get("state"));
			softAssert.assertEquals(data.get("state"), responce);
		}
		
		

		else if (HttpMrthod.equalsIgnoreCase("macAddress")) {

			String macAddress = jp.getString("macAddress");
			System.out.println("macAddress:" + macAddress);
			softAssert.assertEquals(macAddress, responce);

		} else if (HttpMrthod.equalsIgnoreCase("university")) {

			String university = jp.getString("university");
			System.out.println("university:" + university);
			softAssert.assertEquals(university, responce);

		}

		else if (HttpMrthod.equalsIgnoreCase("cardExpire")) {
			HashMap<String, Object> data = jp.get("bank");
			System.out.println("bank :" + data);
			String cardExpire1 = (String) data.get("cardExpire");
			System.out.println(cardExpire1);
			System.out.println("cardExpire :" + data.get("cardExpire"));
			softAssert.assertEquals(cardExpire1, responce);

		} else if (HttpMrthod.equalsIgnoreCase("cardNumber")) {
			HashMap<String, Object> data = jp.get("bank");
			System.out.println("bank :" + data);
			String cardNumber = (String) data.get("cardNumber");
			System.out.println("cardNumber : " + cardNumber);
			System.out.println("cardNumber :" + data.get("cardNumber"));
			softAssert.assertEquals(cardNumber, responce);

		}

		else if (HttpMrthod.equalsIgnoreCase("cardType")) {
			HashMap<String, Object> data = jp.get("bank");
			System.out.println("Bank " + data);
			String cardType = (String) data.get("cardType");
			System.out.println("cardType :" + cardType);
			System.out.println("cardType :" + data.get("cardType"));
			softAssert.assertEquals(cardType, responce);

		} else if (HttpMrthod.equalsIgnoreCase("currency")) {
			HashMap<String, Object> data = jp.get("bank");
			System.out.println("Bank " + data);
			String currency = (String) data.get("currency");
			System.out.println("currency :" + currency);
			System.out.println("currency :" + data.get("currency"));
			softAssert.assertEquals(currency, responce);

		} else if (HttpMrthod.equalsIgnoreCase("iban")) {
			HashMap<String, Object> data = jp.get("bank");
			System.out.println("Bank " + data);
			String iban = (String) data.get("iban");
			System.out.println("iban :" + iban);
			System.out.println("iban :" + data.get("iban"));
			softAssert.assertEquals(iban, responce);

		} else if (HttpMrthod.equalsIgnoreCase("Company_address")) {
			HashMap<String, Object> data = jp.get("company");
			System.out.println("company " + data);

			HashMap<String, Object> data2 = (HashMap<String, Object>) data.get("address");

			System.out.println("address :" + data2);
			String address = (String) data2.get("address");
			System.out.println("address :" + data2.get("address"));
			softAssert.assertEquals(address, responce);

		} else if (HttpMrthod.equalsIgnoreCase("Company_city")) {
			HashMap<String, Object> data = jp.get("company");
			System.out.println("company " + data);

			HashMap<String, Object> data2 = (HashMap<String, Object>) data.get("address");

			System.out.println("address :" + data2);
			String city = (String) data2.get("city");
			System.out.println("city :" + data2.get("city"));
			softAssert.assertEquals(city, responce);

		} else if (HttpMrthod.equalsIgnoreCase("Company_city")) {
			HashMap<String, Object> data = jp.get("company");
			System.out.println("company " + data);

			HashMap<String, Object> data2 = (HashMap<String, Object>) data.get("address");

			System.out.println("address :" + data2);
			String city = (String) data2.get("city");
			System.out.println("city :" + data2.get("city"));
			softAssert.assertEquals(city, responce);

		}

		softAssert.assertAll();
	}

	@Then("The {string} varify GetperticularUser responcee {double}")
	public void the_varify_getperticular_user_responcee(String HttpMrthod, Object responce) {

		if (HttpMrthod.equalsIgnoreCase("lat")) {

			HashMap<String, Object> data = jp.get("address");
			System.out.println(data);
			HashMap<String, Object> data2 = (HashMap<String, Object>) data.get("coordinates");
			System.out.println(data2);
			System.out.println(data2.get("lat"));
			if (data2.get("lat").equals(responce)) {
				softAssert.assertSame(data2.get("lat"), responce, "Both areame ");
			}
		}

		else if (HttpMrthod.equalsIgnoreCase("lng")) {

			HashMap<String, Object> data = jp.get("address");
			System.out.println("address {" + data + "}");
			HashMap<String, Object> data2 = (HashMap<String, Object>) data.get("coordinates");
			System.out.println("coordinates {" + data2 + "}");

			System.out.println("lng :" + data2.get("lng"));
			Object da = data2.get("lng");
			if(da.toString().equals(responce))
			{
				softAssert.assertEquals(data2.get("lng"), responce);
			}
			
			
		}

		else if (HttpMrthod.equalsIgnoreCase("Company_lat")) {
			HashMap<String, Object> data = jp.get("company");
			System.out.println("company " + data);

			HashMap<String, Object> data2 = (HashMap<String, Object>) data.get("address");
			System.out.println("address :" + data2);
			HashMap<String, Object> data3 = (HashMap<String, Object>) data2.get("coordinates");

			System.out.println("coordinates :" + data3);

			System.out.println("lat :" + data3.get("lat"));
			if (data3.get("lat").equals(responce)) {
				softAssert.assertSame(data2.get("lat"), responce, "Both areame ");
			}
		}

		else if (HttpMrthod.equalsIgnoreCase("Company_lng")) {
			HashMap<String, Object> data = jp.get("company");
			System.out.println("company " + data);

			HashMap<String, Object> data2 = (HashMap<String, Object>) data.get("address");
			System.out.println("address :" + data2);
			HashMap<String, Object> data3 = (HashMap<String, Object>) data2.get("coordinates");

			System.out.println("coordinates :" + data3);

			System.out.println("lng :" + data3.get("lng"));
			if (data3.get("lng").equals(responce)) {
				softAssert.assertSame(data2.get("lng"), responce, "Both areame ");
			}
		}

		softAssert.assertAll();
	}

}
