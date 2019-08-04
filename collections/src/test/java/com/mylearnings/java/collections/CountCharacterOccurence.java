package com.mylearnings.java.collections;

import java.util.ArrayList;

/*
 * Given a string, return the character that appears the maximum number of times in the string. 
 * The string will contain only ASCII characters, from the ranges ('a'-'z','A'-'Z','0'-'9'), and case matters. 
 * If there is a tie in the maximum number of times a character appears in the string, return the character that appears first in the string.
    For example, given the string text = abbbaacc, both a and b occur 3 times in text.  Since a occurs earlier, a is the answer.
    * */

import java.util.HashMap;

public class CountCharacterOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		countC("daasa");
	}
	
	static int countCharacter(String str) {
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
			for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			//char c = str.toLowerCase().charAt(i); //case where both lower and upper case are present convert every thing to lower case.
			//if(hm.get(c)!=null)
			if(hm.containsKey(c)){
				hm.put(c, hm.get(c)+1);
			}
			else
			{
				hm.put(c,1);
			}
		}
		System.out.println(hm);
		return 0;
	}
	
	static char countC(String str) {
		   final int ASCII_SIZE = 256; 
		   int count[] = new int[ASCII_SIZE]; 
		
	       
	       // Construct character count array from the input 
	        // string. 
	        int len = str.length(); 
	        for (int i=0; i<len; i++) {
	        count[str.charAt(i)]++; 
	        }
	        int max = -1;  // Initialize max count 
	        char result = ' ';   // Initialize result 
	       
	        // Traversing through the string and maintaining 
	        // the count of each character 
	        for (int i = 0; i < len; i++) {
	            if (max < count[str.charAt(i)]) { 
	                max = count[str.charAt(i)]; 
	                result = str.charAt(i); 
	            } 
	        } 
	       System.out.println(result);
	        return result;
	}
}


