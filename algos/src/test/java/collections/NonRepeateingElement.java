package com.mylearnings.java.collections;
//How to find first non-repeating element in array of integers?
import java.util.Iterator;
import java.util.LinkedHashMap;

public class NonRepeateingElement {
	
	public static void main(String[] args) {
		int array[] = {3,2,4,5,6,4,4,4,2,6,7};
		nonRepeating(array);
	}
	
	static void nonRepeating(int[] arr) {
		LinkedHashMap<Integer, Integer> lmap = new LinkedHashMap<Integer,Integer>();
		
		for(int element: arr) {
			if(lmap.get(element)!=null) {
				lmap.put(element,lmap.get(element)+1);
			}
			else {
					lmap.put(element,1);
				}
			}
		Iterator<Integer>temp=lmap.keySet().iterator();
		while(temp.hasNext()) {
			Integer ts = temp.next();
			if(lmap.get(ts)==1) {
				System.out.println("First non repeating element is : "+ts);
				break;
			}
		}
		}
		
	}

