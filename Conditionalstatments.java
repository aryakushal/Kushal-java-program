package p1;

import java.util.Scanner;

public class Conditionalstatments {

	public static void main(String[] args) {
		int num1,num2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first num");
		num1=sc.nextInt();
		System.out.println("Enter sec number ");
		num2=sc.nextInt();
		if(num1>num2) {
			System.out.println(num1+"is larger than"+num2);
		}
		else {
			System.out.println(num2+"is larger than"+num1);
		}
	}

}
