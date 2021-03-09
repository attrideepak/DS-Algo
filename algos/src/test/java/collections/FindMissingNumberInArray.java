package com.mylearnings.java.collections;

import java.util.BitSet;

/*You are given a list of n-1 integers and these integers are in the range of 1 to n.
There are no duplicates in list. 
One of the integers is missing in the list. 
Write an efficient code to find the missing integer.*/

public class FindMissingNumberInArray {

	static int missingNumber(int[] arr) {
		int n = arr.length;
		int sum = (n+1)*(n+2)/2;   //added 1 becoz one element is missing
		int arraySum = 0;
		for(int i =0; i<n;i++) {
			arraySum += arr[i];
		}
		int miss = sum-arraySum;
		return miss;
		
		
	}
	//using bitset we can find n missing elements but the list should start from 1.
	static void printMissingNumber(int[] numbers, int count) {
		int missingCount = count - numbers.length;
		BitSet bitSet = new BitSet(count);
		for (int number : numbers) {
			bitSet.set(number-1);
		}
		int lastMissingIndex = 0;
		for(int i = 0;i<missingCount;i++) {
			lastMissingIndex = bitSet.nextClearBit(lastMissingIndex);
			System.out.println(++lastMissingIndex);
		}
		
		//System.out.println(bitSet.cardinality());
		
	}
	public static void main(String[] args) {
		int[] array = {3,4,5,7,8};
		//int[] array = {102,103,104,105,107,108};
		//System.out.println(missingNumber(array));
		printMissingNumber(array, 9);
		}
}
