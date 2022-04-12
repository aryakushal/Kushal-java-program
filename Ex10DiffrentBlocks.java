package p11.com;
//Different Blocks
//main, costructor, static, method, normal block


public class Ex10DiffrentBlocks {

	static {
		System.out.println("static executes before main");
	}
	//normal block
	{
		System.out.println("normal block");
		System.out.println("normal block will executes on object creation before constructor");
	}
	Ex10DiffrentBlocks(){
		System.out.println("Constructor block");
	}
	public static void main(String[] args) {
		System.out.println("MainBlock");
		Ex10DiffrentBlocks ob=new Ex10DiffrentBlocks();
	}

}
