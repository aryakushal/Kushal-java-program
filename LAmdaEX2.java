package pack.com;

import java.util.ArrayList;

@FunctionalInterface
interface Drawable{   //Functional interface a interface which has single abstract method
	void draw(); //Lambda expression can be applied to a functional interface
}


@FunctionalInterface
interface Sayable{
	void say(String s);
}

@FunctionalInterface
interface SayableReturn{
	String sayHello();
}

@FunctionalInterface
interface Addition{
	int add(int a, int b); //function with arg and with return type
}


public class LAmdaEX2 {
	
	public static void main(String[] args) {
		
		//using Lambda expression ->
		Drawable dob=()->{
			//body of the function
			System.out.println("draw method body");
		};
		dob.draw();
	
		//Threa class Runnable interface
		
		Sayable sob=(s)->{
			System.out.println("Hello "+s);
		};
		sob.say("kirthi");;
		
		SayableReturn sr=()->{
			return "hi";
		};
		System.out.println(sr.sayHello());
		

		Addition aob=(i,j)->(i+j);
		System.out.println(aob.add(2,7));
		
		//collection api
		
		ArrayList<Integer>l=new ArrayList<Integer>();
		l.add(4);
		l.add(3);
		l.add(45);
		l.add(65);
		
		l.forEach((n)->System.out.println(n));//Iterating list elements using Lambda
	  }
	}

	
