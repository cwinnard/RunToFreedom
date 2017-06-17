package org.winnard.runtofreedom.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.winnard.runtofreedom.model.StepDTO;
import org.winnard.runtofreedom.utils.StepUtils;

@Component
public class StepService {
	public StepService(){}
	
	@Autowired
	StepUtils stepUtils;
	
	double interestRate = 0.09;
	
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
		
		response.setAccountValue(Math.round(accountValue.doubleValue()));
		response.setMonthlySavings(Math.round(monthlySavings.doubleValue()));
		
		stepUtils.saveStep(request, response);
		return response;
	}
}
