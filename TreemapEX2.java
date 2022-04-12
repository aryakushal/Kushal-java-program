package p9.com;

import java.util.Map;
import java.util.TreeMap;

public class TreemapEX2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeMap<String ,String> eob=new TreeMap<String ,String>();
	eob.put("9923456789","arya");
	eob.put("9923456788","druva");
	eob.put("9923456787","adhi");
	eob.put("9923456786","ayra");
	eob.put("9923456785","sharma");
	eob.put("9923456784","jay");
	eob.put("9923456783","varun");
	eob.put("9923456782","arun");
	eob.put("9923456781","aru");
	eob.put("9923456780","rai");
	
	System.out.println(eob);
	
	for(Map.Entry<String, String> m:eob.entrySet()){  
		System.out.println(m.getKey()+" "+m.getValue()); 

		}


	
}
}