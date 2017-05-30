package org.winnard.runtofreedom.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.winnard.runtofreedom.model.AccountDTO;
import org.winnard.runtofreedom.model.UserRowMapper;

@Repository
public class UserRepository {
	final static Logger logger = LoggerFactory.getLogger(UserRepository.class);
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public UserRepository(){}
	
	public AccountDTO getUser(String username) {
		logger.warn("calling repository getUser method wtih username: " + username);
		if (jdbcTemplate == null) {
			logger.warn("jdbc template is null!");
		}
		AccountDTO dto = jdbcTemplate.queryForObject(
				"SELECT * FROM USER WHERE USERNAME = ?", new Object[] { username },
				new UserRowMapper());
		return dto;
	}
	
	public void addUser(AccountDTO dto) {
		logger.warn("calling repository addUser method");
		if (jdbcTemplate == null) {
			logger.warn("jdbc template is null!");
		}
		jdbcTemplate.update("Insert into user(Username,Password,FirstName,AccountValue,MonthlySavings) values (?,?,?,?,?)",
				dto.getUserName(), dto.getPassword(),dto.getFirstName(),dto.getAccountValue(),dto.getMonthlySavings());
	}

}
