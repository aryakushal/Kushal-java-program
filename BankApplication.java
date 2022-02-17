package pack.com;

import java.util.Scanner;

public class BankApplication {

	public static void main(String[] args) {
	
		float amt=10000,withdrawamt,bal;
		int choice;
		char ch;
		do {
		
Scanner sc=new Scanner(System.in);

System.out.println("***Enter your choice***");
System.out.println("1.Deposit amount");
System.out.println("2.withdraw amount");
System.out.println("3.display account balance");

System.out.println("enter your choice");
choice=sc.nextInt();

switch(choice) {
case 1:
System.out.println("deposit");
System.out.println("enter the amount to be deposited");
bal=sc.nextFloat();
if(bal>0) {
amt=amt+bal;
System.out.println("balance amount="+amt);
}
else {
	System.out.println("deposit amt not be negitive");
}
break;

case 2:
	System.out.println("withdraw");
	System.out.println("enter the amount to be withdraw");
	withdrawamt=sc.nextFloat();
	if(withdrawamt<amt) {
		amt=amt-withdrawamt;
System.out.println("balance amount ="+amt);
	}
	else {
		System.out.println("insufficent balance");
	}
	break;
	case 3:
		System.out.println("your account balance"+amt);
		break;
		default:
			System.out.println("invalid Input");
}
			
			System.out.println("do you want to continue Y/N");
			ch=sc.next().charAt(0);
		}
                  while(ch!='N');
System.out.println("EXIT IF enter No");			

		}

	}


