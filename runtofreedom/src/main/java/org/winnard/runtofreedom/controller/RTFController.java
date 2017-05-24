package org.winnard.runtofreedom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.winnard.runtofreedom.model.StepDTO;
import org.winnard.runtofreedom.service.StepService;

@Controller
public class RTFController {
	
	StepService stepService = new StepService();

    @RequestMapping("/step")
    public StepDTO greeting(@RequestBody StepDTO dto) {
        return stepService.executeStep(dto);
    }
}
