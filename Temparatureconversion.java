package pack.com;

import java.util.Scanner;

public class Temparatureconversion {

	public static void main(String[] args) {
	float fa,cel;
	int choice;
Scanner sc=new Scanner(System.in);
System.out.println("********menu****");	
System.out.println("convert fahrenhite to celsius");
System.out.println("conver Celsius to fahrenhite");

System.out.println(" enter your choice");
  choice=sc.nextInt();
  switch(choice) {
	case 1:
	  System.out.println("enter tempratutre the fahrenhite:");
	  fa=sc.nextFloat();
	  cel=(fa-32)*5/9;
System.out.println("temprature in celsius :"+cel);
  break;
	case 2:
		System.out.println("enter tempratutre the celsius:");
		  cel=sc.nextFloat();
		  fa=cel*9/5+32;
	System.out.println("temprature in fahrenite :"+fa);
	break;

	default:System.out.println("wrong choice");
	break;
  }
  
	}

}
