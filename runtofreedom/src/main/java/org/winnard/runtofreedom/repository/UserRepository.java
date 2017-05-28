package org.winnard.runtofreedom.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.winnard.runtofreedom.model.AccountDTO;

@Repository
public class UserRepository {
	final static Logger logger = LoggerFactory.getLogger(UserRepository.class);
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public UserRepository(){}
	
	public void addUser(AccountDTO dto) {
		logger.warn("calling repository method");
		if (jdbcTemplate == null) {
			logger.warn("jdbc template is null!");
		}
		jdbcTemplate.update("Insert into users(Username,Password,FirstName,LastName,AccountValue,MonthlySavings) values (?,?,?,?,?,?)",
				dto.getUserName(), dto.getPassword(),dto.getFirstName(),dto.getLastName(),dto.getAccountValue(),dto.getMonthlySavings());
	}

}
