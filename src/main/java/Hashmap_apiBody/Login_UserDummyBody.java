package Hashmap_apiBody;

import java.util.HashMap;

public class Login_UserDummyBody {

	public HashMap<String ,Object>  mapLogin_User(String username, String password)
	{
		
		HashMap<String ,Object> data =new  HashMap<String, Object>();
		
		data.put("username", "emilys");
		data.put("password", "emilyspass");
		
		return data;
		
	}
	
	
	

	

	
}
