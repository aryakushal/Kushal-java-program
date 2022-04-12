package p8.com;

public class EX2 {

		public static void main(String[] args) {
			int a=10,b=0,c=0;
			int ar[]=new int[3];
		
			System.out.println("Before divison");
			
			try {
				c=a/b;
			System.out.println("after a/b"+c);
			}
			catch(ArithmeticException ex) {
				System.out.println("inside catch");
				ex.printStackTrace();
			}
			catch(ArrayIndexOutOfBoundsException e) {
				e.printStackTrace();
			}
			finally {
				System.out.println("finally will executes always");
				System.out.println("finally block is used to close resourse date base,network");
			}				
			System.out.println("after array assignment");


		}}

	
