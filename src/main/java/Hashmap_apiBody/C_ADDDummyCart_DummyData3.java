package Hashmap_apiBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C_ADDDummyCart_DummyData3 {

	public static HashMap<String, Object> addCartData() {

		HashMap<String, Object> requestBody = new HashMap<>();

		// Add the userId to the request body
		requestBody.put("userId", 1);

		// Create a list to hold the products
		ArrayList<HashMap<String, Object>> products = new ArrayList<>();

		// Create the first product
		HashMap<String, Object> product1 = new HashMap<>();
		product1.put("id", 1);
		product1.put("title", "Essence Mascara Lash Princess");
		product1.put("quantity", 1);
		product1.put("price", 112.55);
		product1.put("total", 15.5);
		product1.put("discountPercentage", 17.5);

		products.add(product1);

		// Create the second product
		HashMap<String, Object> product2 = new HashMap<>();
		product2.put("id", 50);
		product2.put("quantity", 2);
		product2.put("quantity", 1);
		product2.put("price", 112.55);
		product2.put("total", 15.5);
		product2.put("discountPercentage", 17.5);
		products.add(product2);

		// Add the products list to the request body
		requestBody.put("products", products);

		return requestBody;

	}

}
