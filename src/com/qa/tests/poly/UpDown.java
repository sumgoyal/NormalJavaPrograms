package com.qa.tests.poly;

import java.util.Scanner;

public class UpDown {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence:");
		String str = sc.nextLine();

		String fName = str.substring(0, 1);
		String lName = str.substring(1, str.length());

		String f = fName.toUpperCase();
		String l = lName.toLowerCase();

		String name = f + l;
		System.out.println(name);

		A a=new A();
		a.m1();
		
		
		
	}

}
