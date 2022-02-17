package p2.com;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		int a[]=new int[5];
		int search,pos=0;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Array elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the elements to be searched ");
		search=sc.nextInt();
		
		for(int i=0;i<a.length;i++) {
	
			if(a[i]==search) {
               
				pos=i+1;
				 break;  
			}
	}
if(pos>0) {
	System.out.println("sucessful search");
	System.out.println("the element "+search+"found at position"+pos);
	}
else {
	System.out.println("unsucessfull search");
}
}
}
