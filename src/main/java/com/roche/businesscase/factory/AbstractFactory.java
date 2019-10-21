package com.roche.businesscase.factory;

import com.roche.businesscase.model.Analysis;


/**
 * Class to declare the abstract factory
 *
 */
public abstract class AbstractFactory {
	
	public abstract Analysis getAnalysis(String analysis);
}
