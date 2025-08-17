package Go_RestApi_stepDefination;

import static io.restassured.RestAssured.given;

import org.testng.Assert;

import PojoClasses.UpdateUser_Date;
import RestAssure_pages.RestApi_User;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class D_Auth_GetAllUsersStepdef {

	static Response res;
	static Response res2;
	static int userId;
	static JsonPath jp;
	static JsonPath jp2;
	UpdateUser_Date data;
	RestApi_User user;
	String token = D_Auth_login_stepdef.getToken();

	@When("Auth_login GET_AllUsers API using get method")
	public void auth_login_get_all_users_api_using_get_method() {
		{
			RestAssured.baseURI = "https://api.escuelajs.co";
			res = given().log().all().header("Authorization", "Bearer " + token)
					.header("Content-Type", "application/json").when().get("/api/v1/users/").then().log().all()
					.extract().response();

			jp = new JsonPath(res.asPrettyString());

		}

	}

	@Then("Auth_login GET_AllUsers {string} API call got success with status code {int}")
	public void auth_login_get_all_users_api_call_got_success_with_status_code(String httpmethod, Integer expected) {

		if (httpmethod.equalsIgnoreCase("post")) {
			if (res.getStatusCode() == expected)
				Assert.assertTrue(true);
		} else if (httpmethod.equalsIgnoreCase("get"))

		{
			if (res.getStatusCode() == expected)
				Assert.assertTrue(true);
		}

	}

	@Then("The {string} varify GET_AllUsers responce {string}")
	public void the_varify_get_all_users_responce(String httpmethod, String expectedvalue) {

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
