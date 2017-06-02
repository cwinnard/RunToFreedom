package org.winnard.runtofreedom.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.winnard.runtofreedom.model.RunDTO;
import org.winnard.runtofreedom.repository.RunRepository;

@Component
public class RunService {
	
	@Autowired
	RunRepository runRepository;

	public List<RunDTO> getSavedRuns(String username, String[] runIds) {
		List<RunDTO> responseList = new ArrayList<RunDTO>();
		for(String runId : runIds) {
			responseList.add(runRepository.getRun(username, Integer.parseInt(runId)));
		}
		return responseList;
	}

}
