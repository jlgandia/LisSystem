package com.roche.businesscase.model;


/**
 * Class that represent Microbiology Analysis
 *
 */
public class MicrobiologyAnalysis extends Analysis {

	private int propF;
	
	public MicrobiologyAnalysis() {
		super();
	}

	@Override
	public int calculateTest() {
		
		return 5;
	}

	public int getPropF() {
		return propF;
	}

	public void setPropF(int propF) {
		this.propF = propF;
	}
	
}
