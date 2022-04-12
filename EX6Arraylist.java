package p9.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Employee1 {
	int Eid;
	String Ename;
	Float Esal;
	public Employee1(int eid, String ename, Float esal) {
		super();
		Eid = eid;
		Ename = ename;
		Esal = esal;
	}
	public int getEid() {
		return Eid;
	}
	public void setEid(int eid) {
		Eid = eid;
	}
	public String getEname() {
		return Ename;
	}
	public void setEname(String ename) {
		Ename = ename;
	}
	public Float getEsal() {
		return Esal;
	}
	public void setEsal(Float esal) {
		Esal = esal;
	}
}
class Employee1idcompare implements Comparator<Employee1>{
public int compare(Employee1 o1,Employee1 o2) {
	return o1.Eid-o2.Eid;
}
}
class Employee1name implements Comparator<Employee1>{
	
	public int compare(Employee1 o1,Employee1 o2) {
		return o1.getEname().compareTo(o2.getEname());
	}
	
}
class Employee1Esalcompare implements Comparator<Employee1>{

	@Override
	public int compare(Employee1 o1, Employee1 o2) {
		// TODO Auto-generated method stub
		return (int) (o1.Esal-o2.Esal);
	}
	
}


public class EX6Arraylist {

	public static void main(String[] args) {
		ArrayList<Employee1> ob=new ArrayList<Employee1>();
	    Employee1 ob1=new Employee1(101,"druva",30000f);
	    Employee1 ob2=new Employee1(102,"arya",20000f);
	    Employee1 ob3=new Employee1(103,"syrya",40000f);
	ob.add(ob1);
	ob.add(ob2);
	ob.add(ob3);
	
	System.out.println(" before sorting");
	Iterator<Employee1> iob=ob.iterator();
	while(iob.hasNext()){
	Employee1 eob=iob.next();
	System.out.println("sid ="+ob1.getEid()+" "+ob2.getEname()+" "+ob3.getEsal());
	}
	Collections.sort(ob,new Employee1idcompare());
	System.out.println("after sorting");
	Iterator<Employee1> iob1=ob.iterator();
	while(iob1.hasNext()) {
	Employee1 eob=iob1.next();
	System.out.println("sid ="+eob.getEid()+" "+eob.getEname()+" "+eob.getEsal());
	}
	
	Collections.sort(ob,new Employee1name());
	System.out.println(" sorting based on name");
	Iterator<Employee1> iob2=ob.iterator();
	while(iob2.hasNext()) {
	Employee1 eob=iob2.next();
	System.out.println("sid ="+eob.getEid()+" "+eob.getEname()+" "+eob.getEsal());
	}
	
	}
}
