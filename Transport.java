package pack.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Atransport {
	
	String name;
	int w;
	int charge;
	
		
		void accept()throws IOException{
			  InputStreamReader is=new InputStreamReader(System.in);
			  BufferedReader br=new BufferedReader(is);
			  
			  System.out.println("Enter passenger Name:");
			  name=br.readLine();
			  System.out.println("Weight of the parcel inn KG");
			  w=Integer.parseInt(br.readLine());	 
}

void calculate() {
	if(w<=10) {
		charge=w*25;
	}
	else if(w>=10 && w<=30) {
		charge=10*25+(w-10)*20;
	}
	else 
		charge=10*25+20*20+(w-30)*10;
	   charge+=(5.0/100*charge);
}

void display() {
	

System.out.println("name\tweight\tbillamt");
System.out.println("-------------");
System.out.println(name +"\t"+w+"\t"+charge);

}

}

public class Transport {

	public static void main(String[] args) throws IOException {
		
Atransport ob=new Atransport();
ob.accept();
ob.calculate();
ob.display();
	}

}
