package com.alchemist.logical;

import java.util.Scanner;

public class ReverseTheNumber {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = scn.nextInt();
		num = reverseInt_one(num);
		System.out.println("Reversed Number: "+num);
	}
	
	public static int reverseInt_one(int num) {
		int rev = 0;
		while(num!=0) {
			rev = rev*10 + num%10;
			num = num/10;
		}
		return rev;
	}
	
	public static int reverseInt_two(int num) {
	    StringBuffer sb = new StringBuffer(String.valueOf(num));
	    StringBuffer rev = sb.reverse();
	    return Integer.parseUnsignedInt(rev.toString());
	}
	
	public static int reverseInt_three(int num) {
	    StringBuilder sb = new StringBuilder();
	    sb.append(num);
	    StringBuilder rev = sb.reverse();
	    return Integer.parseUnsignedInt(rev.toString());
	}
}
