package Cucumber.Option;

import org.junit.runner.RunWith;

import Go_RestApi_stepDefination.D_Auth_login_stepdef;
import io.cucumber.java.Before;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


public class Hooks {

	  @Before(order =1)
	    public void setupToken() {
		  D_Auth_login_stepdef.getToken(); // generate at the beginning
	    }
	
}
