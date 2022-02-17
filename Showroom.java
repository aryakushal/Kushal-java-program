package pack.com;

import java.util.Scanner;

public class Showroom {
	
  String name;
  long mobno;
  double cost;
  double dis;
 double amt;
 
  Showroom() {
	 name=null;
	 mobno=0;
	 cost=0.0;
	 dis=0.0;
	 amt=0.0;
 }
  void input() {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter customer name");
	 name=sc.nextLine();
	 System.out.println("Enter customer Mobno");
	 mobno=sc.nextLong();
	 System.out.println("Enter cost");
	 cost=sc.nextDouble();
 }
 void calculate() {
	 if(cost<=10000) {
		 dis=(cost*5)/100;
	 }
	 else if(cost>10000 && cost<=20000) {
		 dis=(cost*10)/100;
	 }
	 else if(cost>20000 && cost<=35000) {
		 dis=(cost*15)/100;
	 }
	 else {
		 dis=(cost*20)/100;
	 }
	 amt=cost-dis;
 }
 void display() {
	 //System.out.println("customer name="+name);
	// System.out.println("mobile no="+mobno); 
	 System.out.println("amoount after discount"+amt);
 }
 
	
	public static void main(String[] args) {
     Showroom obj=new Showroom();
     obj.input();
     obj.calculate();
     obj.display();

	}

}
