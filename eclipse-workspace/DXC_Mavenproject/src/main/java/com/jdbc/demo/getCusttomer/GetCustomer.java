package com.jdbc.demo.getCusttomer;

import java.util.List;

import com.jdbc.demo.dao.Customerdao;

import com.jdbc.demo.insert.Customer;


public class GetCustomer {


	public static void main(String[] args) {


		Customerdao dao=new Customerdao();


		Customer customer=dao.getCustomerById(100);


		if(customer!=null) {


			System.out.println("Customer found with below details ");


			System.out.println(customer);



		}else {



			System.out.println("Customer Not found");



		}


		customer=dao.getCustomerByContact(1231231117
);


		if(customer!=null) {



			System.out.println("Customer with contact found with below details ");



			System.out.println(customer);



		}else {



			System.out.println("Customer Not found with that contact");



		}

		List<Customer> customerList=dao.getCustomerByGender("M");



		if(customerList!=null && customerList.size()>0 ) {



			System.out.println("Customers found with gender");



			for(Customer c:customerList) {



				System.out.println(c);



			}



		}else {



			System.out.println("No customer found with that gender");



		}


		System.out.println("\n\nFinding customers by age range");



		List<Customer> customerList2=dao.getCustomersByAgeRange(15, 30);



		if(customerList2!=null && customerList2.size()>0 ) {



			System.out.println("Customers found with age range");



			for(Customer c:customerList2) {



				System.out.println(c);



			}



		}else {



			System.out.println("No customer found with that age range");

		}


	}

}