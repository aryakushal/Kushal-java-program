package p5.com;

class helloThread extends Thread{
public helloThread(String String) {
	super(String);
	
}
public void run() {
	for(int i=1;i<=5;i++) {
		System.out.println("i="+i+"thread name"+Thread.currentThread());
	try {
		Thread.sleep(1000);
		
	}catch(InterruptedException e) {
		e.printStackTrace();
	}
	}
}}

public class EX1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		helloThread tob1 =new helloThread ("first");
		helloThread tob2 =new helloThread ("sec");
		tob1.start();
		tob1.join();
		tob2.start();
		
				
	}

}
