package io.swagger.client.api;

import io.swagger.client.ApiException;

public class DefaultApiExample {

	public static void main(String[] args) {

		DefaultApi apiInstance = new DefaultApi();
		String a = "a_example"; // String |
		String b = "b_example"; // String |
		try {
			apiInstance.aBGet(a, b);
		} catch (ApiException e) {
			System.err.println("Exception when calling DefaultApi#aBGet");
			e.printStackTrace();
		}
	}
}