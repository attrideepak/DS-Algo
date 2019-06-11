package com.mylearnings.java.collections;

public class Palindrome {
	
	//Java method to check if string is palindrome  by reversing the string
	
	static void checkPalindromebyReversing(String string) {
		String rev = "";
		for(int i = string.length()-1; i>=0; i--) {
			rev += string.charAt(i);
		}
		if(string.equals(rev)) {
			System.out.println("String " +string+ " is a palindrome");
		}
		else
		{
			System.out.println("String " +string+  " is not a palindrome");
		}
	}
	
	static void checkPalindromebyReversingInteger(int n) {
		int rev = 0;
		int r;
		 int t = n;
	while(t > 0) {
		r = t%10;
		rev = (rev*10)+r;
		t = t/10;
	}
	if(n==rev) 
	{
		System.out.println("Integer " +n+ " is a palindrome");
	}
	else {
	
		System.out.println("Integer " +n+  " is not a palindrome");
	}
	
	}
	
	public static void main(String[] args) {
		checkPalindromebyReversing("radar");
		checkPalindromebyReversing("121");
		int n = 121;
		checkPalindromebyReversingInteger(n);
	}

}
