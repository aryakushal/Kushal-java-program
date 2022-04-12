package p11.com;

import java.util.Scanner;
import java.util.Arrays;

public class Ex5Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n;
System.out.println("Enter the elements of array");
n=sc.nextInt();

int arr[]=new int[n];
System.out.println("Enter the elements of array");
for(int i=0;i<n;i++)
{
	arr[i]=sc.nextInt();
}
	int sum=(n+1)*(n+2)/2;
	for(int i=0;i<n;i++) {
		
		sum=sum-arr[i];
	}
	
	
	System.out.println("missing number is="+sum);
	
	
	}

}
