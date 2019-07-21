package com.junit.service;

public class Calculator {
	
	public static int sum(int a, int b) {
		return a + b;
	}
	
	public static int sub(int a, int b) {
		return a - b;
	}
	
	public static void main(String args[]) {
		 int a = 4;
		 int b = 4;
		 int res = sum(a, b);
		 int res2 = sub(a, b);
		 int esperado = 8;
		 
		 if(sum(a, b) == esperado) {
			 System.out.println("Este programa está bien hecho.");
		 }else {
			 System.out.println("Este programa está mal hecho.");
		 }
		 
		 System.out.println(a + " - " + b + " = " + res2);
		 System.out.println(a + " + " + b + " = " + res);
	}

}
