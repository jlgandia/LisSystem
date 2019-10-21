package com.roche.businesscase.factory;

import com.roche.businesscase.model.Analysis;
import com.roche.businesscase.model.BiochemistryAnalysis;
import com.roche.businesscase.model.HematologyAnalysis;
import com.roche.businesscase.model.ImmunologyAnalysis;
import com.roche.businesscase.model.MicrobiologyAnalysis;


/**
 * Factory class to get an instance denpending of the analysis type
 *
 */
public class AnalysisFactory extends AbstractFactory {

	@Override
	public Analysis getAnalysis(String analysisType) {
		switch (analysisType) {
		
		case  "glucose":
			return new BiochemistryAnalysis();
			
		case  "sodium":
			return new HematologyAnalysis();
			
		case  "hemoglobin":
			return new ImmunologyAnalysis();
			
		case  "calcium":
			return new MicrobiologyAnalysis();	
		}
		
		return null;
	}

}
