package p8.com;

import java.nio.channels.AlreadyBoundException;

public class MultipleCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=10,b=0,c=0;
int ar[]=new int[4];
System.out.println("before exception");
try {
	System.out.println("insidde try");
	c=a/b;
	ar[6]=8;
}
catch(ArithmeticException e) {
	System.out.println("Arithemetic expression");
	e.printStackTrace();
}catch(ArrayIndexOutOfBoundsException e) {
	System.out.println(" Array bound exception");
	e.printStackTrace();
	
}
finally {
	System.out.println("Finally block ");
}
	}

}
