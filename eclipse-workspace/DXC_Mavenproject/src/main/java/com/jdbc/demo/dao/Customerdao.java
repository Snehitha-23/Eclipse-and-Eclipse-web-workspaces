package com.jdbc.demo.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.jdbc.demo.insert.Customer;

import com.dbutil.MySqlDbConnection;

public class Customerdao {
	int c=0;
	
	public  int addCustomer(Customer c1)  {
	try(Connection connection=MySqlDbConnection.getConnection();){
		
		//prepared here sql as already compiled	
			String sql="insert into customer(id,name,city,age,gender,contact)values(?,?,?,?,?,?);";
			PreparedStatement preparedstatement=connection.prepareStatement(sql);
			
			preparedstatement.setInt(1, c1.getId());
			
			preparedstatement.setString(2, c1.getName());
			preparedstatement.setString(3, c1.getCity());
			
			preparedstatement.setString(4, c1.getGender());
			preparedstatement.setInt(5, c1.getAge());
		preparedstatement.setLong(6, c1.getContact());
		c=preparedstatement.executeUpdate();

			}
			catch(Exception ex) {
				System.out.println("Exception caught");
				System.out.println(ex);
			}
return c;
	}
	/*
	public Customer getCustomerById(int id) {


		Customer customer=null;


		try(Connection connection= MySqlDbConnection.getConnection();) {


			String sql="select name,city,age,gender,contact from customer where id=?";


			PreparedStatement preparedStatement=connection.prepareStatement(sql);


			preparedStatement.setInt(1, id);


			


			ResultSet resultSet=preparedStatement.executeQuery();


			if(resultSet.next()) {


				customer=new Customer();


				customer.setId(id);


				customer.setAge(resultSet.getInt("age"));


				customer.setName(resultSet.getString("name"));


				customer.setCity(resultSet.getString("city"));


				customer.setGender(resultSet.getString("gender"));


				customer.setContact(resultSet.getLong("contact"));


			}


		}catch (ClassNotFoundException | SQLException e) {


			System.out.println(e);



		}



		return customer;



	}*/
	public Customer getCustomerById(int id) {
			Customer customer =null;
			try(Connection connection=MySqlDbConnection.getConnection();){
				String sql="select name,city,age,gender,contact from customer where id=?";
				PreparedStatement preparedstatement=connection.prepareStatement(sql);
				preparedstatement.setInt(1, id);

				ResultSet resultset=preparedstatement.executeQuery();
				if(resultset.next()) {
		customer=new Customer();
				customer.setId(id);
			
				customer.setName(resultset.getString("name"));
				customer.setCity(resultset.getString("city"));
				customer.setAge(resultset.getInt("age"));
				customer.setGender(resultset.getString("gender"));
				customer.setContact(resultset.getLong("contact"));
				
				
				}
			}
			catch(ClassNotFoundException|SQLException e) {
				System.out.println(e);
			}
			return customer;
	}
	
	public List<Customer>getCustomerByGender(String gender){
		List<Customer>customerList=new ArrayList<>();
		try(Connection connection=MySqlDbConnection.getConnection();){
			String sql="select id,name,city,age,contact from customer where gender=?";
			PreparedStatement preparedstatement=connection.prepareStatement(sql);
			preparedstatement.setString(1, gender);
			ResultSet resultset=preparedstatement.executeQuery();
			while(resultset.next()) {
			Customer customer=new Customer();
			customer.setId(resultset.getInt("id"));
		
			customer.setName(resultset.getString("name"));
			customer.setCity(resultset.getString("city"));
			customer.setAge(resultset.getInt("age"));
			customer.setGender((gender));
			customer.setContact(resultset.getLong("contact"));
			
			customerList.add(customer);
			
			
			}
		}
		catch(ClassNotFoundException|SQLException e) {
			System.out.println(e);
		}
		return customerList;
	}
		/*
	public List<Customer> getCustomerByGender(String gender) {



		List<Customer> customerList=new ArrayList<>();



		try(Connection connection= MySqlDbConnection.getConnection();) {



			String sql="select id,name,city,age,contact from customer where gender=?";



			PreparedStatement preparedStatement=connection.prepareStatement(sql);



			preparedStatement.setString(1, gender);







			ResultSet resultSet=preparedStatement.executeQuery();



			while(resultSet.next()) {



				Customer customer=new Customer();



				customer.setId(resultSet.getInt("id"));



				customer.setAge(resultSet.getInt("age"));



				customer.setName(resultSet.getString("name"));



				customer.setCity(resultSet.getString("city"));



				customer.setGender(gender);



				customer.setContact(resultSet.getLong("contact"));



				customerList.add(customer);



			}



		}catch (ClassNotFoundException | SQLException e) {



			System.out.println(e);



		}



		return customerList;



	}*/
	public List<Customer> getCustomersByAgeRange(int lower,int upper) {



		List<Customer> customerList=new ArrayList<>();



		try(Connection connection= MySqlDbConnection.getConnection();) {



			String sql="select id,name,city,gender,contact,age from customer where age between ? and ?";



			PreparedStatement preparedStatement=connection.prepareStatement(sql);



			preparedStatement.setInt(1, lower);



			preparedStatement.setInt(2, upper);







			ResultSet resultSet=preparedStatement.executeQuery();



			while(resultSet.next()) {



				Customer customer=new Customer();



				customer.setId(resultSet.getInt("id"));



				customer.setAge(resultSet.getInt("age"));



				customer.setName(resultSet.getString("name"));



				customer.setCity(resultSet.getString("city"));



				customer.setGender(resultSet.getString("gender"));



				customer.setContact(resultSet.getLong("contact"));



				customerList.add(customer);



			}



		}catch (ClassNotFoundException | SQLException e) {



			System.out.println(e);



		}



		return customerList;



	}








	public Customer getCustomerByContact(long contact) {

		Customer customer=null;



		try(Connection connection= MySqlDbConnection.getConnection();) {



			String sql="select id,name,city,age,gender from customer where contact=?";



			PreparedStatement preparedStatement=connection.prepareStatement(sql);

			preparedStatement.setLong(1, contact);

			ResultSet resultSet=preparedStatement.executeQuery();



			if(resultSet.next()) {



				customer=new Customer();



				customer.setId(resultSet.getInt("id"));



				customer.setAge(resultSet.getInt("age"));



				customer.setName(resultSet.getString("name"));



				customer.setCity(resultSet.getString("city"));



				customer.setGender(resultSet.getString("gender"));



				customer.setContact(contact);



			}



		}catch (ClassNotFoundException | SQLException e) {



			System.out.println(e);



		}



		return customer;

	}
}
	