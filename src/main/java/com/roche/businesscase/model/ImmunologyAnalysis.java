package com.roche.businesscase.model;

/**
 * Class that represent Immunology Analysis
 *
 */
public class ImmunologyAnalysis extends Analysis {

	private int propE;
	
	public ImmunologyAnalysis() {
		super();
	}
	@Override
	public int calculateTest() {
		
		return 5;
	}
	public int getPropE() {
		return propE;
	}
	public void setPropE(int propE) {
		this.propE = propE;
	}

	
}
