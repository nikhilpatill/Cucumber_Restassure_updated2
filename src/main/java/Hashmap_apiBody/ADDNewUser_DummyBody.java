package Hashmap_apiBody;

import java.util.HashMap;

public class ADDNewUser_DummyBody {

	public HashMap<String, Object> mapLogin_User() {

		HashMap<String, Object> data = new HashMap<String, Object>();

		data.put("id", 101);
		data.put("firstName", "nikhil");
		data.put("lastName", "patil");
		data.put("maidenName", "ganesh");
		data.put("age", 23);
		data.put("gender", "male");
		data.put("email", "nikhil2020@gmail.com");
		data.put("phone", "7798260576");
		data.put("username", "devloper_user");
		data.put("password", "Welcomew");
		data.put("birthDate", "12/2/2024");
		data.put("bloodGroup", "A+");
		data.put("height", "125m");
		data.put("weight", "125kg");
		data.put("eyeColor", "black");

		HashMap<String, Object> hair = new HashMap<String, Object>();

		hair.put("color", "black");
		hair.put("type", "roundshap");

		data.put("hair", hair);
		data.put("domain", "banking");
		data.put("ip", "123.939392.002");

		HashMap<String, Object> address = new HashMap<String, Object>();

		address.put("address", "pune wastan highway");
		address.put("city", "mumbai");
		address.put("postalCode", "123123");
		address.put("state", "maharastra");

		HashMap<String, Object> coordinates = new HashMap<String, Object>();
		coordinates.put("lat", 1234);
		coordinates.put("lng", 12345);

		address.put("coordinates", coordinates);
		data.put("address", address);
		data.put("macAddress", "888");
		data.put("university", "pune");

		HashMap<String, Object> bank = new HashMap<String, Object>();
		bank.put("cardExpire", "12/2/2024");
		bank.put("cardNumber", "12345");
		bank.put("cardType", "debitcard");
		bank.put("currency", "INR");
		data.put("bank", bank);

		return data;

	}

}
