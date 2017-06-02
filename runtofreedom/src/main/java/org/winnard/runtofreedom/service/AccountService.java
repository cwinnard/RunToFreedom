package org.winnard.runtofreedom.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.winnard.runtofreedom.model.AccountDTO;
import org.winnard.runtofreedom.repository.UserRepository;

@Component
public class AccountService {
	final static Logger logger = LoggerFactory.getLogger(AccountService.class);
	public AccountService(){}
	
	@Autowired
	UserRepository repository;
	
	public AccountDTO login(String username, String password) {
		AccountDTO dto = getUser(username);
		if (password.equals(dto.getPassword())) {
			return dto;
		}
		return new AccountDTO();
	}
	
	private AccountDTO getUser(String username) {
		logger.warn("retrieving user details by username");
		return repository.getUser(username);
	}
	
	public void register(AccountDTO dto) {
		logger.warn("adding user to DB");
		repository.addUser(dto);
	}
}
