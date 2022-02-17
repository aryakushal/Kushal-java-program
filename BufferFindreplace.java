package p3.com;

import java.util.Scanner;

public class BufferFindreplace {

	public static void main(String[] args) {
		String s;
		Scanner sc=new Scanner(System.in);
		
	StringBuffer b=new StringBuffer("");
	System.out.println("enter a string");
	s=sc.nextLine();
	
	System.out.println("index of substring="+b.indexOf("age"));
	
	System.out.println("index of substring="+b.indexOf("am",2));
	
	System.out.println("index of substring="+b.indexOf("am",10));
	
	

	}

}
