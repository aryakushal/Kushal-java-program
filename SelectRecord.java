package com.pack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class SelectRecord {

	public static void main(String[] args) {
		// based on id fetch the record
		// connection
				String driver="com.mysql.cj.jdbc.Driver";
				String url="jdbc:mysql://localhost:3307/mydb"; //edudb is the database name of mysql
				String un="root";
				String pass="root";
				Connection conn=null;
				Statement st=null;
				ResultSet rs=null;
			Scanner sc=new Scanner(System.in);
			System.out.println("enter user_id to fetch record");
			int user_id=sc.nextInt();
				try {
					Class.forName(driver); //load the driver  , here Class is the name of class
				    conn=DriverManager.getConnection(url, un, pass);
				    st=conn.createStatement();
				String sql="Select*from login where user_id="+user_id;//get only one row
				rs=st.executeQuery(sql);
				if(rs.next()) {
					System.out.println(rs.getInt(1)+" "+rs.getString(2));
				}else {
					System.out.println("user not exists");
				
				
				}
				}catch(Exception e) {
					e.printStackTrace();
				}
	}}
		
