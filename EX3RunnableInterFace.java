package pack.com;


class MyThread1 implements Runnable { 
	
	@Override
	public void run() {
		System.out.println("Inside run method"+Thread.currentThread());
	}
}
public class EX3RunnableInterFace {

public static void main(String[] args) throws InterruptedException{
	System.out.println(Thread.currentThread());
		// TODO Auto-generated method stub
MyThread1 ob=new MyThread1();
//START METHOD IS DEFINED IN THREAD

Thread tob=new Thread(ob);
tob.setName("adi");
tob.start();
MyThread1 ob1=new MyThread1();

Thread tob1=new Thread(ob1);
tob1.setName("my secname");
tob.start();

	}

}
