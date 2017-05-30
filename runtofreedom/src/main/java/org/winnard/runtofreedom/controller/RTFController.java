package org.winnard.runtofreedom.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.winnard.runtofreedom.model.AccountDTO;
import org.winnard.runtofreedom.model.StepDTO;
import org.winnard.runtofreedom.service.AccountService;
import org.winnard.runtofreedom.service.StepService;

@Controller
public class RTFController {
	final static Logger logger = LoggerFactory.getLogger(RTFController.class);
	
	@Autowired
	AccountService accountService;
	@Autowired
	StepService stepService;
	
	@RequestMapping("/getUser")
	public @ResponseBody AccountDTO getUser(@RequestParam String username) {
		logger.warn("calling accountService...");
		AccountDTO response = accountService.getUser(username);
		return response;
	}
	
	@RequestMapping("/addUser")
	public @ResponseBody AccountDTO addUser(@RequestBody AccountDTO dto) {
		logger.warn("calling accountService...");
		accountService.register(dto);
		return null;
	}
	
    @RequestMapping("/step")
    public @ResponseBody StepDTO step(@RequestBody StepDTO dto) {
    	logger.warn("calling stepService...");
        return stepService.executeStep(dto);
    }
}
