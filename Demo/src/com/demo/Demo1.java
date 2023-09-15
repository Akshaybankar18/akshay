package com.demo;
public class Demo1 {
	public static void main(String[] args) {
		String s1="India";
		String s2="Hindustan";
		String s3="Republic of India";
		String s4="india";
		String concat1=s1.concat(s2);
		System.out.println(concat1);
		String concat2=concat1.concat(s3);
		System.out.println(concat2);
		String upper=s1.toUpperCase();
		System.out.println(upper);
		System.out.println(s3.toLowerCase());
		System.out.println(concat2.length());
		System.out.println(s4.charAt(2));
		System.out.println(concat1.contains(s2));
		System.out.println(s1.indexOf('I'));
		System.out.println(s3.isEmpty());
		System.out.println(s3.compareTo(s3));
		System.out.println(s3.compareTo(s2));
		System.out.println(s1.endsWith(s1));
	}
}
