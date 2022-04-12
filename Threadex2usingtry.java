package p4;

class object extends Thread{
	//override the run method
	public void run() {
		for(int i=1;i<=100;i++) {
			System.out.println("Inside run Method "+Thread.currentThread());
	   try {
		   Thread.sleep(10000);
	   }catch(InterruptedException e) {
		   e.printStackTrace();
	   }
	}
	}
}
public class Threadex2usingtry {

	public static void main(String[] args) {
		object ob=new object(); //new state
		object ob1=new object(); 	//new state
		System.out.println("Main JVM Thread "+Thread.currentThread());
		System.out.println("Thread-0 "+ob.isAlive());//state of thread
		System.out.println("Thread-1 "+ob1.isAlive());
		ob.setName("first");
		ob1.setName("second");
		ob.start(); //Runnable state
		ob1.start(); //Runnable state
		
	}

}
