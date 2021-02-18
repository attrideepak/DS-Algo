package com.mylearnings.java.collections;

import java.util.ArrayList;

/*
 * Given a string comprised of lowercase letters in the range ascii[a-z],
 *  determine the length of the smallest substring that contains all of the letters present in the string.
 
For example, given the string s = dabbcabcd, the list of all characters in the string is [a, b, c, d].  
Two of the substrings that contain all letters are dabbc and abcd.  The shortest substring containing all the letters is 4 characters long, abcd.
 
 * */

public class ShortestSubString {

	 public static void main(String[] args) {
	        subStringLength("dabbcabcd");

	    }

	    static int subStringLength(String str) {
	        ArrayList<Character>characterList = new ArrayList<Character>();
	        int subStringLength = Integer.MAX_VALUE;

	        for(int i = 0;i<str.length();i++) {
	            if(!characterList.contains(str.charAt(i)))
	                characterList.add(str.charAt(i));
	        }

	        for(int j =0; j<str.length();j++) {
	            for(int k = j+1; k<str.length();k++) {
	                String sub = str.substring(j, k);
	                ArrayList<Character>subList = new ArrayList<Character>();
	                for(int i = 0;i<sub.length();i++) {
	                    if(!subList.contains(sub.charAt(i)))
	                        subList.add(sub.charAt(i));
	                }

	                if(subList.equals(characterList)&&sub.length()<subStringLength) {
	                        subStringLength = sub.length();
	                }
	            }

	        }
	        System.out.println(subStringLength);
	        return subStringLength;
	    }
}

