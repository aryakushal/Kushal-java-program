package p8.com;

import java.util.Scanner;

public class EX3{
	
	public static void main(String[] args) {
		int a[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array elements");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
			
		}
	System.out.println("array elements are");
	for(int i=0;i<a.length+1;i++) {
		try {
			System.out.println(a[i]);
		
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}
	
	System.out.println("statments after loop");
	}

}
