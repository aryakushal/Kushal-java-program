package p1;

import java.util.Scanner;

public class largesto3no {

	public static void main(String[] args) {
			int num1,num2,num3;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter first num");
			num1=sc.nextInt();
			System.out.println("Enter sec number ");
			num2=sc.nextInt();
			System.out.println("Enter third number ");
			num3=sc.nextInt();
		
			if(num1>num2&& num1>num3) {
				System.out.println(num1+"is larger than"+num2+"and"+num3);
			}
			else if(num2>num1&& num2>num3){ 
	
				System.out.println(num2+"is larger than"+num1+"and"+num3);
			}
			else
				{
					
					System.out.println(num3+"is larger than"+num2+"and"+num1);
				
			}
		}



	}

