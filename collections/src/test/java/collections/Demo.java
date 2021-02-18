package com.mylearnings.java.collections;
//Java program to find x number of missing element in range [1,n] using bitsets
import java.util.BitSet;

public class Demo {
	//Driver code
	public static void main(String[] args) {
		int[] array = {1,3,5,6};
		printMissingNumber(array, 6);
		}
	//Method to find the number of missing elements, 
	//it accepts an integer array and the total count six in this case  in range [1,n]
	static void printMissingNumber(int[] numbers, int count) {
		//No of elements missing
		int missingCount = count - numbers.length;
		//Creates object of bitset class with initial size as count
		BitSet bitSet = new BitSet(count);
		//Creates a bitset of the array, sets the bits 
		//specified by index as true and rest all as false 
		for (int number : numbers) {
			bitSet.set(number-1);
		}
		int lastMissingIndex = 0;
		System.out.println("The missing numbers are");
		for(int i = 0;i<missingCount;i++) {
			// nextClearBit method Returns the index of the next cleared bit, 
			//(that is, the next zero bit), starting from the index specified by startIndex.
			lastMissingIndex = bitSet.nextClearBit(lastMissingIndex);
			System.out.print(++lastMissingIndex+ " ");
		}
		
	}

}
