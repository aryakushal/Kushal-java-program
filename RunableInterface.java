package p5;

class MyClass implements Runnable{

	@Override
	public void run() {
		for(int i=1;i<=100;i++) {
			System.out.println("Inside run Method "+Thread.currentThread());
	   try {
		   Thread.sleep(100);
		   
	   }catch(InterruptedException e) {
		   e.printStackTrace();
	   }
	}
	}
}

public class RunableInterface {

	public static void main(String[] args) throws InterruptedException {
		
		MyClass ob = new MyClass();
		Thread tob=new Thread(ob);
		MyClass ob1 = new MyClass();
		Thread tob1=new Thread(ob);
		System.out.println("thraed");
		tob.setName("t1");
		tob.start();
	     tob.join();
		tob.start();
	}

}

	
	
