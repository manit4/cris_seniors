package com.abc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

import com.abc.config.Config;

public class Main {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
		Restaurant restaurant = context.getBean("restaurant", Restaurant.class);
		
		restaurant.prepareTea();
		

//		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/abc/configg.xml");
//
//		Restaurant restaurant1 = applicationContext.getBean("resBean", Restaurant.class);
//		
//		restaurant1.prepareTea();
	}
}

@Controller
class Restaurant {

	String name = "Abc Restaurant";

	public Restaurant() {
		System.out.println("inside constructor");
	}

	public void prepareTea() {

		System.out.println("Your tea is being prepared by " + name);
	}
}