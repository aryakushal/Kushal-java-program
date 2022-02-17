package p1;

import java.util.Scanner;

public class SwitchEX3 {

	public static void main(String[] args) {
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character");
		ch = sc.next().charAt(0);
		
		switch(ch) {
		case 'A': 
		case 'E': 
		case 'I': 
		case 'O': 
		case 'U': 
		case 'a': 
		case 'e': 
		case 'i': 
		case 'o': 
		case 'u': System.out.println("Vowel");
         			break;
		 
		default:
			        System.out.println("Not an vowel");
		          
		}


	}

}
