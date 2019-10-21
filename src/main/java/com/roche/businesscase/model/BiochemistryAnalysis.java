package com.roche.businesscase.model;

/**
 * Class that represent Biochemistry Analysis
 *
 */
public class BiochemistryAnalysis extends Analysis {

	private int propC;
	
	public BiochemistryAnalysis() {
		super();
	}

	@Override
	public int calculateTest() {
		return 5;
	}

	public int getPropC() {
		return propC;
	}

	public void setPropC(int propC) {
		this.propC = propC;
	}
	
}
