
package p9.com;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Ex1 {

	public static void main(String[] args) {
		HashMap<Integer,String>hp=new HashMap<Integer,String>();
          hp.put(16,"kiran");
          hp.put(12,"surya");
          hp.put(56,"raksh");
          hp.put(12,"surya");
          System.out.println("HASH MAP"+hp);
          
          for(Map.Entry m1:hp.entrySet()) {
  	    	System.out.println(m1.getKey()+ " "+m1.getValue());
          }
          hp.remove(12);
	
	TreeMap<Integer,String>hp1=new TreeMap<Integer,String>();
    hp1.put(16,"kiran");
    hp1.put(12,"surya");
    hp1.put(56,"raksh");
    System.out.println("TREE MAp"+hp1);
   
    hp1.remove(16);
    System.out.println(hp1);
    
    for(Map.Entry m1:hp1.entrySet()) {
    	System.out.println(m1.getKey()+ " "+m1.getValue());
    }
    
    
    LinkedHashMap<Integer,String>hp2=new LinkedHashMap<Integer,String>();
    hp2.put(16,"kiran");
    hp2.put(12,"surya");
    hp2.put(56,"raksh");
    System.out.println("LINKEd HASH MAP"+hp2);
    
    for(Map.Entry m1:hp2.entrySet()) {
    	System.out.println(m1.getKey()+ " "+m1.getValue());
    }
    Hashtable<Integer,String>hp3=new Hashtable<Integer,String>();
    hp3.put(16,"kiran");
    hp3.put(12,"surya");
    hp3.put(56,"raksh");
    hp3.put(12,"surya");
    System.out.println("HASH TABLE"+hp3);
    for(Map.Entry m1:hp3.entrySet()) {
    	System.out.println(m1.getKey()+ " "+m1.getValue());
    }
    
    LinkedHashMap<String ,String>hp4=new LinkedHashMap<String,String>();
    hp4.put("9976643982","kiran");
    hp4.put("9955664412","surya");
    hp4.put("9955662356","raksh");
    System.out.println(hp4);
    
    for(Map.Entry m1:hp4.entrySet()) {
    	System.out.println(m1.getKey()+ " "+m1.getValue());
    
    }    
}
}