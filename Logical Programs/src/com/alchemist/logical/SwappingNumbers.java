package com.alchemist.logical;

public class SwappingNumbers {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println("Numbers before swapping are 'a':"+a+"'b':"+b);
		System.out.println("Swapping two numbers");
		swapLogic_one(a,b);
		System.out.println("Numbers after swapping are 'a':"+a+"'b':"+b);
	}
	
	public static void swapLogic_one(int a, int b) {
		int t = a;
		a = b;
		b = t;
	}
	
	public static void swapLogic_two(int a, int b) {
		a = a + b;
		b = a - b;
		a = a - b;
	}
	
	public static void swapLogic_three(int a, int b) {
		a = a/b;
		b = a/b;
		a = a/b;
	}
	
	public static void swapLogic_four(int a, int b) {
		b = a^b;
		a = a^b;
	}
}
