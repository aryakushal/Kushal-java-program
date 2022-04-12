package p9.com;

import java.util.Map;
import java.util.TreeMap;

class student {
	int sid;
	String sname;
	float sfees;
	public student(int sid, String sname, float sfees) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sfees = sfees;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public float getSfees() {
		return sfees;
	}
	public void setSfees(float sfees) {
		this.sfees = sfees;
	}
	@Override
	public String toString() {
		return "student [sid=" + sid + ", sname=" + sname + ", sfees=" + sfees + ", getSid()=" + getSid()
				+ ", getSname()=" + getSname() + ", getSfees()=" + getSfees() + "]";
	}

}

public class EX5 {

	public static void main(String[] args) {
		TreeMap<Integer,student> ob=new TreeMap<>();
          student s1=new student(1,"arya",300f);
          student s3=new student(2,"ayra",500f);
          student s2=new student(3,"surya",400f);
	
	ob.put(1,s1);
	ob.put(2,s2);
	ob.put(3,s3);
	System.out.println(ob);
	for(Map.Entry<Integer, student> m:ob.entrySet()) {
		int k=m.getKey();
		student b=m.getValue();
		System.out.println(b.getSid()+" "+b.getSname()+" "+b.getSfees());
	}
	}

}
