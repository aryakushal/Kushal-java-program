package pack.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Encapsulation
//wrapping member data (instance variables) and member functions(methods)
//in a single unit (class) is called Encapsulation
 class School{
	 int sid; 
	  String name;
	  float amount;
	  
	  void input() throws IOException {
		  InputStreamReader is=new InputStreamReader(System.in);
		  BufferedReader br=new BufferedReader(is);
		  //readLine()->String     read()->Ascii value
		  System.out.println("Enter School id");
		  sid=Integer.parseInt(br.readLine());   // "23"
		  System.out.println("School name");
		   name=br.readLine();
		  System.out.println("Total schoo fees");
		  amount = Float.parseFloat(br.readLine());
		  
	  }
	  void display() {
		  
		  System.out.println("School id="+sid);
		  System.out.println("School name="+name);
		  System.out.println("Total Fees collected "+amount);
	  }
	
}

public class Student {

	public static void main(String[] args) throws IOException {
School ob=new School();
		ob.input();
		ob.display();

	}

}
