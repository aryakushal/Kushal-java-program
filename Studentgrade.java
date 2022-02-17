package p1;

import java.util.Scanner;

public class Studentgrade {

	public static void main(String[] args) {
       int marks,i;
       float total,avg;
       Scanner sc=new Scanner (System.in);

       System.out.println("Enter marks ");
       marks=sc.nextInt();
       
       if(marks>=90 && marks<=100) {
    	   
       System.out.println("grade A");
       }
       
       if(marks>=10 && marks<=89) {
    	   
           System.out.println("grade B");
           }
	
	if(marks>=40 && marks<=69) {
 	   
	       System.out.println("grade c");
	       
	       }
	if(marks>=0 && marks<=39) {
 	   
	       System.out.println("grade D");
	       }
System.out.println("invalid");
	}
}