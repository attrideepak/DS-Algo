package com.mylearnings.java.collections;
import java.io.*;


public class LargestSumContiguousSubarray {
	// Java program to print largest contiguous 
	// array sum 
	
	  
	    static int maxSubArraySum(int a[], int size) 
	    { 
	    	//int a[] = {-2, -3, 4, -1, -2, 1, 5, -3};      
	    	/*
	    	 * i = 1, cur_max = max(-3,-5)=-3, max_so_far = max(-2,-3) = -2
	    	 * i = 2, cur_max = max(4,1) = 4, max_so_far = max(-2,4) = 4, start = 2, end = 2
	    	 * i = 3, cur_max = max(-1,3) = 3, max_so_far = max(4,3) = 4,
	    	 * i = 4, cur_max = max(-2,1) = 1, max_so_far = max(4,1) = 4
	    	 * i = 5, cur_max = max(1,2) = 2, max_so_far = max(4,2) = 4
	    	 * i = 6, cur_max = max(5,7) = 7, max_so_far = max(4,7) = 7
	    	 * i = 7, cur_max = max(-3,4) = 4, max_so_far = max(7,4) = 7
	    	*/
	    int max_so_far = a[0]; 
	    int curr_max = a[0]; 
	    int start = 0;
	    int end = 0	;  
	    for (int i = 1; i < size; i++) 
	    { 
	        curr_max = Math.max(a[i], curr_max+a[i]);
	        if(curr_max == a[i]) {
	        	start = i;
	        }
	        max_so_far = Math.max(max_so_far, curr_max); 
	        if(max_so_far == curr_max) {
				end = i;
	        }
	        	    } 
	    System.out.println("Starting index " + start); 
	    System.out.println("Ending index " + end); 
	    return max_so_far; 
	    } 
	    
	    
	   static int largestSumContigousArray(int a[]) {
		   int max_so_far = 0;
		   int curr_max = 0;
		   int start = 0;
		   int end = 0;
		   int s = 0;
		   for(int i = 0 ; i<a.length;i++) {
			   curr_max = curr_max + a[i];
			   if(curr_max<0) {
				   curr_max = 0;
				   start = i+1;
			   }
			   else if (curr_max>max_so_far) {
				max_so_far = curr_max;
			//	start = s;
				end = i;
			}
		   }
		   System.out.println(max_so_far);
		   System.out.println("Starting index " + start); 
	       System.out.println("Ending index " + end); 
		   return max_so_far;
	   }
	   
	  
	    /* Driver program to test maxSubArraySum */
	    public static void main(String[] args) 
	    { 
	    int a[] = {-2, -3, 4, -1, -2, 1, 5, -3}; 
	    int n = a.length;    
	    int max_sum = maxSubArraySum(a, n); 
	    System.out.println("Maximum contiguous sum is " 
	                       + max_sum);
	    largestSumContigousArray(a);
	    } 
	    
	    
	} 


