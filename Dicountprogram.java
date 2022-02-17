package p1;

import java.util.Scanner;

public class Dicountprogram {

	public static void main(String[] args) {
		float rate,amount,discount;
		
		Scanner sc=new Scanner(System.in); 

		System.out.println("Enter the rate of Item ");
		 rate=sc.nextFloat();
		 
		 if(rate>=1000  &&  rate <2000) {
			 amount=(rate*2)/100;
		 }
		 else if(rate>=2000 && rate<=4000)
		 {
			 amount=(rate*3)/100;
		 }
		 else if(rate>=4000 &&  rate<=6000) {
			 amount=(rate*4)/100;
		 }
		 else {
			 amount=(rate*5)/100;
			 
		 }
		 
		 
		 System.out.println("amount after discount="+amount);
		 System.out.println("amount to paid "+(rate-amount));
		 
		 

		 
	}

}
