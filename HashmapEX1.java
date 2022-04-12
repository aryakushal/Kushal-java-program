package p9.com;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashmapEX1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<Integer , String> hob=new HashMap<Integer ,String>();
hob.put(1, "arya");
hob.put(2, "man");
hob.put(3, "varun");
hob.put(4, "rai");
hob.put(5, "arun");
hob.put(6, "ayra");
System.out.println(hob);
	
	System.out.println("");
    for(Map.Entry<Integer, String> m:hob.entrySet()){  
System.out.println(m.getKey()+" "+m.getValue()); 

}
	// TODO Auto-generated method stub
TreeMap<Integer , String> tob=new TreeMap<Integer ,String>();
tob.put(1, "arya");
tob.put(2, "man");
tob.put(4, "varun");
tob.put(5, "rai");
tob.put(3, "arun");
tob.put(6, "ayra");
System.out.println(tob);

System.out.println("");
for(Map.Entry<Integer, String> m:tob.entrySet()){  
System.out.println(m.getKey()+" "+m.getValue()); 

}
LinkedHashMap<Integer , String> lob=new LinkedHashMap<Integer ,String>();
lob.put(1, "arya");
lob.put(2, "man");
lob.put(4, "varun");
lob.put(5, "rai");
lob.put(6, "arun");
lob.put(3, "ayra");
System.out.println(lob);

System.out.println("");
for(Map.Entry<Integer, String> m:lob.entrySet()){  
System.out.println(m.getKey()+" "+m.getValue()); 

}

	
	
	}

}

	
