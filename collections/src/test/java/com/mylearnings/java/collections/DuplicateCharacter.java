package com.mylearnings.java.collections;

import java.util.HashMap;
import java.util.Iterator;

public class DuplicateCharacter {
	public static void main(String[] args) {
		//duplicateChanracter("dfsghsrtestghstgdffbkfaD");
		usingCharArray("gsvdjsdvfhbsvhdsfhbds");
		
	}
	static void duplicateChanracter(String str) {
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		//char[] cc = str.toCharArray();
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
	}
	static void usingCharArray(String str){
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		char[] c = str.toCharArray();
		for(char tempc : c) {
			if(hm.get(tempc) != null){
				hm.put(tempc, hm.get(tempc)+1);
			}
			else
				hm.put(tempc,1);				
		}
		Iterator<Character> temp = hm.keySet().iterator();
		while(temp.hasNext())
		{
			Character tc = temp.next();
			if(hm.get(tc)>1) {
				System.out.println("The character "+ tc+ " is repeated "+ hm.get(tc)+ " times");
			}
		}
	}
}
