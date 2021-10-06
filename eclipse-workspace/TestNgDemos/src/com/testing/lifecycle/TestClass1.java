package com.testing.lifecycle;

import org.testng.annotations.Test;

public class TestClass1 extends AbstractClass {
  @Test
  public void test1() {
	  System.out.println("******  TEST1 in class1 ********");
  }
  @Test
  public void test2() {
	  System.out.println("******  TEST2 in class2 ********");
  }
}
