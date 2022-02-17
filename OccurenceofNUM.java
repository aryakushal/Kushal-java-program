package p2.com;

import java.util.Scanner;

public class OccurenceofNUM {

	public static void main(String[] args) {
		int a[]=new int[5];
		int search,count=0;
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Array elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the elements to be searched ");
		search=sc.nextInt();
		
		for(int i=0;i<a.length;i++) {
	
			if(a[i]==search) {
               count=count+1;  
			}
	}
		if (count==0){
			System.out.println("not found");
			
		}
		else {
			System.out.println("element found at position "+count);
		}

	}

}
