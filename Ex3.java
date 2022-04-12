package p11.com;


class overloadSeries{
	void Series(int x,int n){
	int i;
	double a;
	double sum=0;
	for(i=1;i<=n;i++) {
		a=Math.pow(x,i);
	}
	
	System.out.println("sum="+sum);
	}
void Series(int p) {
	int i;
	for(i=1;i<=p;i++)
	{
		System.out.println((i*i*i)-1+"");
	}
}
void Series() {
	double i;
	double s=0;
	for(i=2;i<=10;i++);
	s=s+1/i;
}

}
public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
String s = null;
System.out.println("sum"+s);
	}

}
