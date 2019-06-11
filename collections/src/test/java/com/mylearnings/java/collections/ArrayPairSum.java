package com.mylearnings.java.collections;

import java.util.Arrays;

//How to Find all Pairs in Array of Integers Whose sum is Equal to a Given Number?

public class ArrayPairSum {
	public static void pairSum(int[] array, int sum) {
		for(int i=0; i<array.length; i++) {
			int first = array[i];
			for(int j = i+1;j<array.length;j++) {
				int second = array[j];
				if(first+second == sum) {
					int[] pairs = {first,second};
					System.out.println(Arrays.toString(pairs));
					
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int[] numbers = { 2, 4, 3, 5, 7, 8, 9 };
		pairSum(numbers, 7);
	}

}
