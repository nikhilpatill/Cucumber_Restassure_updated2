package Hashmap_apiBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C_UpdateDummyCart_DummyData2 {
/*	
	{
	    "discountedTotal": 87,
	    "total": 99.94999999999999,
	    "totalQuantity": 5,
	    "totalProducts": 1,
	    "id": 1,
	    "userId": 33,
	    "products": [
	        {
	            "discountPercentage": 12.5,
	            "total": 99.94999999999999,
	            "thumbnail": "https://cdn.dummyjson.com/products/images/beauty/Eyeshadow%20Palette%20with%20Mirror/thumbnail.png",
	            "quantity": 5,
	            "discountedPrice": 87,
	            "price": 19.99,
	            "id": 2,
	            "title": "Chargerhhhh RWD"
	        }
	    ]
	}
*/
	public static HashMap<String, Object> mapLogin_User() {

		Map<String, Object> requestBody = new HashMap<>();
		requestBody.put("id", 1);
		requestBody.put("total", 99.94999999999999);
		requestBody.put("discountedTotal", 87);
		requestBody.put("userId", 33);
		requestBody.put("totalProducts", 1);
		requestBody.put("totalQuantity", 5);

		// Create the product map
		Map<String, Object> product = new HashMap<>();
		product.put("id", 2);
		product.put("title", "Chargerhhhh RWD");
		product.put("price", 19.99);
		product.put("quantity", 5);
		product.put("total", 99.94999999999999);
		product.put("discountPercentage", 12.5);
		product.put("discountedPrice", 87);
		product.put("thumbnail",
				"https://cdn.dummyjson.com/products/images/beauty/Eyeshadow%20Palette%20with%20Mirror/thumbnail.png");

		// Add the product to the products list
		requestBody.put("products", new Map[] { product });

		return (HashMap<String, Object>) requestBody;

	}

	

}
