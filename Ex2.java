package p11.com;

import java.util.Scanner;

class Bookfair
{
	String Bname;
	double price;
	
	Bookfair(){
		Bname="";
		price=0.0;
	
}
void input() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter book name");
	Bname=sc.next();
	System.out.println("Enter price");
	price=sc.nextDouble();
}
void calculate() {
	double dis;
	if(price<=1000) {
		dis=2.0/100*price;
}
	else if(price<=3000) {
		dis=10.0/100*price;
		
	}
	else {
		dis=15.0/100*price;
		price=price-dis;
	}}
void display() {
	System.out.println("book name="+Bname);
	System.out.println("price "+price);
}
}


public class Ex2 {

	public static void main(String[] args) {
		Bookfair ob=new Bookfair();
		ob.input();
		ob.calculate();
		ob.display();
	}
}
