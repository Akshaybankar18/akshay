package com.demo;

public class getterSetter {
	int password;

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	public static void main(String[] args) {
		getterSetter obj = new getterSetter();
		obj.setPassword(123);
		System.out.println(obj.getPassword());
	}
}
