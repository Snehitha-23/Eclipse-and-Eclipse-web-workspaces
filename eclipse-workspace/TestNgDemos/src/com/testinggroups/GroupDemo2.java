package com.testinggroups;

import org.testng.annotations.Test;

public class GroupDemo2 {
  @Test(groups={"devops","engineers"})
  public void f1() {
	  System.out.println("===devops and engineers in group2=====");
  }
  
  @Test(groups={"engineers"})
  public void f2() {
	  System.out.println("===engineers in group2=====");  
  }
  
  @Test(groups={"devops"})
  public void f3() {
	  System.out.println("===devops in group2====="); 
  }
  
}
