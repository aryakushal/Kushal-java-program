package p1;

import java.util.Scanner;

public class AreaPrgswitchcase {

	public static void main(String[] args) {
		double radius,rec,triangle;
		int l,h,b,choice;
		
				
                	
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter value for Radius");
		radius=sc.nextDouble();
		System.out.println("Enter value for  Rectangle");
		rec=sc.nextDouble();
		l=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Enter value for  Triangle");
		triangle=sc.nextDouble();
		h=sc.nextInt();
		
		System.out.println("**********MENU************");
		
		System.out.println("1.Area of circle");
		System.out.println("2.Area triangale");
		System.out.println("3.Area of ractangle");
		
		System.out.println("please Enter your choice");
		choice=sc.nextInt();
		
		switch(choice) {
		case 1: radius=(22/7)*radius*radius;
		         System.out.println("Area of circle is "+radius);
		               break;
		case 2:rec=l*b;
		     System.out.println(" Area of rectangle is "+rec);
		             break;
          case 3: triangle=(b*h)/2;
             System.out.println("Area of triangle is "+triangle);
             
                           break;

		
		default:System.out.println("Invalid input");
		
	}

}
}