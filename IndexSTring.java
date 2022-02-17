package p3.com;

import java.util.Scanner;

public class IndexSTring {

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		int c=0;
		String s;
		System.out.println("ENter a String");
		s=Sc.nextLine();
		System.out.println("Enter a character");
           char ch=Sc.next().charAt(0);
           for(int i=0;i<s.length();i++){
        	   if(ch==s.charAt(i)) {
           c++;
        	   }
	}
System.out.println(ch+"Character is present"+c+"times");
}
}