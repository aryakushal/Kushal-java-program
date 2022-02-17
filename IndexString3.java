package p3.com;

import java.util.Scanner;

public class IndexString3 {

	public static void main(String[] args) {

	String ms=" ";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string in 3 words");
		String s=sc.nextLine();
		int sp=s.indexOf(' ');
		int lis=s.lastIndexOf(' ');
		String s1=s.charAt(0)+"."+s.charAt(sp+1)+"."+s.substring(lis+1);
		System.out.println(s1);
		
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i'  || ch=='o'  || ch=='u') {
		continue;
			}
			else {
				ms=ms+s.charAt(i);
				
			}
			}
System.out.println("after removing vowels"+ms);
		
	}

	}


