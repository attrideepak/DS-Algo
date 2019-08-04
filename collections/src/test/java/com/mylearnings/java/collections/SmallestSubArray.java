package com.mylearnings.java.collections;

public class SmallestSubArray {

	public static void main(String[] args) {
		int arr[] = {-4, 5,-3, 7,-5,-7}; 
		smallestSubArray(arr);

	}
	
	
	static int smallestSubArray(int a[]) {
		int cur_min = a[0];
		int min_so_far =a[0];
		
		
		for(int i = 1;i<a.length;i++) {
			cur_min = Math.min(a[i], cur_min+a[i]);
         
           
			min_so_far = Math.min(min_so_far, cur_min);
			
		}
		
		System.out.println(min_so_far);
		return min_so_far;			
	}

}
