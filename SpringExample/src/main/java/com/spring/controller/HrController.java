
package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.service.HrService;;

@Controller
public class HrController {
	
	@Autowired
	HrService hrService;
	
	@RequestMapping(value="/", method= RequestMethod.GET)
	public String home(Model model) {
		model.addAttribute("hr", hrService.getHrList());
		
		return "/hr";
	}
}
