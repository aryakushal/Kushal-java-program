package pack.com;

class addition {
	void add(int i,int j) {
		int s=i+j;
		System.out.println("Integer sum is"+s);
	}
	
	void add (float i,float j) {
	float s=i+j;
		System.out.println("float sum is "+s);
	}
	void add(double i,double j) {
		double s=i+j;
		System.out.println("one arg of type double"+s);
	}
}
	

public class PolyMorphismSum {
	
	public static void main(String[] args) {
	addition ob=new addition();
	ob.add(12,34);
	ob.add(23,674);
	ob.add(765,45);
	ob.add(56,33);		
	
}

}
