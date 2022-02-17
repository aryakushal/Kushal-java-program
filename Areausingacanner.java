package pack.com;

import java.util.Scanner;

public class Areausingacanner {

	public static void main(String[] args) {
		int radius;
	     double pi,area;
	   
	     Scanner sc= new Scanner(System.in);
	     System.out.println("enter radius");
	     radius=sc.nextInt();
	    System.out.println("enter pi");
	    pi=sc.nextDouble();
	     
	     area=pi*radius*radius;
	     System.out.println("Area of circle is  "+area);
	     

	     

	}

}
