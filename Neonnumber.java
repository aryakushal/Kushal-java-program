package pack.com;

import java.util.Scanner;

public class Neonnumber {

	public static void main(String[] args) {
		int sum=0,num,square,digit;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		num=sc.nextInt();
		square=num*num;
		while(square!=0) {
			digit=square%10;
			sum=sum+digit;
			square=square/10;
					}
		if(num==sum) {
			System.out.println("given number is neon");
		}else {
			System.out.println("given number is not neon");
		}

	}

}
