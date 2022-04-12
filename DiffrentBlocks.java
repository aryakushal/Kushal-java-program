package pack.com;

public class DiffrentBlocks {

	static{
		System.out.println("Static will execute before main");
	}
	{
		System.out.println("Normal Block before constructor on object Creation");
	}
	
	DiffrentBlocks(){
		System.out.println("On object creation constructor will executes");
	}
	void display() {
		System.out.println("Display method");
	}
	public static void main(String[] args) {
		System.out.println("Main Method");
		
		DiffrentBlocks ob=new DiffrentBlocks();
		ob.display();

	}

}
