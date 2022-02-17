package pack.com;

import java.util.Scanner;

public class AreaEX1 {
	
	public static void main(String args[]) {
		Double r,s;
		int rec,l,b,choice,Y,N;
		char ch;
		do {
		
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter c to calculate area of circle");
	System.out.println("Enter s to calculate area of square");
	System.out.println("Enter r to calculate area of rectangle");
	
     System.out.println("Enter your choice");
	        choice=sc.nextInt();
	
	switch (choice) {
	case 1:
		System.out.println("Enter radius of circle :");
		 r=sc.nextDouble();
		 r=(22/7)*r*r;
	System.out.println("Area of circle ="+r);
                        break;
                        
	case 2:	System.out.println("Enter area of square :");
              s=sc.nextDouble();
         		 s=s*s;
      	     System.out.println("Area of square is"+s);             	
                         break;
                       
	case 3:	 System.out.println("Enter radius of triangle :");
	               rec=sc.nextInt();
		          l=sc.nextInt();
                  b=sc.nextInt();
                   rec=(l*b)/2;
	         System.out.println("Area of rectangle is ="+rec);
                       break;
                       
     default: System.out.println("invalid input :");
       
	
	}
System.out.println("do you want to continue Y/N");
ch=sc.next().charAt(0);
}
		while(ch!='N');
System.out.println("exit if enterd No");
	}
}
	