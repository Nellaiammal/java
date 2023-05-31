package com.edu;
import java.util.Scanner;

interface Shape{
	void draw();
}
class Square implements Shape{
	public void draw() {
		System.out.println("Square Draw");
	}
}

class Reactangle implements Shape{
	public void draw() {
		System.out.println("Reactangle Draw");
	}
}
class Circle implements Shape{
	public void draw() {
		System.out.println("Circle Draw");
	}
}
class FactoryClass{
	Shape obj;
	public Shape getObject(String s) {
		if(s.equalsIgnoreCase("Circle"))
		{
			obj=new Circle();
			return obj;
		}
		else if(s.equalsIgnoreCase("square"))
		{
			obj=new Square();
			return obj;
		}
		else if(s.equalsIgnoreCase("Reactangle"))
		{
			obj=new Reactangle();
			return obj;
		}
		else
		{
			return null;
		}
		
	}
}

public class FactoryPatternMain {

	public static void main(String[] args) {
//		Shape obj;
//		obj=new Square();
//		obj.draw();
//		obj=new Circle();
//		obj.draw();
//		obj=new Reactangle();
//		obj.draw();
		Scanner sc=new Scanner(System.in);
		
		FactoryClass obj=new FactoryClass();
		System.out.println("Enter the shape to be drawn");
		String sh=sc.next();
		Shape sob=obj.getObject(sh);
		
		sob.draw();
		
		
		

	}

}