package com.demo;

public class exceptionHandling {

	void method() {
		try {
			int i = 50 / 0;
			System.out.println(i);
		} catch (ArithmeticException e) {
			System.out.println("Exception");
		}
		finally {
			System.out.println("*** Finished ***");
		}
	}

	public static void main(String[] args) {
		exceptionHandling obj = new exceptionHandling();
		obj.method();
	}
}
