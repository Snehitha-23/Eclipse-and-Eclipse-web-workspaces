package com.demo.testing.basic;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class FirstTest {
	int s;
  @Test(priority =2 )
  public void atest() {
	  System.out.println("test case 1");
	  System.out.println(s);
  }
  @Test(priority = 0)
  public void btest() {
	 System.out.println("test case 2");
	 s+=10;
	 System.out.println(s);
  }
  @Test(priority=1 , enabled=true, alwaysRun=true, dependsOnMethods="btest()")
  public void ctest() {
	 System.out.println("test case 3");
	 //assertTrue(true);
	 System.out.println(s);
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("before method");
	  s=10;
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("after method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("after class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("before test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("after test");
  }

}
