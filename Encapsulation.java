package p11.com;

import java.util.Scanner;

class student{
	int sid;
	String sname;
	float sfees;

	void input() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter student id");
		sid=sc.nextInt();
		System.out.println("enter stud name");
		sname=sc.next();
		
		System.out.println("enetr fees");
		sfees=sc.nextFloat();
	}
	void display() {
		System.out.println("stud id="+sid);
		System.out.println("stud name="+sname);
		System.out.println("s fess"+sfees);
	}
	
}





public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
student ob=new student();

ob.input();
ob.display();

             
	}

}
