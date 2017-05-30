package org.winnard.runtofreedom.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.RowMapper;

public class UserRowMapper implements RowMapper<AccountDTO> {
final static Logger logger = LoggerFactory.getLogger(UserRowMapper.class);

	public AccountDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		logger.warn("UserRowMapper processing...");
		AccountDTO dto = new AccountDTO();
		dto.setUserId(rs.getInt("USERID"));
		dto.setUserName(rs.getString("USERNAME"));
		dto.setFirstName(rs.getString("FIRSTNAME"));
		dto.setAccountValue(rs.getDouble("ACCOUNTVALUE"));
		dto.setMonthlySavings(rs.getDouble("MONTHLYSAVINGS"));
		return dto;
	}
}
