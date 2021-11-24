package com.qa.tests.poly;


public class SumClass {

	static int count=0;
	{
		count++;
	}
	
	SumClass(){
		
		
	}
	SumClass(int i){
		
		
	}
	
	SumClass(double d){
		
	}
	
	public static void main(String[] args) {
		
		SumClass s= new SumClass();
		SumClass s1= new SumClass(10);
		SumClass s2= new SumClass(12.5);
		
		
		
		System.out.println("Objects are :" +count);
		
		
		
		
	}
	
	
	

}
