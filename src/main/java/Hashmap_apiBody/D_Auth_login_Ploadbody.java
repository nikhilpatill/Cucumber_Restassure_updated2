package Hashmap_apiBody;

import java.util.HashMap;

public class D_Auth_login_Ploadbody {

	public static HashMap<String ,Object>  mapLogin_User()
	{
		
		HashMap<String ,Object> data =new  HashMap<String, Object>();
		
		data.put("email", "john@mail.com");
		data.put("password", "changeme");
		
		return data;
		
	}
	
	
	

	

	
}
