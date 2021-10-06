package com.dbutil;
import java.sql.*;


public class MySqlDbConnection {
private static Connection connection;
private MySqlDbConnection() {
	
}

public static Connection getConnection() throws ClassNotFoundException,SQLException {
	//step1
	
	Class.forName("com.mysql.jdbc.Driver");
	System.out.println("Driver Loaded");

	//step2
	String url="jdbc:mysql://localhost:3306/dxc";
	String username="root";
	String password="Pandu@23";
	return connection=DriverManager.getConnection(url, username, password);
}



}
