package p3.com;

public class Buffer {

	public static void main(String[] args) {
		String s="Hello";
		StringBuffer b = new StringBuffer(s);
		b.insert(2, "h1");
		
		System.out.println(b);
		b.append("Banglore");
		System.out.println(b);
		b.replace(3,5,"how");
		System.out.println(b);
		b.reverse();
		System.out.println(b);
		
		

	}

}
