package com.testtng.parameters;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest1 {
  @Test
  @Parameters({"browsername"})
  public void passSingleParameter(String browserName) {
	  System.out.println("browser choosen"+browserName);
  }
  
  @Test
  @Parameters({"uname","pwd"})
  public void login(@Optional("user")String username) {
	  System.out.println("Login with username "+username);
  }

}
