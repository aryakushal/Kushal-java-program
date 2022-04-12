package pack.com;

abstract class Shape{
	abstract void area(); //if method implementation is not there make method as abstract
     void display() {
    	 System.out.println("display inside abstract shape class");
     }
}
 class square extends Shape{

	@Override
	void area() {
		System.out.println("Area of square");
		
	}
	void display() {
		
   	 System.out.println("display inside square  class");
   	super.display();
    }
      
}
 
 
 public class AbstractModifiers {

	public static void main(String[] args) {
		//Shape ob=new Shape(); //abstract class cannot have objects
		square ob=new square();
		ob.area();
		ob.display();
	}

}



