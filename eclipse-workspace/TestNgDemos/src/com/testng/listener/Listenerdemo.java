package com.testng.listener;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Listenerdemo {
  @Test
  public void testToPass() {
	  System.out.println("test to pass");
	  assertTrue(true);
  }
  
  @Test
  public void testToFail() {
	  System.out.println("test to fail");
	  assertTrue(false);
  }
  
  @Test
  @Ignore
  public void testToIgnore() {
	  System.out.println("test to skip");
	  assertTrue(true);
  }
  
}
