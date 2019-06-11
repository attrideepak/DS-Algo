package com.mylearnings.java.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

//java program to find duplicate elements in an array, using hashset
public class DuplicateArray {
	public static void main(String[] args) {
		String[] strArray = {"Java", "JSP", "Servlets", "Java", "Struts", "JSP", "JDBC"};
		duplicateElement(strArray);
		duplicateElementAgain(strArray);
	}
		static void duplicateElement(String[] array) {
		HashSet<String> set = new HashSet<String>();
		for(String arrayElement:array) {
			if(!set.add(arrayElement)) {
				System.out.println("Duplicate Element is : "+arrayElement); //print duplicate elements that are not added to 
																			//hashset bcoz hashset does not allow duplicates
			}
			}
		}
		
		//Java program to find duplicate element in an array using hash map
		static void duplicateElementAgain(String[] array) {
			HashMap<String,Integer> map = new HashMap<String,Integer>();
			for(String arrayElement:array) {
				if(map.get(arrayElement)!=null) {
					map.put(arrayElement, map.get(arrayElement)+1);
				}
				else {
					map.put(arrayElement,1);
				}
			}
			Iterator<String> temp = map.keySet().iterator();
			while(temp.hasNext()) {
				{
					String ts = temp.next();
					if(map.get(ts)>1) {
						System.out.println("The character "+ ts+ " is repeated "+ map.get(ts)+ " times");
					}
			}
		}
		}
		}


