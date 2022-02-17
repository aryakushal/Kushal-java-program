package pack.com;

import java.util.Scanner;

public class ScannerEG {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int i;
		float fval;
		double d;
		String n;
		System.out.println("Enter your name ");
		n=sc.nextLine();//with space
		//only one word r=sc.next();
		System.out.println("Enter a integer value ");
		i=sc.nextInt();//read the integer value
		System.out.println("Enter a float value ");
		fval=sc.nextFloat();//read the float value
		System.out.println("Enter a double value ");
		d=sc.nextDouble();//read double value
		
		System.out.println("integer i = "+i);
		System.out.println("float val = "+fval);
		System.out.println("double value = "+d);
		System.out.println("Name = "+n);
		

	}

}
