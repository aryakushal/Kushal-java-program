package pack.com;

class Overloading{
	void display() {
		System.out.println("Dispaly with no argumrnt");
	}
	void display(int i) {
		System.out.print("one arg of type integer");
	}
	void display(float i) {
		System.out.println("one arg of type float");
	}
	void display(double i) {
		System.out.println("one arg of type double");
	}
	void display(String i) {
		System.out.println("one arg of type string");
	}
	void display(int i,int j) {
		System.out.println("two arg of type integer");
}
public class PolyMorphism {
	public static void main(String[] args) {
	Overloading ob=new Overloading();
	ob.display();
	ob.display(654.54);
	ob.display(765.45f);
	ob.display(56);
	
	
		
	}
}

}




