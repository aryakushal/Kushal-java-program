package p3.com;

import java.util.Scanner;

public class WordcountString {

	public static void main(String[] args) {
		String s;
		int c=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		s=sc.nextLine();
		String s1=s.toLowerCase();
		
		System.out.println("No of Characters ="+s.length());
		
		for(int i=0;i<s1.length();i++) {
			char ch=s1.charAt(i);
			if(ch==' ')	{
			c=c+1;
		}
		}
	System.out.println("NO of words "+c++);	
	}
	}


