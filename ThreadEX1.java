package pack.com;

class myclass extends Thread{
	
	public void run() {
		
		System.out.println("Inside run method"+Thread.currentThread());
		
	}
}

public class ThreadEX1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
myclass ob=new myclass();
myclass ob1=new myclass();
System.out.println("man jvm Thread"+Thread.currentThread());
ob.start();
ob1.start();
	}

}
