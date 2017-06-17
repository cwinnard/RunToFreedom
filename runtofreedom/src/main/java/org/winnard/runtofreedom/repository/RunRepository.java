package org.winnard.runtofreedom.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.winnard.runtofreedom.model.RunDTO;
import org.winnard.runtofreedom.model.RunRowMapper;

@Repository
public class RunRepository {
	final static Logger logger = LoggerFactory.getLogger(RunRepository.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public int addNewRun(int userId) {
		jdbcTemplate.update("Insert into run(UserID) values (?)",
				userId);
		return jdbcTemplate.queryForObject("SELECT MAX(run.RunID) FROM run_to_freedom.run WHERE UserID = ?", new Object[] { userId }, Integer.class);
	}
	
	public RunDTO getRun(String username, int runId) {
		String sql = "SELECT step.RunID,MIN(step.StartAccountValue) as StartingAccountValue,MAX(step.EndAccountValue) as EndingAccountValue FROM run_to_freedom.step "
				+ "INNER JOIN run_to_freedom.run r ON step.RunID=r.RunID "
				+ "INNER JOIN run_to_freedom.user u ON r.UserID=u.UserID "
				+ "WHERE u.Username = ? and r.RunID = ?;";
		
		logger.warn("calling repository method");
		if (jdbcTemplate == null) {
			logger.warn("jdbc template is null!");
		}
		return jdbcTemplate.queryForObject(sql, new Object[] { username, runId },
				new RunRowMapper());
	}
	
}
