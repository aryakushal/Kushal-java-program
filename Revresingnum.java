package pack.com;

import java.util.Scanner;

public class Revresingnum {

	public static void main(String[] args) {
		int num,digit ,rev=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		num=sc.nextInt();
		
		while(num!=0) {
			digit=num%10;
			//System.out.println(digit);
		rev=rev*10+digit;
		num=num/10;
		
		}
		
		System.out.println("reverse number is"+rev);
	}

}
