package com.demo.cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ProductStepDefn {
	@Given("I navigate to the login page")
	public void i_navigate_to_the_login_page() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
	    System.out.println(" navigateb to login page");
	}

	@When("I submit username and password")
	public void i_submit_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("sub,it username and password");
	}

	@Then("I should be logged in")
	public void i_should_be_logged_in() {
	    // Write code here that turns the phrase above into concrete actions
	  System.out.println("logged in");
	}

	@Given("User search for Lenovo Laptop")
	public void user_search_for_Lenovo_Laptop() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("user search for lenovo laptop");
	}

	@When("Add the first laptop that appears in the search result to the basket")
	public void add_the_first_laptop_that_appears_in_the_search_result_to_the_basket() {
	    // Write code here that turns the phrase above into concrete actions
	  System.out.println("add first laptop ");
	}

	@Then("User basket should display with added item")
	public void user_basket_should_display_with_added_item() {
	    // Write code here that turns the phrase above into concrete actions
	  System.out.println("user basket with added item");
	}

	@Given("User navigate for Lenovo Laptop")
	public void user_navigate_for_Lenovo_Laptop() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("user navigate for lenovo");
	}

	@When("Add the laptop to the basket")
	public void add_the_laptop_to_the_basket() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("add laptop to basket");
	}


}
