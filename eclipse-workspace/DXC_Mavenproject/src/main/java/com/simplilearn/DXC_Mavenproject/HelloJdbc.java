package com.simplilearn.DXC_Mavenproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class HelloJdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection connection =null;
try {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver Loaded");

		//step2
		String url="jdbc:mysql://localhost:3306/dxc";
		String username="root";
		String password="Pandu@23";
	
			try {
				connection=DriverManager.getConnection(url, username, password);
				System.out.println("Connection successful");
				//Step 3
				Statement statement=connection.createStatement();
				String sql="select id,name,age,city,gender,contact from customer";
				//step 4
				ResultSet resultSet=statement.executeQuery(sql);
				System.out.println("Query Executed");
				//step 5
				System.out.println("\n\nCustomer details are:");
				while(resultSet.next()) {
					System.out.println("Id-"+resultSet.getInt("id"));
					System.out.println("Age-"+resultSet.getInt("age"));
				System.out.println("Contact-"+resultSet.getLong("contact"));
					System.out.println("Gender-"+resultSet.getString("gender"));
					System.out.println("City-"+resultSet.getString("city"));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
	}
catch(ClassNotFoundException e) {
	System.out.println(e);
}
finally {
	try {
		connection.close();
		System.out.println("Connection closed");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
}
