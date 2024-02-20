package com.nriit;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nriit.config.Config;

public class Main {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
		Restaurant restaurant = context.getBean("restaurant", Restaurant.class);
		
		restaurant.placeOrder();
		

//		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
//
//		Restaurant restaurant1 = applicationContext.getBean("restaurantBean", Restaurant.class);
//		
//		restaurant1.prepareTea();
	}
}


//class Restaurant {
//
//	String name = "Abc Restaurant";
//
//	public Restaurant() {
//		System.out.println("inside constructor");
//	}
//
//	public void prepareTea() {
//
//		System.out.println("Your tea is being prepared by " + name);
//	}
//}
//
//public class Main {
//
//	public static void main(String[] args) {
//
//		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
//
//		Restaurant restaurant1 = applicationContext.getBean("restaurantBean", Restaurant.class);
//		restaurant1.name = "Xyz Restaurant";
//		restaurant1.prepareTea();
//
//		Restaurant restaurant2 = applicationContext.getBean("restaurantBean", Restaurant.class);
//
//		restaurant2.prepareTea();
//	}
//}

//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
//class Restaurant {
//	
//	public Restaurant() {
//		System.out.println("inside constructor...");
//	}
//
//	public void prepareTea() {
//		
//		System.out.println("Your tea is being prepared by ");
//	}	
//}
//
//public class Main {
//	
//	public static void main(String[] args) {
//		
//		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
//		
//		Restaurant restaurant = applicationContext.getBean("restaurantBean", Restaurant.class);
//		
//		restaurant.prepareTea();
//	}
//}

//class Restaurant {
//
//	List<String> foodItems;
//	
//	public void setFoodItems(List<String> foodItems) {
//		this.foodItems = foodItems;
//	}
//
//	public void prepareTea() {
//		
//		System.out.println("Your tea is being prepared by "+foodItems);
//	}	
//}
//
//public class Main {
//	
//	public static void main(String[] args) {
//		
//		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
//		
//		Restaurant restaurant = applicationContext.getBean("restaurantBean", Restaurant.class);
//		
//		restaurant.prepareTea();
//	}
//}

//class Restaurant {
//
//	String rname;
//	
//	public Restaurant(String rname) {
//		super();
//		this.rname = rname;
//	}
//
//	public void prepareTea() {
//		
//		System.out.println("Your tea is being prepared by "+rname);
//	}	
//}
//
//public class Main {
//	
//	public static void main(String[] args) {
//		
//		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
//		
//		Restaurant restaurant = applicationContext.getBean("restaurantBean", Restaurant.class);
//		
//		restaurant.prepareTea();
//	}
//}

//class Restaurant {
//
//	String rname;
//	
//	public void setRname(String rname) {
//		this.rname = rname;
//	}
//
//	public void prepareTea() {
//		
//		System.out.println("Your tea is being prepared by "+rname);
//	}	
//}
//
//public class Main {
//	
//	public static void main(String[] args) {
//		
//		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
//		
//		Restaurant restaurant = applicationContext.getBean("restaurantBean", Restaurant.class);
//		
//		restaurant.prepareTea();
//	}
//}

//class Restaurant {
//	
//	public Restaurant() {
//		System.out.println("inside Restaurant constructor");
//	}
//	
//	public void prepareTea() {
//		
//		System.out.println("Your tea is being prepared...");
//	}	
//}
//
//public class Main {
//	
//	public static void main(String[] args) {
//		
//		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
//		
//		System.out.println("second line of main()");
//		
//		Restaurant restaurant = applicationContext.getBean("restaurantBean", Restaurant.class);
//		
//		restaurant.prepareTea();
//	}
//}

//class Restaurant {
//	
//	public void prepareTea() {
//		
//		System.out.println("Your tea is being prepared...");
//	}
//	
//}
//
//public class Main {
//	
//	public static void main(String[] args) {
//		
//		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
//		
//		Restaurant restaurant = applicationContext.getBean("restaurantBean", Restaurant.class);
//		
//		restaurant.prepareTea();
//	}
//}
