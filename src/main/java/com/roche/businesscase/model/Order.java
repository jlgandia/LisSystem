package com.roche.businesscase.model;

import java.util.HashMap;
import java.util.Map;


/**
 * Class that represents an Order 
 *
 */
public class Order {

	private String userId;
	
	// Map to store the test and the respective type of test.
	private Map<String, Analysis> testToPerform = new HashMap<>();
	
	public Order() {
		super();
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Map<String, Analysis> getTestToPerform() {
		return testToPerform;
	}

	public void setTestToPerform(Map<String, Analysis> testToPerform) {
		this.testToPerform = testToPerform;
	}
	
}
