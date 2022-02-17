package p1;

import java.util.Scanner;

public class AreausingSwitch {

	public static void main(String[] args) {
		double r, pi,s,rec ;
		int l,b,choice;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter r to calculate area of circle");
		r=sc.nextDouble();
		System.out.println("Enter s to calculate area of square");
		s=sc.nextDouble();
		System.out.println("Enter r to calculate area of rectangle");
		rec=sc.nextDouble();
		l=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Enter your choice");
		choice=sc.nextInt();
		
		switch(choice) {
		
		case 1:System.out.println("Enter radius of circle");
		     r=(22/7)*r*r;
		System.out.println("radius of circle is " +r);
		break;
		
		
		case 2:System.out.println("Enter squre value");
	         s=s*s;
	     System.out.println("Area of Square is " +s);
	        break;
	
		case 3:System.out.println("Enter rectangle  value");
		
        rec=l*b;
    System.out.println("Area of rectangle is is " +s);
       break;

		}

	}

}
