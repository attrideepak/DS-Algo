package javaproblems;

import java.util.HashSet;

public class FirstRepeatingWordInASentence {

	public static void main(String[] args) {
		String str = "      Has Raju, Kaju has has: today. tommmorow;              ice-cream Raju   ";
	//	String newString = str.replaceAll(" ", "");
	    String[] strings = str.trim().split("[\\W]+");
		//String[] strings = str.trim().split("[,;:.-]");
		for(int i = 0;i<strings.length;i++) {
			System.out.println(i+":"+strings[i]);
		}
		HashSet<String> set = new HashSet<String>(); 
		int min = -1;
		for (int i=strings.length-1; i>=0; i--) 
		{ 
			// If element is already in hash set, update min 
			if (set.contains(strings[i])) 
				min = i; 

			else // Else add element to hash set 
				set.add(strings[i]); 
		} 

		// Print the result 
		if (min != -1) 
		System.out.println("The first repeating element is " + strings[min]); 
		else
		System.out.println("There are no repeating elements"); 
	} 
		
	}
