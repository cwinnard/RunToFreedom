package org.winnard.runtofreedom.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.winnard.runtofreedom.model.StepdbDTO;
import org.winnard.runtofreedom.model.StepDTO;
import org.winnard.runtofreedom.repository.StepRepository;

@Component
public class StepUtils {

	@Autowired
	StepRepository repository;
	
	public void saveStep(StepDTO request, StepDTO response) {
		StepdbDTO dbto = new StepdbDTO(request.getRunId(), request.getAccountValue(), request.getMonthlySavings(), response.getAccountValue(), response.getMonthlySavings());
		repository.addStep(dbto);
	}
}
