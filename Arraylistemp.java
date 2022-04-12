package p6.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Employee{
	int Eid;
	String name;
	float salary;
	String desg;
	public Employee(int sid, String name,String desg, float salary) {
		super();
		this.Eid = Eid;
		this.name = name;
		this.salary = salary;
        this.desg= desg; 	
	}
	public int getEid() {
		return Eid;
	}
	public void setEid(int eid) {
		Eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	
}
class EmployeeEidcompare implements Comparator<Employee>{
	
	public int compare(Employee o1,Employee o2) {
		return o1.Eid-o2.Eid;
	}
}

public class Arraylistemp {

	public static void main(String[] args) {
	ArrayList<Employee> ob=new ArrayList<>();
	Employee eob1=new Employee(1,"Arya","worker",8976.45f );
	Employee eob2=new Employee(2,"kushal","Manager",8966.45f );
	Employee eob3=new Employee(3,"sharma","supervisor",8266.45f );
	
	
	ob.add(eob1);
	ob.add(eob2);
	ob.add(eob3);
	
	System.out.println("before sort");
	Iterator<Employee> eit=ob.iterator();
	while(eit.hasNext()) {
		
	Employee e=eit.next();
	System.out.println(e.Eid +" "+e.name+" "+" "+e.desg+" "+e.salary);
	}
	Collections.sort(ob,new EmployeeEidcompare());
	
	Iterator<Employee> eit1=ob.iterator();
	while(eit1.hasNext()) {
		
	Employee e1=eit.next();
	System.out.println(e1.Eid +" "+e1.name+" "+" "+e1.desg+" "+e1.salary);
	}
	
	}
	}

