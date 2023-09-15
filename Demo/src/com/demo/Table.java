package com.demo;

public class Table {
	void usingfor() {
		int Number=5;
		for (int i = 1; i <=10; i++) {
			Number = Number * i;
			
		}
		System.out.println(Number);
		
	}
	void usingwhile() {
		System.out.println("AAAAA");
		
	}
	void usingdowhile() {
		
	}
	void foreach() {
		
	}

	public static void main(String[] args) {
		Table obj= new Table();
	//	obj.foreach();
	//	obj.usingdowhile();
		obj.usingfor();
		obj.usingwhile();
		
		
		
	}
}
