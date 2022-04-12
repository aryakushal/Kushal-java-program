package p8.com;

import java.util.Scanner;
class BankExceptionEx1 extends Exception{
	public BankExceptionEx1(String s) {
		super(s);
		
	}
}
class Sbi{
	int bankbalance;
	public Sbi() {
		bankbalance=20000;
	}
void withdraw(int wamt) {
	try {
		if(wamt>bankbalance) {
			throw new BankExceptionEx1("Insufficent balance");
		}else {
			bankbalance=bankbalance-wamt;
			System.out.println("balance amt="+bankbalance);
		}
	}catch(BankExceptionEx1 e) {
		e.printStackTrace();
	}
	
	
	}
}
public class BAnkEX2{
	public static void main(String[] args) {
		Sbi sob=new Sbi();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter amt");
		int amt=sc.nextInt();
		sob.withdraw(amt);
	}
}
