package org.winnard.runtofreedom.model;

public class RunDTO {
	double startingAccountValue;
	double endingAccountValue;
	
	public RunDTO(){}
	
	public RunDTO(double startingAccountValue, double endingAccountValue) {
		super();
		this.startingAccountValue = startingAccountValue;
		this.endingAccountValue = endingAccountValue;
	}

	public double getStartingAccountValue() {
		return startingAccountValue;
	}
	public void setStartingAccountValue(double startingAccountValue) {
		this.startingAccountValue = startingAccountValue;
	}
	public double getEndingAccountValue() {
		return endingAccountValue;
	}
	public void setEndingAccountValue(double endingAccountValue) {
		this.endingAccountValue = endingAccountValue;
	}
	
}
