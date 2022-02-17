package pack.com;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		float p,t,r,si;
		Scanner sc = new Scanner(System.in);
System.out.println("enter principal amount");
p=sc.nextFloat();
System.out.println("enter time");
t=sc.nextFloat();
System.out.println("enter rate of interest");
r=sc.nextFloat();

si=p*t*r/100;
System.out.println("simple intrest is"+si);
	}

}
