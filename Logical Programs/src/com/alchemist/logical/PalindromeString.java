package com.alchemist.logical;

import java.util.Scanner;

public class PalindromeString {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String name = scn.next();
		boolean output = palindromeString(name);
		System.out.println("This String is pandromic: "+output);
	}
	
	public static boolean palindromeString(String name) {
		String input = name;
		String rev = "";
		for(int i = name.length()-1; i>=0;i--) {
			rev = rev + name.charAt(i);
		}
		if(input.equals(rev)) return true;
		else return false;
	}
}
