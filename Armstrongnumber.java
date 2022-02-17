package pack.com;

import java.util.Scanner;

public class Armstrongnumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num,num1,digit,sum=0;
		System.out.println("enter three a number");
		num=sc.nextInt();
		
		
		num1=num;
		while(num1!=0)
			{
			digit=num%10;
			sum=sum+digit*digit*digit;
		num=num1/=10;
			
		}
		if(sum==num) {
			System.out.println("armstrong number"+num);
		}else {
			System.out.println("not armstrong"+num);
		}
			
		

	}

}
