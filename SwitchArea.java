package pack.com;

import java.util.Scanner;

public class SwitchArea {

	public static void main(String[] args) {
		float length, breadth,base , height, radius,side,area;
		int choice;
		char ch;
		do {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("**********MENU***************");
		System.out.println("1.Area of square");
		System.out.println("2.Area of Reactangle");
		System.out.println("3.Area of Circle");
		System.out.println("4.Area of Triangle");
		
		System.out.println("Please enter your choice");
		choice = sc.nextInt();
		
		switch(choice) {
		case 1:
			    System.out.println("Find Area of square");
		        System.out.println("Enter side of square");
		        side=sc.nextFloat();
		        area=side*side;
		        System.out.println("Area of square of side "+side+" is "+area);
		        break;
		case 2: System.out.println("Area of reactangle");
		        System.out.println("Enter length of reactangle");
		         length=sc.nextFloat();
		         System.out.println("Enter breadth of a reactangle");
		         breadth = sc.nextFloat();
		         area = length*breadth;
		         System.out.println("Area of reactangle of length "+length+" and breadth "+breadth +" is "+area);
		         break;
		case 3: System.out.println("Area of a circle");
		         System.out.println("Enter radius of a circle");
		         radius=sc.nextFloat();
		         area= 3.14159f*radius*radius;
		         System.out.println("Area of a circle of radius "+radius+" is "+radius);
		         break;
		case 4: System.out.println("Area of a Triangle");
		         System.out.println("Enter base of a triangle");
		         base=sc.nextFloat();
		         System.out.println("Enter height of a triangle");
		         height=sc.nextFloat();
		         area=(base*height)/2;
		         System.out.println("Area of a triangle of base "+base +" and height "+height+" is "+area );
		         break;
		default: System.out.println("Invalid input");
		}

		System.out.println("do you want to continue Y/N");
		ch=sc.next().charAt(0);
		}
				while(ch!='N');
		System.out.println("exit if enterd No");


	}

}
