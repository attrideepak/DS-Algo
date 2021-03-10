package javaproblems;

import java.util.Arrays;

//Given an array of integers (both odd and even), sort them in such a way that the first part of the array contains odd numbers sorted in descending order
//, rest portion contains even numbers sorted in ascending order.

public class TwoWaySort {
	 static void twoWaySort(int arr[], int n) 
	    { 
	        // Make all odd numbers negative 
	        for (int i=0 ; i<n ; i++) 
	           // if ((arr[i] & 1) != 0)// Check for odd 
	        	if(arr[i]%2==1)
	                arr[i] *= -1; 
	       
	        // Sort all numbers 
	        Arrays.sort(arr); 
	       
	        // Retaining original array 
	        for (int i=0 ; i<n ; i++) 
	            if ((arr[i] & 1) != 0) 
	                arr[i] *= -1; 
	    } 
	      
	    // Driver Method 
	    public static void main(String[] args) 
	    { 
	        int arr[] = {1, 3, 2, 7, 5, 4}; 
	          
	        twoWaySort(arr, arr.length); 
	          
	        System.out.println(Arrays.toString(arr)); 
	    } 

}
