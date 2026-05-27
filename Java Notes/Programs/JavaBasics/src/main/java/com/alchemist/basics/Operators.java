package com.alchemist.basics;

public class Operators {
	public static void main(String[] args) {
		int a = 5;
		System.out.println(a++);  //5
		a++;
		System.out.println(a++);  //7
		System.out.println(a);    //8
		
		int b = 8;
		System.out.println(++b);  //9
		++b;
		System.out.println(++b);  //11
		System.out.println(b);    //11
		
		int c = 3;
		int d = ++c + c++;
		System.out.println(d);   //8   --> as c increment to 4 first , 4 + 4
		
		String str = "rohit";
		if(str instanceof String) {
			System.out.println("It is string");
		}else {
			System.out.println("It is not a string");
		}
	}
}
