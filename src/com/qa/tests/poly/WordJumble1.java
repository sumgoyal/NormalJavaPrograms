package com.qa.tests.poly;

import java.util.Scanner;
import java.util.StringTokenizer;

public class WordJumble {

	public static void main(String[] args) {

//1.Scanner class to take input from console

	Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String str = sc.nextLine();
        int len = str.length(); 
//2.Condition to ensure sentance start with uppercase
		
        if (Character.isLowerCase(str.charAt(0))) {
            System.out.println("Invalid Input!");
            System.out.println("Sentence should start with upper case letter.");
            return;
        }
		
        //3.breaking input stream into tokens parts
 
        String inuptString = Character.toLowerCase(str.charAt(0)) + str.substring(1, len - 1);
        StringTokenizer st = new StringTokenizer(inuptString);
        int wordCount = st.countTokens();
        String strArr[] = new String[wordCount];
        
        
        for (int i = 0; i < wordCount; i++) {
            strArr[i] = st.nextToken();
        }
 //4.sorting according to length

        for (int i = 0; i < wordCount - 1; i++) {
            for (int j = 0; j < wordCount - i - 1; j++) {
                if (strArr[j].length() > strArr[j + 1].length()) {
                    String t = strArr[j];
                    strArr[j] = strArr[j+1];
                    strArr[j+1] = t;
                }
            }
        }
        strArr[0] = Character.toUpperCase(strArr[0].charAt(0))
                + strArr[0].substring(1);
           //5. Iterating sorted array      
        
    System.out.println("Sorted String:");
    for (int i = 0; i < wordCount; i++) {
        System.out.print(strArr[i]);
        if (i == wordCount - 1) {
            System.out.print(".");
        }
        else {
            System.out.print(" ");
        }
    }
}
}