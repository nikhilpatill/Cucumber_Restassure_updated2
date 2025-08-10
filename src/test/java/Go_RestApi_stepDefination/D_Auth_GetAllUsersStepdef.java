package Go_RestApi_stepDefination;

import java.util.HashMap;

import org.junit.After;
import org.junit.Assert;

import Hashmap_apiBody.D_Auth_login_Ploadbody;
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
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

public class D_Auth_GetAllUsersStepdef {

	static Response res;
	static Response res2;
	static int userId;
	static JsonPath jp;
	static JsonPath jp2;
	UpdateUser_Date data;
	RestApi_User user;
	String token = D_Auth_login_stepdef.getToken();
	
}

	