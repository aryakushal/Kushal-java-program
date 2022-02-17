package pack.com;

import java.util.Scanner;

public class Areaofrectanglescanner {

	public static void main(String[] args) {
		int l,b,rec;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter length");
		l=sc.nextInt();
		System.out.println("enter bredth");
		b=sc.nextInt();
		
		rec=(l*b);
		System.out.println("area of rectangle  is"+rec);

	}

}
