package pack.com;


class addition1{
	
	static int i;
	static int k;
	static int s;
	int m,n,s1;
	addition1(int p, int q){
		m=p;
		n=q;
	}
	
	static {
		i=9;
		k=10;
	}
	static void add() {
		s=i+k;
		System.out.println("sum="+s);
	}
	void nonStaticAddition() {
		s1=m+n;
		System.out.println("sum non static="+s1);
	}
	
}

public class StaticmodifierEX3 {

	public static void main(String[] args) {
		
		addition1.add(); //static method
		addition1 ob=new addition1(3,5);
		addition1 ob1=new addition1(6,5);
	   ob.nonStaticAddition();
	   ob1.nonStaticAddition();
	}

}
