package p3.com;

public class BufferEG2 {

	public static void main(String[] args) {
		StringBuffer b=new StringBuffer("hello");
		b.insert(2,"india");
		System.out.println("after insert"+b);
		
		//APPEND
		b.append("hi");
		System.out.println("After append"+b);
		//reverse
		b.reverse();
		System.out.println("After reverse"+b);
		//REPLACE
		b.replace(3,4,"how are you");
		System.out.println("After replace"+b);
//delete
		b.delete(2,5);
		System.out.println("After delete"+b);
		b.deleteCharAt(5);
		System.out.println(b);
		

	}

}
