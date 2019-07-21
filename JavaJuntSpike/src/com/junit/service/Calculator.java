package com.junit.service;

public class Calculator {
	
	//c 1
	public static int sum(int a, int b) {
		return a + b;
	}
	
	public static int sub(int a, int b) {
		return a - b;
	}
	
	//c 2
	public int ans;
	
	//c 2
	public Calculator() {
		ans  = 0;
	}
	
	//c 2
	public int add(int a, int b) {
		ans = a + b;
		return ans;
		
	}
	
	//c 2
	public int subs(int a, int b) {
		ans = a - b;
		return ans;
	}
	
	//c 2
	public int add(int v) {
		ans += v;
		return ans;
	}
	
	public int subs(int v) {
		ans -= v;
		return ans;
	}
	
	//c 2
	public int ans() {
		return ans;
	}
	
	//c 2
	public void clear() {
		ans = 0;
	}
	
	
	//c4
	public int div(int a, int b) {
		if(b == 0) {
			throw new ArithmeticException("you can't divide 0");
		}
		ans =  a / b;
		return ans;
	}
	
	//c4
	public void timeOutAlg() {
	//	try {
	//		Thread.sleep(2000);
	//	} catch (InterruptedException e) {
	//		// TODO Auto-generated catch block
	//		e.printStackTrace();
	//	}
		for (;;);
	}
	
	public static void main(String args[]) {
		
	}

}
