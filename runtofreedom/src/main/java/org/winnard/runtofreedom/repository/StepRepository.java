package org.winnard.runtofreedom.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.winnard.runtofreedom.model.StepDBTO;

@Repository
public class StepRepository {
final static Logger logger = LoggerFactory.getLogger(StepRepository.class);
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public StepRepository(){}
	
	public void addStep(StepDBTO dbto) {
		logger.warn("calling repository method");
		if (jdbcTemplate == null) {
			logger.warn("jdbc template is null!");
		}
		jdbcTemplate.update("Insert into step(StartAccountValue,StartMonthlySavings,EndAccountValue,EndMonthlySavings) values (?,?,?,?)",
				dbto.getStartAccountValue(), dbto.getStartMonthlySavings(),dbto.getEndAccountValue(),dbto.getEndMonthlySavings());
	}
}
