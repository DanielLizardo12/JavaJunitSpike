package com.junit.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.junit.service.Calculator;

public class CalculatorTest { 
	// C1 Calculator cal = new Calculator();
	
	//c 2
	Calculator cal;
	
	
	//c 2
	@Before
	public void before() {
		System.out.println("before()");
		cal =  new Calculator(); 
	}
	
	
	//c 2
	@After
	public void after() {
		cal.clear();
		System.out.println("after()");
	}
	
	
	
	//c 1
	@Test
	public void testSum() {
		System.out.println("sum()");
		int res = cal.sum(2, 3);
		int expected = 5;
		assertEquals(expected, res);  
	}
	
	//c 1
	@Test
	public void testSub() {
		System.out.println("sub()");
		int res =  cal.sub(3, 2);
		int expected = 1;
		assertEquals(expected, res);
		
	}
	
	//c4 
	@Test
	public void testDiv() {
		cal.div(5, 2);
	}
	
	//c4
	@Test(expected =  ArithmeticException.class)
	public void testDivCero() {
		cal.div(5, 0);
	} 
	
	
	//c4
	@Test(timeout = 100)
	public void testTimeOut() {
		cal.timeOutAlg();
	}
	
	//c5
	@BeforeClass
	public static void beforeClass() {
		System.out.println("beforeClass()");
	}
	
	//c5
	@AfterClass
	public static void afterClass() {
		System.err.println("afterClass()");
	}
	
	
}
