package pack.com;

import java.util.Scanner;

public class FactorsofNum {

	public static void main(String[] args) {
		int num=0,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		num=sc.nextInt();
		System.out.println("factors  of number is ="+num);
		for(i=1;i<=num;i++) {
			if(num%i==0) {
				System.out.println(i);
			}
		}
			

	}

}
