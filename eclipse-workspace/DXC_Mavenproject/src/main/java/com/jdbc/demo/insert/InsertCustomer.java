package com.jdbc.demo.insert;




import com.jdbc.demo.dao.Customerdao;
public class InsertCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Customer c1=new Customer(109, "Ramesh", "Bangalore", 22,"M", 1234567892L);

		Customerdao dao=new Customerdao();
		int c=dao.addCustomer(c1);
		

		System.out.println(c+" no of customer/s added");
	}
	/*
public static int addCustomer()  {
	int c=0;
	
	try(Connection connection=MySqlDbConnection.getConnection();){
	
//prepared here sql as already compiled	
	String sql="delete from customer where name='banu';";
	PreparedStatement preparedstatement=connection.prepareStatement(sql);
	
	/*	preparedstatement.setInt(1, customer.getId());
	
	preparedstatement.setString(2, customer.getName());
	preparedstatement.setString(3, customer.getCity());
	preparedstatement.setInt(4, customer.getAge());
	preparedstatement.setString(5, customer.getGender());

preparedstatement.setLong(6, customer.getContact());
c=preparedstatement.executeUpdate();

	}
	catch(Exception ex) {
		System.out.println("Exception caught");
		System.out.println(ex);
	}
	return c;
}
*/
}