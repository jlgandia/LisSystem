package com.roche.business.service;

import java.util.Map;

import com.roche.businesscase.factory.AbstractFactory;
import com.roche.businesscase.factory.AnalysisFactory;
import com.roche.businesscase.model.Analysis;
import com.roche.businesscase.model.Order;

public class TestManageModuleService {

	private AbstractFactory testFactory = new AnalysisFactory();
    
    
    
    public TestManageModuleService() {
		super();
	}  
    
    public String computeOrder(Order order) {
    	
    	for (Map.Entry<String, Analysis> entry : order.getTestToPerform().entrySet()) {
    		Analysis analysis = getAnalysis(entry.getKey());
    		entry.setValue(analysis);
        }
    	
    	order.getTestToPerform().forEach((k, v) -> v.calculateTest());
    	
    	return "OK";
    	
    }
    
    public Analysis getAnalysis(String analysisType) {
    	
    	return testFactory.getAnalysis(analysisType);
    	
    }
    
}
