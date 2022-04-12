package p6.com;

import java.util.ArrayList;
import java.util.Iterator;

class Product{
	int pid;
	String pname;
	float Price;
	public int price;
	public Product(int pid,String pname,float price) {
		super();
		this.pid=pid;
		this.pname=pname;
		this.Price=price;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public float getPrice() {
		return Price;
	}
	public void setPrice(float price) {
		Price = price;
	}
}
public class ArrayListEx3 {

	public static void main(String[] args) {
		ArrayList<Product> ob= new ArrayList<>();
		Product pob1=new Product(1,"pen",23.5f);
		Product pob2=new Product(2,"book",25.5f);
		Product pob3=new Product(3,"scale",26.5f);
		Product pob4=new Product(4,"speaker",276.5f);
		ob.add(pob1);
		ob.add(pob2);
		ob.add(pob3);
		ob.add(pob4);
		
		Iterator<Product> pit=ob.iterator();
		while(pit.hasNext()) {
		Product p=pit.next();
		System.out.println(p.pid+" "+p.pname+" "+p.price);
		
	}
	}
}
