package p5.com;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num,num1,temp,total=0;
		System.out.println("Enter a number");
	 num=sc.nextInt();
	 
	 num1=num;
	 while(num1 !=0) {
		 temp=num1%10;
		 total=total+(temp*temp*temp);
		 num1=num1/10;
	 }
	 if(total==num)
		 System.out.println("the number is Armstrong"+num);
	 else
		 System.out.println("The number is not Armstrong"+num);
		
		}

}
