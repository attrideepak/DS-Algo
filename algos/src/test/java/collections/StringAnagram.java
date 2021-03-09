package com.mylearnings.java.collections;

import java.util.Arrays;

//using array sort and array equals
public class StringAnagram {
	static void isAnagramFirst(String s1, String s2) {
		// Removing all white spaces from s1 and s2
		String copyOfs1 = s1.replaceAll("\\s", "");
		String copyOfs2 = s2.replaceAll("\\s", "");
		if (copyOfs1.length() != copyOfs2.length()) {
			System.out.println("Strings are not anagram");
		} else {
			// Changing the case of characters of both copyOfs1 and copyOfs2 and converting
			// them to char array
			char[] s1Array = copyOfs1.toLowerCase().toCharArray();
			char[] s2Array = copyOfs2.toLowerCase().toCharArray();
			// Sorting both s1Array and s2Array
			Arrays.sort(s1Array);
			Arrays.sort(s2Array);

			// Checking whether s1Array and s2Array are equal
			if (Arrays.equals(s1Array, s2Array))
				System.out.println("Strings are anagram");
			else
				System.out.println("Strings are not anagram");

		}
	}

	/*
	 * In this method, we go on checking each character of first string is present
	 * in second string. If it is present, we remove that character from second
	 * string and proceed to next character. If any character of first string is not
	 * present in second string, we break the loop and conclude that strings are not
	 * anagrams.
	 */
//	static void isAnagramSecond(String s1, String s2) {
//		// Removing white spaces from s1 and s2 and changing case to lower
//		String copyOfs1 = s1.replaceAll("\\s", "").toLowerCase();
//		String copyOfs2 = s2.replaceAll("\\s", "").toLowerCase();
//		if (copyOfs1.length() != copyOfs2.length()) {
//			System.out.println("Strings are not anagram");
//		} else {
//			// Converting copyOfs1 to char array
//			char[] s1ToArray = copyOfs1.toCharArray();
//			// Checking whether each character of s1ToArray is present in copyOfs2
//			for (char c : s1ToArray) {
//				int index = copyOfs2.indexOf(c);
//			}
//				int index = 0;
//				if (index != -1) {
//					// If character is present in copyOfs2, removing that char from copyOfs2
//					copyOfs2 = copyOfs2.substring(0, index) + copyOfs2.substring(index + 1, copyOfs2.length());
//					System.out.println("Strings are anagram");
//				}
//				
//
//				else {
//					System.out.println("Strings are not anagram");
//					
//				}
//			}
//			
//
//		}
	
/*
 * Anagram Program In Java Using HashMap
In this method, we construct one HashMap object with character as Key and character occurrences as Value.
We increment character count by 1 if the character is present in first string and decrement it by 1 
if that character is present in second string. 
At last, we check character count for each character in the map. 
If any count is not equal to 0, then given strings are not anagrams.
*/
	public static void main(String[] args) {
		isAnagramFirst("Mother In Law", "Hitler Woman");

		isAnagramFirst("keEk", "peeK");

		//isAnagramSecond("SiLeNt CAT", "LisTen Acp");

		//isAnagramSecond("Debit Card", "Bad Credit");
	}
}
