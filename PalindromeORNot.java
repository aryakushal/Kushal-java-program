package pack.com;

import java.util.Scanner;

public class PalindromeORNot {

	public static void main(String[] args) {
		int num,digit ,rev=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		num=sc.nextInt();
		System.out.println("before while num="+num);
		int num1=num;
		while(num!=0) {
			digit=num%10;
			//System.out.println(digit);
		rev=rev*10+digit;
		num=num/10;
		
		}
		
		System.out.println("reverse number is"+rev);

		if(rev==num1) {
			System.out.println("palandrome");
		}else {
			System.out.println("not palandrome");
				
		}
	}

}
