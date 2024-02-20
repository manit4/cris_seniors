package com.cris;

class Restaurant {
	
	String name;
	
	void prepareTea() {
		
		System.out.println("I am Preparing Tea...");
	}
	
	Restaurant(String name) {
		this.name = name;
	}
}


public class Main {
	
	public static void main(String[] args) {
		
		Restaurant restaurant = new Restaurant();
		
		restaurant.prepareTea();
	}

}

