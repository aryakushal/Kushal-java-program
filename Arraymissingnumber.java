package p11.com;

public class Arraymissingnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {1,2,4,5};

//find sum 1 to n natural no;
int s,n=5,ars=0;
s=n*(n+1)/2;


//sum of all array elements
for(int i=0;i<a.length;i++) {
	ars=ars+a[i];
}
int mn=s-ars;

System.out.println("missing number is"+
mn);
}
	
	}


