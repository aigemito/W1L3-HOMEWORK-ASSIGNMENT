package Prog3_4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	    Scanner sc=new Scanner(System.in);
	    
	      
	    
	    System.out.println(" Enter C for Circle");
	    System.out.println(" Enter R for Rectangle");
	    System.out.println(" Enter T for Triangle");
	    		
	    String inputChar=sc.next();
	    
	    switch(inputChar.toUpperCase()) {
	    	case "C":
	    		System.out.println(" Enter a radius of the circle");
	    		double radius=sc.nextDouble();
	    		Circle circle = new Circle(radius);
	    		System.out.println("Area of Circle is " + circle.computeArea());
	    		break;
	    	case "R":
	    		System.out.println(" Enter the width of the rectangle");
	    		double width=sc.nextDouble();
	    		System.out.println(" Enter the height of the rectangle");
	    		double height=sc.nextDouble();
	    		Rectangle rect = new Rectangle(width,height);
	    		System.out.println("Area of Rectangle is " + rect.computeArea());
	    		break;
	    	case "T":
	    		System.out.println(" Enter the base of the Triangle");
	    		double base=sc.nextDouble();
	    		System.out.println(" Enter the height of the rectangle");
	    		double height1=sc.nextDouble();
	    		Triangle triangle = new Triangle(base,height1);
	    		System.out.println("Area of Triangle is " + triangle.computeArea());
	    		break;
	    }
	    
		
	}
}
