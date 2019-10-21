package com.roche.businesscase;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import com.roche.business.service.TestManageModuleService;
import com.roche.businesscase.factory.AbstractFactory;
import com.roche.businesscase.factory.AnalysisFactory;
import com.roche.businesscase.model.Analysis;
import com.roche.businesscase.model.Order;

@TestInstance(Lifecycle.PER_CLASS)
public class TestManageModule    
{
	
	private Order order;
	private AbstractFactory abstractFactory;
	private TestManageModuleService serviceTest;

	/**
	 * Create a order with several tests ordered, instantiate the Test Factory for unitary tests.
	 */
	
	@BeforeAll
	public void setup() {
		serviceTest = new TestManageModuleService();
		abstractFactory = new AnalysisFactory();

	    order = new Order();
		Map<String, Analysis> map = new HashMap<>();
		map.put("glucose", null);
		map.put("sodium", null);
		map.put("calcium", null);
		order.setTestToPerform(map);
	}

	
	@DisplayName("All Test Correct")
	@Test
	public void testAllAnalysisCorrect()  {
		assertAll(
	            () -> assertEquals(abstractFactory.getAnalysis("glucose").calculateTest(), 5, "Biochemistry Analysis"),
	            () -> assertEquals(abstractFactory.getAnalysis("sodium").calculateTest(), 5, "Hematology Analysis"),
	            () -> assertEquals(abstractFactory.getAnalysis("hemoglobin").calculateTest(), 5, "Immunology Analysis"),
	            () -> assertEquals(abstractFactory.getAnalysis("calcium").calculateTest(), 5, "Microbiology Analysis")
	    );
	}
	
	@DisplayName("All Test Incorrect")
	@Test
	public void testAllAnalysisInCorrect()  {
		assertAll(
	            () -> assertNotEquals(abstractFactory.getAnalysis("glucose").calculateTest(), 3, "Biochemistry Analysis"),
	            () -> assertNotEquals(abstractFactory.getAnalysis("sodium").calculateTest(), 6, "Hematology Analysis"),
	            () -> assertNotEquals(abstractFactory.getAnalysis("hemoglobin").calculateTest(), 7, "Immunology Analysis"),
	            () -> assertNotEquals(abstractFactory.getAnalysis("calcium").calculateTest(), 9, "Microbiology Analysis")
	    );
	}
	
	@Test
    public void unavailableTest()
	{
		assertNull(abstractFactory.getAnalysis("iron"));
	}
	
	
	@DisplayName("Test an entire Order")
	@Test
	public void testOrder() {
		assertEquals(serviceTest.computeOrder(order), "OK");
	}
}
