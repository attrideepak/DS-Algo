package javaproblems;

import java.util.HashMap;
//https://www.youtube.com/watch?v=_yGf2rxwZlA&t=722s

//A Java program to find if there is a zero sum subarray 
public class ZeroSumArray {
	// Returns true if arr[] has a subarray with sero sum 
	static Boolean subArrayExists(int arr[]) {
	HashMap<Integer, Integer> hM =  new HashMap<Integer, Integer>(); 
	// Initialize sum of elements 
    int sum = 0;

    for (int i = 0; i < arr.length; i++) {
        sum = sum + arr[i];    
        // Return true in following cases 
        // a) Current element is 0 
        // b) sum of elements from 0 to i is 0 
        // c) sum is already present in hash map 
        if (arr[i] == 0 || sum == 0 || hM.get(sum) != null)
        	 
            return true; 

        // Add sum to hash map 
        hM.put(sum, i);
   
        
    }
 // We reach here only when there is 
    // no subarray with 0 sum 
    
    return false;
}
	public static void main(String arg[]) 
    { 
        int arr[] = {-3,2,-2,3,4,1,6,7,-7}; 
        if (subArrayExists(arr)) 
            System.out.println("Found a subarray with 0 sum"); 
        else
            System.out.println("No Such Sub Array Exists!");          
    }       
}