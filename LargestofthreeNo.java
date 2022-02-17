package pack.com;

public class LargestofthreeNo {

	public static void main(String[] args) {
		int i=9,k=2;
		int p;
		p=(i>k)?i:k;
		System.out.println("Largest of"+i+"and"+k+"is"+p);
		
		int s=(i<k)?i:k;
		System.out.println(" Smalest of "+i+" and "+k+" is "+s);
		
		int m=9,n=7,l=4;
		int lar=(m>n && m>l)?m:(n>m && n>l)?n:l;
		System.out.println("Largest of 3 no is "+lar);

	}

}
