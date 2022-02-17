package p2.com;

import java.util.Scanner;

public class ElectrictyBIll2 {

	public static void main(String[] args) {
		int units;
		float amt,fixedrate=350;
		Scanner sc=new Scanner(System.in);
System.out.println("Enter the units consumed");
units=sc.nextInt();
if(units<=100)
{
	amt=units*1.50f+fixedrate;
}
else if(units>=101 && units<=150) {
	amt=(100*1.50f)+((units-150)*2.00f+fixedrate);
}
else if(units>=151 && units<=250)	{
	amt=(100*1.50f)+(50*2.00f)+((units-150)*2.50f+fixedrate);
	}
else {
	amt=(100*1.50f)+(50*2.00f)+(100*2.50f)+((units-250)*4.00f+fixedrate);
		
}   

	System.out.println(" current Bill Amount RS." +amt);


	}

}
