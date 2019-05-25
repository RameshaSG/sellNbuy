package com.example.demo.payment;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class ApplicationController {
	
	@Autowired
	private PaymentService productService;
	
	@RequestMapping("/welcome")
	public String welcome(HttpServletRequest request) {
		
		request.setAttribute("mode", "MODE_HOME");
		return "welcome";
	}
	
	@RequestMapping("/addPayment") 
	public String addition(HttpServletRequest request) {
		
		request.setAttribute("mode", "MODE_ADDPAYMENT");
		return "welcome";
	}	

} 
