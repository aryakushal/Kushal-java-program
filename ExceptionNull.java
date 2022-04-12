package p8.com;

import java.util.Scanner;

public class ExceptionNull {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String n= null;
Scanner sc=new Scanner(System.in);
try {
	System.out.println("Enter name");
	n=sc.nextLine();
	System.out.println("name="+n);
}catch(NullPointerException e) {
	e.printStackTrace();
}
	}

}
