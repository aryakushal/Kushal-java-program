package pack.com;

import java.util.Scanner;

public class FactorilusingForloop {

	public static void main(String[] args) {
int i,num,fact=1;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
num=sc.nextInt();
i=num;
for(i=1;i<=num;i++) {
fact=fact*i;

	}
System.out.println("Factorial of nummer is"+fact);
	}
}
