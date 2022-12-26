package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Teacher {
public static void main(String[] args) throws SQLException {
	String url="jdbc:mysql://localhost:3306/javabatch";
	String username="root";
	String password="root";
	
	String sql= "INSERT INTO teachers VALUES(1,'PRATIK','sql');";
	Connection connection =null;
	
	
	try {
		//load the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		//Establish the connection
		connection=DriverManager.getConnection(url,username,password);
		//create statement
		Statement statement=connection.createStatement();
		//execute statement 
		statement.execute(sql);
		System.out.println("All good........");
		
		
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
	
	
	catch (SQLException e) {
		e.printStackTrace();
	}
	finally {
		
	}
}
}
