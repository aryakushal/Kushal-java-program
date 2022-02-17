package p2.com;

import java.util.Scanner;

public class TWodimensianalArray {

	public static void main(String[] args) {
		int b[][]=new int[2][2]; //Two Dimensional Array 
		//datatype identifier[][]=new datatype[rows][cols];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2x2 matrix");
		for(int r=0;r<2;r++) {
			for(int c=0;c<2;c++) {
				b[r][c] = sc.nextInt();
			}
		}
		
		System.out.println("Entered Matrix is");
		for(int r=0;r<2;r++) {
			for(int c=0;c<2;c++) {
				System.out.print(b[r][c] +" ");
			}
			
			System.out.println();
		}


}}