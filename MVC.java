package com.edu;
import java.util.ArrayList;
import java.util.List;

//entity class
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
//Define the view class
class DeveloperView {
public void printDeveloperDetails(Developer developer) {
   System.out.println("Developer details:");
   System.out.println("DveloperID: " + developer.getDeveloperId());
   System.out.println("Name: " + developer.getName());
   
}
}
//Define the controller class
class DeveloperController {
private Developer model;
private DeveloperView view;



public DeveloperController(Developer model, DeveloperView view) {
	super();
	this.model = model;
	this.view = view;
}



public void setModel(Developer model) {
	this.model = model;
}



public void setView(DeveloperView view) {
	this.view = view;
}


public void updateDeveloperView() {
   view.printDeveloperDetails(model);
}




}



public class MVC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Create a new Developer
	     Developer developer = new Developer("Antony", "0");
	     

	     // Create the view and controller
	     DeveloperView developerview = new DeveloperView();
	     DeveloperController developerController = new DeveloperController(developer, developerview);

	     // Update the developer name 
	    
	     //developerController.setName("Anu");

	     // Update the view
	     developerController.updateDeveloperView();
	    
	

	}

}
