package com.mylearnings.java.collections;

import java.util.Arrays;

public class LargestIntegerInArray {
 static void firstLargest(int[] input) {
	 Arrays.sort(input);
	 System.out.println("Largest element is "+input[input.length-1]);
 }
 static void secondLargest(int[] input) {
	Arrays.sort(input);
	System.out.println("Second Largest element is" +input[input.length-2]);
 }
 
 public static void largestAndSmallest(int[] numbers) { 
 int largest = Integer.MIN_VALUE; 
 int smallest = Integer.MAX_VALUE; 
 for (int number : numbers) { 
 if (number > largest) 
 {
		 largest = number; 
 } 
 if (number < smallest)
 { 
	 smallest = number; 
 } 
	 }
 System.out.println("Largest number in array is : " + largest); 
 System.out.println("Smallest number in array is : " + smallest);
 }

 
 public static void main(String[] args) {
	int[] array = {47498, 14526, 74562, 42681, 75283, 45796};
	firstLargest(array);
	secondLargest(array);
	largestAndSmallest(array);
	
}
}
	