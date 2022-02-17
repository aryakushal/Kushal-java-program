package p2.com;

import java.util.Scanner;

public class Buublesort {

	public static void main(String[] args) {
	 int a[],temp,i,j,n;
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter array size");
          n=sc.nextInt();
           a=new int[n];

System.out.println("Enter array elements");
for(i=0;i<a.length;i++) {
	a[i]=sc.nextInt();
}
System.out.println("BEfore sorting array elements are");
for(i=0;i<a.length;i++) {
	System.out.println(a[i]);
}
for(i=0;i<a.length-1;i++) {
	for(j=0;j<a.length-1;j++) {
		if(a[j]>a[j+1]) {
			temp=a[j];
			a[j]=a[j+1];
			a[j+1]=temp;
			}
	}
		}
	
System.out.println("sorted elements are");
for(i=0;i<a.length;i++) {
	System.out.println(a[i]);
}
	
	}
	
}