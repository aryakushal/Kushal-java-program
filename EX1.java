package p11.com;

import java.util.Scanner;

class Showroom {
		String name;
		long mobno;
		double cost;
		double dis;
		double amt;
				
		Showroom(){
			name="";
			mobno=0;
			cost=0.0;
			dis=0.0;
			amt=0.0;
		}
		
	
	public void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter customer name ");
		name = sc.nextLine();
		System.out.println("Enter customer mobile no");
		 mobno = sc.nextLong();
		System.out.println("Enetr cost");
		 cost = sc.nextDouble();
		
	}
			public void calculate() {
			if(cost<=10000) {
				dis=(cost*5)/100;
				amt=cost-dis;
			}
			else if(cost>10000 && cost<=20000) {
				dis=(cost*10)/100;
				amt=cost-dis;
			}
			else if(cost>20000 && cost<=35000) {
				dis=(cost*15)/100;
				amt=cost-dis;
			}
			else {
				dis=(cost*20)/100;
				amt=cost-dis;
			}
			}
				
				public void display() {
					System.out.println("Customer name" +name);
					System.out.println("mobile no"+mobno);
					System.out.println("discount amt"+amt);
				}
			}		
				


public class EX1 {

	public static void main(String[] args) {
		 
Showroom ob=new Showroom();
ob.input();

ob.calculate();
ob.display();

			}
		
}
	

