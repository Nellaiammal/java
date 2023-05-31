package com.edu;
import java.util.ArrayList;
import java.util.List;

//entity class
class Developer{
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
//interface
interface DeveloperDao{
	public List<Developer> getAllDevelopers();
	public Developer getDeveloperid(int developerId);
	public void updateDeveloper(Developer Developer);
	public void deleteDeveloper(Developer Developer);
	
}
//implementing above defined interface
class DeveloperDao1 implements DeveloperDao{
	List<Developer> Developers;
	public DeveloperDao1()
	{
		Developers=new ArrayList<Developer>();
		Developer Developer1=new Developer("Antony",0);
		Developer Developer2=new Developer("Anu",1);
		Developers.add(Developer1);
		Developers.add(Developer2);
		
		
	}
	public void deleteDeveloper(Developer Developer) {
		Developers.remove(Developer.getDeveloperId());
		System.out.println("developerId"+Developer.getDeveloperId()+",deleted from database");
		
		
	}
	public List<Developer> getAllDevelopers(){
		return Developers;
		
	}
	public Developer getDeveloperid(int developerId) {
		return Developers.get(developerId);
		
	}
	public void updateDeveloper(Developer Developer) {
		Developers.get(Developer.getDeveloperId()).setName(Developer.getName());
		System.out.println("developerId"+Developer.getDeveloperId()+",updated in the database");
		
		
	}
	
	
}

public class DataAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      DeveloperDao DeveloperDao=new DeveloperDao1();
      for(Developer Developer:DeveloperDao.getAllDevelopers()) {
    	  System.out.println("developerId:"+Developer.getDeveloperId()+",Name:"+Developer.getName());
    	  
      }
      Developer Developer=DeveloperDao.getAllDevelopers().get(0);
      Developer.setName("Raj");
      DeveloperDao.updateDeveloper(Developer);
      DeveloperDao.getDeveloperid(0);
      System.out.println("developerId:"+Developer.getDeveloperId()+",Name:"+Developer.getName());
      
	}

}
