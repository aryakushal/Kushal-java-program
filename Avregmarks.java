package p1;

import java.util.Scanner;

public class Avregmarks {

	public static void main(String[] args) {
	 int s1,s2,s3,s4,s5;
	 float avg;
	 Scanner sc=new Scanner(System.in);
	 System.out.println("first sub marks");
	 s1=sc.nextInt();
	 System.out.println("second sub marks");
	 s2=sc.nextInt(); 
	 System.out.println("third sub marks");
	 s3=sc.nextInt();
	 System.out.println("fourth sub marks");
	 s4=sc.nextInt();
	 System.out.println("fifth sub marks");
	 s5=sc.nextInt();
	 avg = (float)(s1+s2+s3+s4+s5)/5;
	 System.out.println("avreg marks="+avg);
	 
	}

}
