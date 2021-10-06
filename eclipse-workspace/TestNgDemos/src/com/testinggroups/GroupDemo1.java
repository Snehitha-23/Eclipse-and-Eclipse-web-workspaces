package com.testinggroups;

import org.testng.annotations.Test;

public class GroupDemo1 {
  @Test(groups={"devops","engineers"})
  public void f1() {
	  System.out.println("===devops and engineers in group1=====");
  }
  
  @Test(groups={"engineers"})
  public void f2() {
	  System.out.println("===engineers in group1=====");  
  }
  
  @Test(groups={"devops"})
  public void f3() {
	  System.out.println("===devops in group1====="); 
  }
  
}
