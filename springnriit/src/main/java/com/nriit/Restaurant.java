package com.nriit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;

@Controller
public class Restaurant {
	
	@Autowired
	Tea tea;
	
	public Restaurant() {
		System.out.println("inside Restaurant Constructor....");
	}
	
	public void placeOrder() {
		
		tea.prepareTea();
		
	}
}
