package p8.com;

import java.util.Scanner;

class Checkage extends Exception {
	public Checkage(String s) {
		super(s);
		
	}
}
public class UserDefinedEcception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int age;
Scanner  sc=new Scanner(System.in);
System.out.println("entr age");
age=sc.nextInt();
try {
	if(age<18) {
		throw new Checkage("not elegeble for voting");
	}else {
		System.out.println("elegible for voating");
	}
}catch(Checkage e) {
		e.printStackTrace();
	}
		
	}
}
	