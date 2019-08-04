package com.mylearnings.java.collections;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
/*We define a sentence to be a string of space-separated words that starts with a capital letter followed by lowercase letters and spaces,
 *  and ends with a period, i.e., it satisfies the regular expression ^[A-Z][a-z ]*\.$. We want to rearrange the words 
 *  in a sentence such that the following conditions are satisfied:
	 
Each word is ordered by length, ascending.
Words of equal length must appear in the same order as in the original sentence.
The rearranged sentence must be formatted to satisfy the regular expression ^[A-Z][a-z ]*\.$
 
For example, consider the sentence Cats and hats. First the words are ordered by length, maintaining original order for ties: 
[and, cats, hats]. Now reassemble the sentence, applying formatting: And cats hats.
*/
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;


public class RearrangeSentence {

	public static void main(String[] args) {
		String sentence = "The lines are printed in reverse order.";
		rearrange(sentence);

	}
	static void rearrange(String str) {
		
		String input = str.substring(0, str.length()-1);
		StringBuilder sb = new StringBuilder();
		int smallestWordLength = 0;
		String smallestWord;
		System.out.println(input);
		String[] words = input.toLowerCase().split(" ");
		
		System.out.println(Arrays.toString(words));
		
		for (int i = 0; i < words.length; i++) 
        { 
			String temp = words[i];
			int j = i-1;
			while(j>=0 && temp.length() < words[j].length()) {
				words[j+1]=words[j];
				j--;
			}
			words[j+1] = temp;
        } 
		System.out.println(Arrays.toString(words));
	    
		String result = null;
		for(int j = 0; j<words.length; j++) {
			sb = sb.append(words[j]).append(" ");
			result = sb.substring(0, 1).toUpperCase() + sb.substring(1).trim() + ".";
		}
		System.out.println(result);		
		
	}

}
