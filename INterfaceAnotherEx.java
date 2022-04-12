package p11.com;
//java 8 allows you create a method with the body
//we can have default and static method

interface MyInt1{
	void m1();
	default void m2() {
		System.out.println("m2 method implementation");
	}
	static void m3() {
		System.out.println("m3 static method");
	}
}
class myClass1 implements MyInt1{
	public void m1() {
		System.out.println("m1 interface abstract method");
	}

		
	
}
public class INterfaceAnotherEx {

	public static void main(String[] args) {
		myClass1 ob=new myClass1();
		ob.m1();
		ob.m2();
		MyInt1.m3();
		

	}

}
