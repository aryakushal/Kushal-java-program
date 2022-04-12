package p8.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex6 {

	public static void main(String[] args) {
	String name = null;
	int age=0;
	float sal=0.0f;
	InputStreamReader is=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(is);
	
	
	
System.out.println("Enter name");

try {
	name=br.readLine();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}	
System.out.println("Enter age");
try {
	age=Integer.parseInt(br.readLine());
} catch (NumberFormatException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
System.out.println("Enter sal");
try {
	sal=Float.parseFloat(br.readLine());
} catch (NumberFormatException | IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

System.out.println("details of employee");
System.out.println("name="+name);
System.out.println("age="+age);
System.out.println("sal"+sal);

	
	
	}

}
