package com.mylearnings.java.collections;

//Good problem
//Java program to find the smallest positive value that cannot be 
//represented as sum of subsets of a given sorted array 
public class FindSmallestInteger {
	// Returns the smallest number that cannot be represented as sum 
    // of subset of elements from set represented by sorted array arr[0..n-1] 
	static int findSmallestArray(int[] array) {
		int sum = 1; // Initialize result 
		// Traverse the array and increment 'sum' if arr[i] is 
        // smaller than or equal to 'sum'.
		for (int i = 0; i < array.length && array[i] <= sum; i++) 
            sum = sum + array[i]; 
  
        return sum; 
				
	}
	public static void main(String[] args) {
		int[] array = {1, 2, 4, 10, 11, 15}; 
		System.out.println(findSmallestArray(array));
	}
}
