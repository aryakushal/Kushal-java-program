package p2.com;

import java.util.Scanner;

public class ElectrictyBill {

	public static void main(String[] args) {
	
		int units;
		double amt=350;
		Scanner sc=new Scanner(System.in);
System.out.println("Enter the units consumed");
units=sc.nextInt();
if(units<=100)
{
	amt=units*1.50;
}
else if(units<=200) {
	amt=(100*1.50)+((units-150)*2.00);
}
else if(units<=250)	{
	amt=(100*1.50)+(150*2.00)+((units-200)*2.50);
	}
else {
	amt=(100*1.50)+(150*2.00)+(200*2.50)+((units-250)*4.00);
	
	
}
	System.out.println("units consumed "+units);
	System.out.println("Bill Amount" +amt);


}
		
		

	}


