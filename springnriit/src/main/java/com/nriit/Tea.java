package com.nriit;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Controller
public class Tea {
	
	public Tea() {
		System.out.println("inside Tea Constr....");
	}
	
	public void prepareTea() {
		
		System.out.println("insdie PrepareTea()...");
	}

}
