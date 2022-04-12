package p8.com;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class EX7 {

	public static void main(String[] args) throws IOException {
	String name = null;
	int age=0;
	float sal=0.0f;

	Scanner sc=new Scanner(System.in);
	
	
System.out.println("Enter name");

name=sc.nextLine();	
System.out.println("Enter age");
try {
	age=sc.nextInt();
} catch (NumberFormatException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
System.out.println("Enter sal");
try {
	sal=sc.nextFloat();
} catch (NumberFormatException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

System.out.println("details of employee");
System.out.println("name="+name);
System.out.println("age="+age);
System.out.println("sal"+sal);

	
	

	}

}
