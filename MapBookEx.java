package p9.com;

import java.util.HashMap;
import java.util.Map;

class Book1 {    
int id;    
String name,author,publisher;    
int quantity;    
public Book1(int id, String name, String author, String publisher, int quantity) {    
    this.id = id;    
    this.name = name;    
    this.author = author;    
    this.publisher = publisher;    
    this.quantity = quantity;    
}    
}    
public class MapBookEx {
public static void main(String[] args) {    
      
   HashMap<Integer,Book1> map=new HashMap<Integer,Book1>();    
        
   Book1 b1=new Book1(101," C","Yashwant Kanetkar","BPB",9);    
   Book1 b2=new Book1(102,"Dc","Forouzan","Mc Graw Hill",7);    
   Book1 b3=new Book1(103,"os","Galvin","Wiley",6);    
       
    map.put(1,b1);  
    map.put(2,b2);  
    map.put(3,b3);


    for(Map.Entry<Integer, Book1> ent:map.entrySet()){    
        int key=ent.getKey();  
        Book1 m=ent.getValue();  
        System.out.println(key+" Details:");  
        System.out.println(m.id+" "+m.name+" "+m.author+" "+m.publisher+" "+m.quantity);   
    }    
}    
}
