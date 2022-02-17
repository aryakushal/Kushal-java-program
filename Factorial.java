package pack.com;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int i,num,fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
num=sc.nextInt();
i=num;
while(i>=1) {
	fact=fact*i;
	i=i-1;
}
System.out.println("factorial of number"+fact);
	}

}
