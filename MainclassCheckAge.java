package p8.com;

import java.util.Scanner;

class CheckAgeVoting extends Exception{
	CheckAgeVoting(String s){
		super(s);
	}
}

public class MainclassCheckAge {

	public static void main(String[] args) throws CheckAgeVoting {
        Scanner sc=new Scanner(System.in);	
        
        System.out.println("Enter age");
        int age=sc.nextInt();
        try {
        if(age<18) {
        	throw new CheckAgeVoting("Not Eligible for voting");
        }
        
        }
       catch(ArithmeticException e) {
    	   e.printStackTrace();
       }
	}
	}


