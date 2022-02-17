package p3.com;

import java.util.Scanner;

public class UserCredtialchecck {

	public static void main(String[] args) {
	String uname,upass;
	int i;
	
	System.out.println("you have maximum 3 attempts");
	System.out.println("your account will be locked");
	System.out.println("you can try after 24 hrs");
	
	Scanner sc=new Scanner(System.in);
	for(i=1;i<=3;i++) {
System.out.println("Enter your name");
uname=sc.next();
System.out.println("Enter your password");
upass=sc.next();



if(uname.equalsIgnoreCase("admin") && upass.equals("admin123")) {
	System.out.println("login succeful");
  break;
	}

else {
	System.out.println("invalid user name or password");
	System.out.println(i+"attempts are over");
	
}}
	
if(i==4) {
System.out.println("sorry your acc is lock login tomorrw");
}
}
	}


