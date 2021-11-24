package com.qa.tests.poly;

import java.util.*;
public class Enumeration {

	public static void main(String[] args) {
		
		Vector<Integer> v= new Vector<Integer>();
		for(int i=0;i<=10;i++) {
			v.addElement(i);
		}
		System.out.println("allElements= "+v);
		
		
		Iterator<Integer> itr=v.iterator();
		
		while(itr.hasNext()) {
			Integer I=itr.next();
		
			if(I%2==0) {
				System.out.print("Even Elements :"+v);
			}
			else {
			itr.remove();
			}
		System.out.println("All elements are :"+v);
		}
		

}
}
