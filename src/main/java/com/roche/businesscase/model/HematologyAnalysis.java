package com.roche.businesscase.model;

/**
 * Class that represent Hematology Analysis
 *
 */
public class HematologyAnalysis extends Analysis {

	private int propD;
	
	public HematologyAnalysis() {
		super();
	}

	@Override
	public int calculateTest() {
		
		return 5;
	}
	
	public int getPropD() {
		return propD;
	}
	public void setPropD(int propD) {
		this.propD = propD;
	}

}
