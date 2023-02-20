package com.luv2code.springdemo.mvc;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		
		theModel.addAttribute("customer", new Customer()); // defining model attribute as "customer", which will be used by the form for data binding
		
		return "customer-form";
		
	}
	
	@RequestMapping("/processForm")
	public String processForm(
			// @Valid annotation used, to tell Spring to perform validation rules on this Customer object
			@Valid @ModelAttribute("customer") Customer theCustomer,
			BindingResult theBindingResult) { //  Spring will store the result of validation in BindingResult object
		
		if(theBindingResult.hasErrors()) {
			return "customer-form";
		} else { 
			return "customer-confirmation";
		}
	}

}
