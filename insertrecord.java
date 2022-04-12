package com.pack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class insertrecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String driver="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3307/mydb"; //edudb is the database name of mysql
		String un="root";
		String pass="root";
		Connection conn=null;
		Statement st=null;
		ResultSet rs=null;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter user_id to insert record");
	int user_id=sc.nextInt();
		
	
	
	try {
			Class.forName(driver); //load the driver  , here Class is the name of class
		    conn=DriverManager.getConnection(url, un, pass);
		    st=conn.createStatement();
		    String sql="Select*from login where user_id="+user_id;
			rs=st.executeQuery(sql);
			
		    
		    
		    if(!rs.next()) {
		    	System.out.println("enter name");
String name=sc.next();
String ins="insert into login values("+user_id+",'"+name+"')";

int i=st.executeUpdate(ins);
			 if(i>0) {
				 System.out.println("Record is inserted succesfully");
				 }
				 }//if
				   else {
				   System.out.println("id already exists chooes diffrennt id");
				   }   
		    
		    
		    }catch(Exception e) {
			e.printStackTrace();
		}
}


	}


