package com.alchemist.logical;

import java.util.Scanner;

public class ReverseTheString {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String name = scn.next();
		String rev = reverseString_one(name);
		System.out.println("Reversed String is: "+rev);
	}
	
	public static String reverseString_one(String name) {
		String rev = "";
		for(int i = name.length()-1; i>=0;i--) {
			rev = rev + name.charAt(i);
		}
		return rev;
	}
	
	public static String reverseString_two(String name) {
		String rev = "";
		char[] a = name.toCharArray();
		for(int i = a.length-1; i>=0; i--) {
			rev = rev + a[i];
		}
		return rev;
	}
	
	public static String reverseString_three(String name) {
		StringBuffer sb = new StringBuffer(name);
		return sb.reverse().toString();
	}
	
	public static String reverseString_four(String name) {
		StringBuilder sb = new StringBuilder();
		sb.append(name);
		return sb.reverse().toString();
	}
}
