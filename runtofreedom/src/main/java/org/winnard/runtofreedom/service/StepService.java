package org.winnard.runtofreedom.service;

import java.math.BigDecimal;

import org.winnard.runtofreedom.model.StepDTO;
import org.winnard.runtofreedom.utils.StepUtils;

public class StepService {
	
	public StepService(){}
	
	double interestRate = 0.09;
	StepUtils utils = new StepUtils();
	
	public StepDTO executeStep(StepDTO request) {
		StepDTO response = new StepDTO();
		BigDecimal accountValue = new BigDecimal(request.getAccountValue());
		BigDecimal monthlySavings = new BigDecimal(request.getMonthlySavings() + 100);
		
		for (int i=0; i < 5; i++) {
			//Add one year of monthly savings to initial account value
			accountValue = accountValue.add(monthlySavings.multiply(new BigDecimal(12)));
			//Compound account value by interest rate
			accountValue = accountValue.multiply(new BigDecimal(1.09));
		}
		
		response.setAccountValue(accountValue.doubleValue());
		response.setMonthlySavings(monthlySavings.doubleValue());
		
		return response;
	}
}
