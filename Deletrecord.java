package com.pack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Deletrecord {

public static void main(String[] args) {
//based on id fetch the record
//Connection
String driver="com.mysql.cj.jdbc.Driver";
String url="jdbc:mysql://localhost:3307/mydb"; //edudb is the database name of mysql
String un="root";
String pass="root";
Connection conn=null;
Statement st=null;
ResultSet rs=null;
Scanner sc = new Scanner(System.in);
System.out.println("enter user_id to delete record");
int user_id = sc.nextInt();
try {
Class.forName(driver);
conn = DriverManager.getConnection(url,un,pass);
st=conn.createStatement();
  String sql="select * from login where user_id="+user_id; //get only one row
  //check id exists
  rs=st.executeQuery(sql);
  if(rs.next()) { //if true record exists

//delete operation when record exists
 
String del = "delete from login where user_id="+user_id;
int  i=st.executeUpdate(del);

if(i>0) {
System.out.println("Record is deleted");
}
}//if
  else {
  System.out.println("Record not exists");
  }
 
}catch(Exception e) {
e.printStackTrace();
}

}

}