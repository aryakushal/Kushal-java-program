package pack.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class sal {
	
	String name,address,subjectspes;
	long phoneno;
	double monthlysal;
	double incometax,totalsal;
	
	void accept()throws IOException{
		  InputStreamReader is=new InputStreamReader(System.in);
		  BufferedReader br=new BufferedReader(is);
		  
		  System.out.println("Enter Name:");
		  name=br.readLine();
		  System.out.println("Enter Address:");
		  address=br.readLine();
		  System.out.println("Enter SUbjectSpesaalization:");
		  subjectspes=br.readLine();
		  System.out.println("Enter phone number");
		  phoneno=Long.parseLong(br.readLine());
		  System.out.println("enter monthly salary");
		 monthlysal=Double.parseDouble(br.readLine());
	}
	void calculate() {
		
		totalsal=monthlysal*12;
		if(totalsal>175000) {
			incometax=totalsal*0.05;
					}
			
	
		
		else {
			incometax=0;
			
		}
	}
		  void display() {
			  System.out.println("name"+name);
			  System.out.println("address"+address);
			  System.out.println("phone no"+phoneno);
			  System.out.println("subject specilaztion"+subjectspes);
			 System.out.println("total salary"+totalsal);
			  System.out.println("income tax="+incometax);
			  
			}
}		   
		
public class Salary {

	public static void main(String[] args) throws IOException {
		sal ob=new sal();
		ob.accept();
		ob.calculate();
		ob.display();

	}

}
