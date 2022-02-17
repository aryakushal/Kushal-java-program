package pack.com;

import java.util.Scanner;

public class Empdetails {

	public static void main(String[] args) {
		String name;
		int age;
		float sal;
		char gen;
		
		Scanner sc=new Scanner(System.in);
System.out.println("Enter a emp name");
name=sc.nextLine();
System.out.println("emp age");
age=sc.nextInt();
System.out.println("emp salary");
sal=sc.nextFloat();
System.out.println("emp gender");
	gen=sc.next().charAt(0);
	
	System.out.println("Emp Details");
	System.out.println("Name ="+name);
	System.out.println("Age="+age);
	System.out.println("Salary="+sal);
	System.out.println("Gender="+gen);
	


	
	
	
	}

}
