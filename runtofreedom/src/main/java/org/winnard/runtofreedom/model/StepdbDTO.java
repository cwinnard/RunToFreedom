package org.winnard.runtofreedom.model;

public class StepdbDTO {
	int runId;
	double startAccountValue;
	double startMonthlySavings;
	double endAccountValue;
	double endMonthlySavings;
	
	public StepdbDTO(){}
	
	public StepdbDTO(int runId, double startAccountValue, double startMonthlySavings, double endAccountValue,
			double endMonthlySavings) {
		super();
		this.runId = runId;
		this.startAccountValue = startAccountValue;
		this.startMonthlySavings = startMonthlySavings;
		this.endAccountValue = endAccountValue;
		this.endMonthlySavings = endMonthlySavings;
	}
	
	public int getRunId() {
		return runId;
	}

	public void setRunId(int runId) {
		this.runId = runId;
	}

	public double getStartAccountValue() {
		return startAccountValue;
	}
	
	public void setStartAccountValue(double startAccountValue) {
		this.startAccountValue = startAccountValue;
	}
	
	public double getStartMonthlySavings() {
		return startMonthlySavings;
	}
	
	public void setStartMonthlySavings(double startMonthlySavings) {
		this.startMonthlySavings = startMonthlySavings;
	}
	
	public double getEndAccountValue() {
		return endAccountValue;
	}
	
	public void setEndAccountValue(double endAccountValue) {
		this.endAccountValue = endAccountValue;
	}
	
	public double getEndMonthlySavings() {
		return endMonthlySavings;
	}
	
	public void setEndMonthlySavings(double endMonthlySavings) {
		this.endMonthlySavings = endMonthlySavings;
	}
}
