package p2.com;

import java.util.Scanner;

public class SumofArrayele {

	public static void main(String[] args) {
		int sum=0;
		float avg;
		int a[]=new int[5];
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter "+a.length+"elements");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Enter array elements are");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
			
		}
		System.out.println("To find sum of all array elements");
		for (int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		System.out.println("sum="+sum);
	
	avg=(float)sum/a.length;
	System.out.println("Average"+avg);
	}
	

		}

