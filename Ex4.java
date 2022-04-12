package p8.com;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="aabc";
System.out.println(" Before parse int");
try {
int i=Integer.parseInt(s);
System.out.println("After Parseint");
	
	}catch(NumberFormatException e ) {
		e.printStackTrace();
	}
	System.out.println(s);
	}

}
