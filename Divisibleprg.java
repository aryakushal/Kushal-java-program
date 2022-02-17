package p1;

import java.util.Scanner;

public class Divisibleprg {

	public static void main(String[] args) {
		int num1;
		Scanner Sc=new Scanner(System.in);
		
		System.out.println("Enter number");
		num1=Sc.nextInt();
		
		if(num1%5==0 && num1%3==0)
		{
			System.out.println("divisible by 5 and 3");
		}
		else if (num1%5==0)
		{
			System.out.println(num1+"is divisible by only 5");
			
		}
		else if(num1%5==0) {
			System.out.println(num1+"is divisible by only 3");
			
		}
			else {
		
			System.out.println("not divisible both numbers");
			
		}
		

	}

}
