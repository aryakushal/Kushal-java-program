package com.pack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class SelectRecords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String driver="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3307/mydb"; //edudb is the database name of mysql
		String un="root";
		String pass="root";
		Connection conn=null;
		Statement st=null;
		ResultSet rs=null;
	
		try {
			Class.forName(driver); //load the driver  , here Class is the name of class
		    conn=DriverManager.getConnection(url, un, pass);
		    st=conn.createStatement();
		   String sql="Select *from sstudent";
		   rs=st.executeQuery(sql);
		   System.out.println("ID\tname\temail");
		   while(rs.next()){
			   int id=rs.getInt(1);
			   String n=rs.getString(2);
			   String n1=rs.getString(3);
				
  System.out.println(id+"\t"+n+"\t"+n1);
		   }
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
