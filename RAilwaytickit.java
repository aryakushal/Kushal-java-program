package pack.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Railwaytickit1{
	String name,coach;
	long mobno;
	int amt;
	int totalamt;
	
void accept()throws IOException{
	  InputStreamReader is=new InputStreamReader(System.in);
	  BufferedReader br=new BufferedReader(is);
	  
	  System.out.println("Enter passenger Name:");
	  name=br.readLine();
	  System.out.println("Enter mobile number");
	  mobno=Long.parseLong(br.readLine());
	  System.out.println("Enter coach (first AC/Sec AC/Third AC/Sleepr):");
	  coach=br.readLine();
	  System.out.println("Enter  amount for ticket");
	  amt=Integer.parseInt(br.readLine());
}
	  void update() {
		  
		  if(coach.equals("first AC")) {
			  totalamt= amt+700;
		  }
		   else if (coach.equals("sec AC")) {
				 totalamt=amt+500;
			  }
			  else  if(coach.equals("Third AC"))  {
					  totalamt= amt+250;
					  
				  }
				  else {
				totalamt= amt;
				  }
			  }
	  
			void display() {
				System.out.println("name" +name);
				System.out.println("coach" +coach);
				System.out.println("Total amount " +totalamt);
				System.out.println("Mobile No " +mobno);
				}
		  
}		  

        public class RAilwaytickit {

	public static void main(String[] args) throws IOException {
		Railwaytickit1 obj=new Railwaytickit1();
		obj.accept();
		obj.update();
		obj.display();

	}
       
}
