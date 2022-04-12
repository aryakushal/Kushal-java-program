package p6.com;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class vectorEX1{

	public static void main(String[] args) {
		Vector<Integer>vectob=new Vector<Integer>();
		System.out.println(vectob);
		vectob.add(45);
		vectob.add(48);
		vectob.add(23);
		vectob.add(89);
		System.out.println(vectob);
		
		System.out.println(vectob);
		
		System.out.println(vectob);
		System.out.println(vectob.get(2));
	    System.out.println(vectob.isEmpty());
	    //to get part of linkedlist
	    System.out.println("sublist "+vectob.subList(2, 4));
	    vectob.add(2, 32);
	    System.out.println("after adding element in second position "+vectob);
	    
	    //Iteration
	    Iterator<Integer> it=vectob.iterator();
	    System.out.println("LinkedList elements using iterator");
	    while(it.hasNext()) {
	    	System.out.println(it.next());
	    	
	    	}
	    Vector<Integer> vect2=(Vector<Integer>) vectob.clone();
	       System.out.println(vect2);
	       
	       Collections.sort(vect2);
	       System.out.println("After sorting elements "+vect2);
	       
	       Collections.shuffle(vect2);
	       System.out.println("After shuffle "+vect2);
		}

	

	

}

	
