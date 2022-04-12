package p8.com;

import java.util.Scanner;

public class ExceptionTry {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		a=sc.nextInt();
		System.out.println("enetr second number");
		b=sc.nextInt();
		System.out.println("before divison");
		try {
			c=a/b;
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		System.out.println("catch block execute when exception ocurred");
		
		}
		finally {
			System.out.println("finally block execute always");
			
		}
System.out.println("after divison");
System.out.println("program other statments");
	}

}
