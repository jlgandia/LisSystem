package com.roche.businesscase.model;

import com.roche.businesscase.contract.TestOperations;


/**
 * Analysis abstract class that implements the test operations
 *
 */
public abstract class Analysis implements TestOperations {
	
	
	private int propA;
	
	private int propB;
	
	public Analysis() {
		super();
	}
	
	public Analysis(int propA, int propB) {
		super();
		this.propA = propA;
		this.propB = propB;
	}
	
	public int getPropA() {
		return propA;
	}

	public void setPropA(int propA) {
		this.propA = propA;
	}

	public int getPropB() {
		return propB;
	}

	public void setPropB(int propB) {
		this.propB = propB;
	}

	public int calculateTest() {
		return 0;
	}
}
