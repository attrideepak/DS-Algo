package com.mylearnings.java.collections;

public class StringReverse {
 public static void main(String[] args) {
	//useReverse("This is a sample test");
	//useIteration("Deepak attri");
	//System.out.println(useRecursion("Deepak attri"));
	useRev("Deepak Attri");
}
 //Using reverse method of stringbuffer/string builder class
 public static void useReverse(String str) {
	 StringBuilder reverse  = new StringBuilder(str);
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
 
 public static void useRev(String str) {
	 String rev = "";
	 for(int i = str.length()-1;i>=0;i--) {
		 rev= rev + str.charAt(i);
	 }
	 System.out.println(rev);
 }
 
 
}