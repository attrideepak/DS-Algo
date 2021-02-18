package com.mylearnings.java.collections;

import java.util.HashMap;
import java.util.Iterator;

public class DuplicateString {
	public static void main(String[] args) {
		findDuplicateWord("i am Batman but batman is superman is spiderman and spiderman is batman");
	}
	static void findDuplicateWord(String str){
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		String[] s = str.split(" ");  
		for(String tempString : s) {
			String temp = tempString.toLowerCase();
			if(hm.get(temp) != null){
				hm.put(temp, hm.get(temp)+1);
			}
			else
				hm.put(temp,1);				
		}
		Iterator<String> temp = hm.keySet().iterator();
		while(temp.hasNext())
		{
			String ts = temp.next();
			if(hm.get(ts)>1) {
				System.out.println("The word "+ ts+ " is repeated "+ hm.get(ts)+ " times");
			}
		}
	}

}
/* 1.Split the entire string using str.split(" ") on basis of space and save to a string array s.
 * 2.Create an empty hash map hm.
 * 3.Iterate over the string array to save each element of the array in the Hashmap.
 * 4.If the array element is not present in the hashmap then put the key and value to hashmap with value as 1
 * 5.If array element is already present in the hashmap then put the key and increase value by 1
 * 6. Iterate over the hashmap to get the keys. 
 */

