package org.winnard.runtofreedom.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.RowMapper;

public class RunRowMapper implements RowMapper<RunDTO> {
final static Logger logger = LoggerFactory.getLogger(RunRowMapper.class);

	public RunDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		logger.warn("RunRowMapper processing...");
		RunDTO dto = new RunDTO();
		dto.setStartingAccountValue(rs.getDouble("StartingAccountValue"));
		dto.setEndingAccountValue(rs.getDouble("EndingAccountValue"));
		return dto;
	}
}
