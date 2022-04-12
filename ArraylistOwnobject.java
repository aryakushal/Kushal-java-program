package p6.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Student{
	int sid;
	String name;
	float fees;
	public Student(int sid, String name, float fees) {
		super();
		this.sid = sid;
		this.name = name;
		this.fees = fees;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getFees() {
		return fees;
	}
	public void setFees(float fees) {
		this.fees = fees;
	}
}
public class ArraylistOwnobject {

	public static void main(String[] args) {
	ArrayList<Student> ob=new ArrayList<>();
	Student sob1=new Student(1,"Arya",76.45f );
	Student sob2=new Student(2,"kushal",5466.45f );
	Student sob3=new Student(3,"arun",5566.45f );
	ob.add(sob1);
	ob.add(sob2);
	ob.add(sob3);
	
	//Fetch data from List
	Iterator<Student> sit=ob.iterator();
	while(sit.hasNext()) {
	Student s=sit.next();
	System.out.println(s.sid +" "+s.name+" "+s.fees);
	
	}
	}

}



