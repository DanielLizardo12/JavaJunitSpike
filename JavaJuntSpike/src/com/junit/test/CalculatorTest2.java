package com.junit.test;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.junit.service.Calculator;
//c6
@RunWith(value = Parameterized.class)
public class CalculatorTest2 {
	
	@Parameters
	public static Iterable<Object[]> getData(){
		return Arrays.asList(new Object[][] {
			{3, 1, 4}, {2, 3, 5}, {1, 1, 2}
		});
	}
	
	Calculator cal = new Calculator();


	private int a, b, exp;
		
	public CalculatorTest2(int a, int b, int exp) {
		this.a = a;
		this.b = b;
		this.exp = exp;
	}
		

	@Test
	public void testAddParam() {
		int result = cal.add(a , b);
		assertEquals(exp , result);
	}


}
