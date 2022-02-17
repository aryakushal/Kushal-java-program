package p3.com;

import java.util.Scanner;

public class BufferRemovingvowels {

	public static void main(String[] args) {
		String s;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string ");
		 s=sc.nextLine();
		StringBuffer s1=new StringBuffer(s);
		
		
		for(int i=0;i<s1.length();i++) {
			char ch=s1.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i'  || ch=='o'  || ch=='u') {
		s1.deleteCharAt(i);
			}
		}
		System.out.println("After removing vowels = "+ s1);		


	}

}
