package com.edu;
class Developer {
	private String name;
	private int developerId;
	// constructor of developer class

	 Developer(String name, int developerId) {
		
		this.name = name;
		this.developerId = developerId;
	}
// using getter setter method
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDeveloperId() {
		return developerId;
	}

	public void setDeveloperId(int developerId) {
		 this.developerId = developerId;
	}
	
	
	
}

public class Entity {
	public static void main(String[] args) {
		 Developer developer = new Developer("Antony", "0");
		 
	        System.out.println(" developerId: " + developer.getDeveloperId());
	        System.out.println(" name: " + developer.getName());
	       

	        // Update user information
	        developer.setName("Anu");
	        
	        System.out.println("Updated Developer information:");
	        System.out.println("developerID: "+ developer.getDeveloperId());
	        System.out.println("name: "+ developer.getName());
	       
	    
	
	}

}
