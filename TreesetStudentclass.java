package p6.com;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class StudentTreeSet{
	int sid;
	int marks;
	String name;
	public StudentTreeSet(int sid, int marks, String name) {
		super();
		this.sid = sid;
		this.marks = marks;
		this.name = name;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}

//TreeSet implement Comparator interface
class StudentMarksCompare implements Comparator<StudentTreeSet>{

	@Override
	public int compare(StudentTreeSet o1, StudentTreeSet o2) {
		
		
		return o1.marks-o2.marks;
		
	}}
	class StudentNameCompare implements Comparator<StudentTreeSet>{

		@Override
		public int compare(StudentTreeSet o1, StudentTreeSet o2) {
			
			
			return o1.getName().compareTo(o2.getName());
			
		}}
		class StudentsidCompare implements Comparator<StudentTreeSet>{

			@Override
			public int compare(StudentTreeSet o1, StudentTreeSet o2) {
				
				
				return o1.sid-o2.sid;
			}	}

public class TreesetStudentclass {

	public static void main(String[] args) {
TreeSet<StudentTreeSet> ob=new TreeSet<StudentTreeSet>(new StudentMarksCompare());
        StudentTreeSet tob1=new StudentTreeSet(1,544,"aray");
        StudentTreeSet tob2=new StudentTreeSet(2,544,"kushal");
		StudentTreeSet tob3=new StudentTreeSet(3,507,"Ravi");
		ob.add(tob1);
		ob.add(tob2);
		ob.add(tob3);
		
		
		Iterator<StudentTreeSet> it=ob.iterator();
		
		while(it.hasNext()) {
			StudentTreeSet sob=it.next();
			System.out.println("sid ="+sob.getSid()+" Name="+sob.getName()+" marks="+sob.getMarks());
		}
		TreeSet<StudentTreeSet> ob1=new TreeSet<StudentTreeSet>(new StudentNameCompare());
		   StudentTreeSet tob4=new StudentTreeSet(4,550,"ayra");
	        StudentTreeSet tob5=new StudentTreeSet(5,400,"ram");
			StudentTreeSet tob6=new StudentTreeSet(6,500,"delhi");

			ob1.add(tob4);
			ob1.add(tob5);
			ob1.add(tob6);

			Iterator<StudentTreeSet> sit=ob1.iterator();
			
			while(sit.hasNext()) {
				StudentTreeSet sob=sit.next();
				System.out.println("sid ="+sob.getSid()+" Name="+sob.getName()+" marks="+sob.getMarks());
			}
			
			TreeSet<StudentTreeSet> ob2=new TreeSet<StudentTreeSet>(new StudentsidCompare());
			   StudentTreeSet tob7=new StudentTreeSet(7,550,"ay");
		        StudentTreeSet tob8=new StudentTreeSet(8,400,"am");
				StudentTreeSet tob9=new StudentTreeSet(9,500,"raksh");

				ob2.add(tob7);
				ob2.add(tob8);
				ob2.add(tob9);

				Iterator<StudentTreeSet> rit=ob2.iterator();
				
				while(sit.hasNext()) {
					StudentTreeSet sob=rit.next();
					System.out.println("sid ="+sob.getSid()+" Name="+sob.getName()+" marks="+sob.getMarks());
				}	
		
		
	}

}
