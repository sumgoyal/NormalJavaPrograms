package com.qa.tests.poly;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Prac {
    public static void main(String args[]) {
    	
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the Sentance");
    	String str=sc.next();
    	int len=str.length();
    	
    	if(Character.isLowerCase(str.charAt(0))) {
    		System.out.println("Invalid");
    		System.out.println("Enter Valid");
    		return;	
    	}
    	
    	String IpString=Character.toLowerCase(str.charAt(0))+str.substring(0, len);
    	
    	StringTokenizer token=new StringTokenizer(IpString);
    	int tknum=token.countTokens();
    	
    	String[] strArr=new String[tknum];
    	for(int i=0;i<=tknum;i++) {
    			strArr[i]=token.nextToken();
    		
    	}
    	
    	for(int i=0;i<tknum-1;i++) {
    		for(int j=0;j<tknum-i-1;j++) {
    			if(strArr[j].length()>strArr[j+1].length()) {
    				String t=strArr[j];
    				strArr[j]=strArr[j+1];
    				strArr[j+1]=t;
    			}
    			
    			
    		}
    	}
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    }       
}