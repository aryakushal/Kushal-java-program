package p1;

import java.util.Scanner;

public class Menudrivenprg {

	public static void main(String[] args) {
		int firstnum,secondnum,ans,choice;
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter firstnumber");
		firstnum=sc.nextInt();
		System.out.println("Enter secondnumber");
		secondnum=sc.nextInt();
		
		System.out.println("**********MENU************");
		
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.multiplicaton");
		System.out.println("4.divison");
		System.out.println("please Enter your choice");
		choice=sc.nextInt();
		
		switch(choice) {
		case 1: ans=firstnum+secondnum;
		         System.out.println("addition of "+firstnum+" and "+secondnum+" is "+ans);
		         break;
		case 2:ans=firstnum-secondnum;
        		System.out.println("difference of "+firstnum+" and "+secondnum+" is "+ans);
        		break;
		case 3: ans=firstnum*secondnum;
		System.out.println("multiplication of "+firstnum+" and "+secondnum+" is "+ans);
		          break;
		case  4: ans=firstnum/secondnum;
		
		System.out.println("mod of "+firstnum+" and "+secondnum+" is "+ans);
	                          break;
		
		default:System.out.println("Invalid input");
		
		}
		
		
		


}
}

