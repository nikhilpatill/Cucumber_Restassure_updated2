package Go_RestApi_stepDefination;

import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;

import PojoClasses.UpdateUser_Date;
import RestAssure_pages.RestApi_User;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class D_Auth_GetAlluser_role_customer_QueryparamStepdef {

	static Response res;
	static Response res2;
	static int userId;
	static JsonPath jp;
	static JsonPath jp2;
	UpdateUser_Date data;
	RestApi_User user;
	String token = D_Auth_login_stepdef.getToken();
	
	
	@When("Auth_login GET_AllUsers_role_custome API using get method")
	public void auth_login_get_all_users_role_custome_api_using_get_method()
	{
		Map<String, Object> params = new HashMap<>();
		params.put("limit", 5);
		params.put("role", "customer");
		
		RestAssured.baseURI = "https://api.escuelajs.co";
		res = given().log().all().header("Authorization", "Bearer " + token).header("Content-Type", "application/json")
				.basePath("/api/v1/users/").request().queryParams(params) .when().get()
				.then().log().all().extract().response();

		jp = new JsonPath(res.asPrettyString());

	}

	@Then("Auth_login GET_AllUsers_role_customer {string} API call got success with status code {int}")
	public void auth_login_get_all_users_role_customer_api_call_got_success_with_status_code(String string,
			Integer int1) {

	}

	@Then("The {string} varify GET_AllUsers_role_customer responce {string}")
	public void the_varify_get_all_users_role_customer_responce(String httpmethod, String expectedvalue) {
		
			if (httpmethod.equalsIgnoreCase("id")) {

				if (jp.getString("id[0]").equalsIgnoreCase(expectedvalue)) {
					Assert.assertTrue(true);
				}
			}

			else if (httpmethod.equalsIgnoreCase("email")) {

				if (jp.getString("email[0]").equalsIgnoreCase(expectedvalue)) {

					Assert.assertTrue(true);
				}
			}

			else if (httpmethod.equalsIgnoreCase("password")) {

				if (jp.getString("password[0]").equalsIgnoreCase(expectedvalue)) {

					Assert.assertTrue(true);
				}
			}

			else if (httpmethod.equalsIgnoreCase("name")) {
				if (jp.getString("name[0]").equalsIgnoreCase(expectedvalue)) {

					Assert.assertTrue(true);
				}
			} else if (httpmethod.equalsIgnoreCase("role")) {
				if (jp.getString("role[0]").equalsIgnoreCase(expectedvalue)) {

					Assert.assertTrue(true);
				}
			} else if (httpmethod.equalsIgnoreCase("avatar")) {
				if (jp.getString("avatar[0]").equalsIgnoreCase(expectedvalue)) {

					Assert.assertTrue(true);

				}
			} else if (httpmethod.equalsIgnoreCase("creationAt")) {
				if (jp.getString("creationAt[0]").equalsIgnoreCase(expectedvalue)) {

					Assert.assertTrue(true);
				}
			}

			else if (httpmethod.equalsIgnoreCase("updatedAt")) {
				if (jp.getString("updatedAt[0]").equalsIgnoreCase(expectedvalue)) {

					Assert.assertTrue(true);
				}
			}

			if (httpmethod.equalsIgnoreCase("id1")) {

				if (jp.getString("id[1]").equalsIgnoreCase(expectedvalue)) {
					Assert.assertTrue(true);
				}
			}

			else if (httpmethod.equalsIgnoreCase("email1")) {

				if (jp.getString("email[1]").equalsIgnoreCase(expectedvalue)) {

					Assert.assertTrue(true);
				}
			}

			else if (httpmethod.equalsIgnoreCase("password1")) {

				if (jp.getString("password[1]").equalsIgnoreCase(expectedvalue)) {

					Assert.assertTrue(true);
				}
			}

			else if (httpmethod.equalsIgnoreCase("name1")) {
				if (jp.getString("name[1]").equalsIgnoreCase(expectedvalue)) {

					Assert.assertTrue(true);
				}
			} else if (httpmethod.equalsIgnoreCase("role1")) {
				if (jp.getString("role[1]").equalsIgnoreCase(expectedvalue)) {

					Assert.assertTrue(true);
				}
			} else if (httpmethod.equalsIgnoreCase("avatar1")) {
				if (jp.getString("avatar[1]").equalsIgnoreCase(expectedvalue)) {

					Assert.assertTrue(true);

				}
			} else if (httpmethod.equalsIgnoreCase("creationAt1")) {
				if (jp.getString("creationAt[1]").equalsIgnoreCase(expectedvalue)) {

					Assert.assertTrue(true);
				}
			}

			else if (httpmethod.equalsIgnoreCase("updatedAt1")) {
				if (jp.getString("updatedAt[1]").equalsIgnoreCase(expectedvalue)) {

					Assert.assertTrue(true);
				}
			}

		

	}

}
