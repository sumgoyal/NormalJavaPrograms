package com.qa.tests.poly;

public class PolyTest {

	
	public void m1(int i){
		System.out.println("Integer argument");
		
	}
	
	public void m1(float f) {
		System.out.println("Float argument");
	}
	
	public static void main(String[] args) {

		PolyTest p=new PolyTest();
		p.m1('a');
		p.m1(30l);
		
		
	}

}
