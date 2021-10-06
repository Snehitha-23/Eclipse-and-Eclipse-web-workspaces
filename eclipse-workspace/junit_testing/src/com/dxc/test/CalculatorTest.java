package com.dxc.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import junit_testing.Calculator;

class CalculatorTest {
	Calculator ob1;
	int expected,p1,p2,p3;
	@BeforeAll
	public void beforeAll() {
		
	System.out.println("========================BEFORE ALL==============");
	}
	
	@AfterAll
	public void afterAll() {
		
	System.out.println("========================AFTER ALL==============");
	}
	@BeforeEach
	public void before() {
		System.out.println("============BEFORE=================");
	 ob1=new Calculator();
		 expected=10;
		 p1=5;
		 p2=5;
		p3=15;
	}
	
	
	
// junit is whiteboxtestimg and we will have samll units here each test case is independent of other.
	@Test
//	thiss annnotation is different in junit4 here junit5 jupiter
	void testAdd() {
//		by default the below line
//		fail("Not yet implemented");
		
		int actual=ob1.add(p1, p2);
		assertEquals(expected,actual);
	}

	@Test
	//@Disabled==>to disabble
	
	void testSubForParameter1Positive() {
		//fail("Not yet implemented");by default fail
		//assertTrue(true); makes pass
//		these are common to all so make before each seperately
//		Calculator ob1=new Calculator();
//		int expected=10;
//		int p1=15,p2=5;
		int actual=ob1.sub(p3, p2);
		assertEquals(expected,actual);
		
	}
	
	@Test
	void testSubForParameter2Positive() {
		//fail("Not yet implemented");
		//assertTrue(false);
		
//		Calculator ob1=new Calculator();
//		int expected=10;
//		int p1=5,p2=15;
		int actual=ob1.sub(p1, p3);
		assertEquals(expected,actual);
	}
	
	
	}

//https://junit.org/junit5/docs/current/user-guide/
// https://www.baeldung.com/junit-5
