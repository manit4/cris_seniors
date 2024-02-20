package org.cris;

import org.cris.config.ProjectConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;


@Component
@Scope(scopeName = "prototype")
class Restaurant {
	
	String name;

	public Restaurant() {
		System.out.println("inside rest constr....");
	}	
}

public class Main {

	public static void main(String[] args) {

	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

	System.out.println(context);
	
	Restaurant  restaurant1 =  context.getBean("restaurant", Restaurant.class);
	}
}

//@Component
//@Scope(scopeName = "prototype")
//class Restaurant {
//	
//	String name;
//
//	public Restaurant() {
//		System.out.println("inside rest constr....");
//	}	
//}
//
//class Tea {
//	
//	Tea() {
//		System.out.println("inside Tea constr....");
//	}
//}
//
//public class Main {
//
//	public static void main(String[] args) {
//
//	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
//
//	System.out.println(context);
//	
//	Restaurant  restaurant1 =  context.getBean("restaurant", Restaurant.class);
//	
//	System.out.println(restaurant1.name);
//	restaurant1.name = "Abc";
//	
//	Restaurant  restaurant2 =  context.getBean("restaurant", Restaurant.class);
//	
//	System.out.println(restaurant2.name);
//	restaurant1.name = "Bcd";
//	
//	Restaurant  restaurant3 =  context.getBean("restaurant", Restaurant.class);
//	System.out.println(restaurant1.name);
//	
//	}
//}



//@Component
//class Restaurant {
//	
//	@Autowired
//	Tea tea;
//
//	public Restaurant() {
//		System.out.println("inside rest constr....");
//	}
//	
//	void placeOrder() {
//		
//		tea.prepareTea();
//	}		
//}
//
//@Component
////@Scope(scopeName = "prototype")
//class Tea {
//	
//	public Tea() {
//		System.out.println("inside Tea constr...");
//	}
//	
//	void prepareTea() {
//		System.out.println("I am preparing Tea for you....");
//	}
//}
//
//public class Main {
//
//	public static void main(String[] args) {
//
//	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
//
//	System.out.println(context);
//	
//	System.out.println(context.getBean("tea", Tea.class));
//	System.out.println(context.getBean("tea", Tea.class));
//	System.out.println(context.getBean("tea", Tea.class));
//	}
//
//}



//@Controller
//class Restaurant {
//	
//	Tea tea = new Tea();
//	
//	public Restaurant() {
//		System.out.println("inside rest constr....");
//	}
//	
//	void placeOrder() {
//		
//		tea.prepareTea();
//	}
//	
//	
//}
//
//@Component
//class Tea {
//	
//	public Tea() {
//		System.out.println("inside Tea constr...");
//	}
//	
//	void prepareTea() {
//		System.out.println("I am preparing Tea for you....");
//	}
//}
//
//public class Main {
//
//	public static void main(String[] args) {
//
//	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
//
//	System.out.println(context);
//	}
//
//}


//class Restaurant {
//	
//	Tea tea;
//	
//	public void setTea(Tea tea) {
//		this.tea = tea;
//	}
//
//	public Restaurant() {
//		System.out.println("rest con...");
//	}
//	
//	void placeOrder() {
//		
//		tea.prepareTea();
//	}
//}
//
//class Tea {
//	
//	Tea() {
//		System.out.println("tea const");
//	}
//	
//	void prepareTea() {
//		
//		System.out.println("prepareTea()...");
//	}
//}
//
//public class Main {
//
//	public static void main(String[] args) {
//
//		ApplicationContext context = new ClassPathXmlApplicationContext("org/cris/config.xml");
//
//		Restaurant restaurant = context.getBean("resBean", Restaurant.class);
//		
//		restaurant.placeOrder();
//
//	}
//
//}



//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
//class Restaurant {
//
//	String name;
//	int age;
//	
//	public Restaurant(String name) {
//		super();
//		this.name = name;
//	}
//	
//	public Restaurant(String name, int age) {
//		super();
//		this.name = name;
//		this.age = age;
//	}
//
//	void prepareTea() {
//		System.out.println("I am preparing Tea for you..." + name+", and the age is "+age);
//	}
//	
//	
//}
//
//public class Main {
//
//	public static void main(String[] args) {
//
//		ApplicationContext context = new ClassPathXmlApplicationContext("org/cris/config.xml");
//
//		Restaurant restaurant = context.getBean("resBean", Restaurant.class);
//		
//		restaurant.prepareTea();
//
//	}
//
//}



//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
//class Restaurant {
//
//	String name;
//	int age;
//	
//	public Restaurant() {
//		System.out.println("inside constructor....");
//	}
//	
//	public String getName() {
//		return name;
//	}
//	
//	public void setNaame(String name) {
//		System.out.println("setter() "+name);
//		this.name = name;
//	}
//	
//	
//
//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}
//
//	void prepareTea() {
//		System.out.println("I am preparing Tea for you..." + name+", "+age);
//	}
//	
//	
//}
//
//public class Main {
//
//	public static void main(String[] args) {
//
//		ApplicationContext context = new ClassPathXmlApplicationContext("org/cris/config.xml");
//
//		Restaurant restaurant = context.getBean("resBean", Restaurant.class);
//		
//		restaurant.prepareTea();
//
//	}
//
//}



//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
//class Restaurant {
//
//	String name = "ABC Restaurants...";
//
//	void prepareTea() {
//		System.out.println("I am preparing Tea for you..." + name);
//	}
//}
//
//public class Main {
//
//	public static void main(String[] args) {
//
//		ApplicationContext context = new ClassPathXmlApplicationContext("org/cris/config.xml");
//
////		Restaurant restaurant =  context.getBean("resBean", Restaurant.class);
////		
////		restaurant.prepareTea();
//
//		context.getBean("resBean", Restaurant.class).prepareTea();
//
//		
//
//		// System.out.println(restaurant.name);
//
//	}
//
//}

//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
//class Restaurant {
//
//	void prepareTea() {
//		System.out.println("I am preparing Tea for you...");
//	}
//	
//	public Restaurant() {
//		System.out.println("Hi........");
//	}
//}
//
//public class Main {
//
//	public static void main(String[] args) {
//
//		ApplicationContext context = new ClassPathXmlApplicationContext("org/cris/config.xml");
//
//
//		Restaurant restaurant = context.getBean("resBean", Restaurant.class);
//		Restaurant restaurant2 = context.getBean("resBean", Restaurant.class);
//		
//		System.out.println(restaurant);
//		System.out.println(restaurant2);
//		
//		restaurant.prepareTea();
//
////		Restaurant restaurant = new Restaurant();
////		
////		restaurant.prepareTea();
//	}
//
//}
