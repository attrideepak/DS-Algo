package com.mylearnings.java.collections;
	
public class Test {
	
	public static void main(String[] args) {
		int arr[]= {1,3,5,2,6,7};
		
		for(int i =0;i<arr.length-1;i++) {
			System.out.println("Value at index i: "+arr[i]+" Value at index i: "+arr[i+1]);
		}
		
		System.out.println();
		System.out.println();
		
		for(int i =0;i<arr.length-1;i++) {
			System.out.println("Value at index i: "+arr[i]+" Value at index i: "+arr[i++]);
		}
		
		System.out.println();
		System.out.println();
		
		for(int i =0;i<arr.length-1;i++) {
			System.out.println("Value at index i: "+arr[i]+" Value at index i: "+arr[++i]);
		}
	}
	

}
