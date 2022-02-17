package pack.com;

import java.util.Scanner;

public class studentdetails {

	public static void main(String[] args) {
		Scanner Sc= new Scanner(System.in);
		int age;
		float fees;
		char gen;
		String n;
		System.out.println("Enter your name ");
		n=Sc.nextLine();//with space
		//only one word r=sc.next();
		System.out.println("Enter a age ");
		age=Sc.nextInt();//read the integer value
		System.out.println("Enter a fess value ");
		fees=Sc.nextFloat();//read the float value
		
		System.out.println("Enter a  gender ");
		gen=Sc.next().charAt(0);//read the float value
		
		
		System.out.println("Name = "+n);
		System.out.println("student age = "+age);
		System.out.println("student fess = "+fees);
		System.out.println("student gender = "+gen);
		
		


	}

}
