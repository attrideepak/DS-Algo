package javaproblems;

import java.util.*;

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

	public static void pairsumMap(int[] arr, int sum){
		Set<Integer> hSet = new HashSet<>();
		for(int i = 0; i<arr.length; i++){
			hSet.add(arr[i]);
		}

		for(int i = 0; i<arr.length;i++){
			int rem = sum-arr[i];
			if(hSet.contains(rem)){
				int[] pair = {arr[i], rem};
				System.out.println(Arrays.toString(pair));
				hSet.remove(arr[i]);  //to remove duplicate pairs like 1,2 and 2,1
			}

		}

	}
	
	public static void main(String[] args) {
		int[] numbers = { 2, 4, 3, 5, 7, 8, 9 };
		pairSum(numbers, 7);
	}

}
