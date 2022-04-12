package p11.com;
//static block it is used to initialze static data
//it is called before any object creation
//Static method cannot be inherritteed
//static method;-
//it can accessonly static data
//static metod belongs to class
//static can be called with refrence to class name
//satic method cannot be inherited
//canot be oviriden

class DemoStatic{
	static int i; //variable as static->shared all objects
	int j; 
	static String college_name;
	
	static {
		System.out.println("static block it is called ");
		i=1;
		college_name="vemanna institute of Technplogy";
	}
	DemoStatic(){
		System.out.println("constructor");
	}
	
}
public class EX9Sattic {
 static {
	   System.out.println("Static1 before main");
 }
 static {
	   System.out.println("Static2 before main");
 }
	public static void main(String[] args) {
		System.out.println("Main");
		DemoStatic ob=new DemoStatic();
		DemoStatic ob1=new DemoStatic();
		System.out.println("college name="+ob.college_name);
		System.out.println("college name="+DemoStatic.college_name);
	}

}
