package com.mylearnings.java.collections;

public class StringReverse {
 public static void main(String[] args) {
	useReverse("Deepak Attri");
	useIteration("Deepak attri");
	System.out.println(useRecursion("deepak attri"));
}
 //Using reverse method of stringbuffer class
 public static void useReverse(String str) {
	 StringBuffer reverse  = new StringBuffer(str);
	 System.out.println(reverse.reverse());
	 }
 //using custom code iteration
 public static void useIteration(String str) {
	 char[] c = str.toCharArray();
	 for(int i = c.length-1; i>=0;i--) {
		 System.out.print(c[i]);
	 }
	 System.out.println();
}
 //using recursion
 public static String useRecursion(String str) {
	 if(str==null||str.length()<=1) {
		 return str;
	 }   	
		 return useRecursion(str.substring(1))+str.charAt(0);	 
 }
 
 
}