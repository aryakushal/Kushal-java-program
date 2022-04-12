package p11.com;

class Addoverload{
	void add(int i,int j) {
		int s;
		s=i+j;
		System.out.println("the sum of "+i+"and"+j+"is"+s);
	}
void add(float i,float j) {
	System.out.println("float wit 2 args"+i+"and"+j);
	
}
void add(double i,double j) {
	System.out.println("double with  2 arsg"+i+"and"+j);
	
}


}

public class EX5OverLOad {

	public static void main(String[] args) {
		Addoverload ob=new Addoverload();
		ob.add(2,4);
		ob.add(9, 8);

	}

}
