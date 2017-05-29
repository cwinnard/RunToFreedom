package org.winnard.runtofreedom.model;

public class StepDTO {
	double accountValue;
	double monthlySavings;
	
	public StepDTO(){}
	
	public StepDTO(double accountValue, double monthlySavings) {
		super();
		this.accountValue = accountValue;
		this.monthlySavings = monthlySavings;
	}
	
	public double getAccountValue() {
		return accountValue;
	}
	
	public void setAccountValue(double accountValue) {
		this.accountValue = accountValue;
	}
	
	public double getMonthlySavings() {
		return monthlySavings;
	}
	
	public void setMonthlySavings(double monthlySavings) {
		this.monthlySavings = monthlySavings;
	}
}
