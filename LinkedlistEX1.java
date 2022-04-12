package p6.com;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedlistEX1 {

	public static void main(String[] args) {
		LinkedList<Integer>listob=new LinkedList<Integer>();
		System.out.println(listob);
		listob.add(45);
		listob.add(48);
		listob.add(23);
		listob.add(89);
		System.out.println(listob);
		listob.addFirst(100);
		System.out.println(listob);
		listob.addLast(300);
		System.out.println(listob);
		System.out.println(listob.get(2));
	    System.out.println(listob.isEmpty());
	    //to get part of linkedlist
	    System.out.println("sublist "+listob.subList(2, 4));
	    listob.add(2, 32);
	    System.out.println("after adding element in second position "+listob);
	    
	    //Iteration
	    Iterator<Integer> it=listob.iterator();
	    System.out.println("LinkedList elements using iterator");
	    while(it.hasNext()) {
	    	System.out.println(it.next());
	    	
	    	}
	    LinkedList<Integer> list2=(LinkedList<Integer>) listob.clone();
	       System.out.println(list2);
	       
	       Collections.sort(list2);
	       System.out.println("After sorting elements "+list2);
	       
	       Collections.shuffle(list2);
	       System.out.println("After shuffle "+list2);
		}

	

	

}
