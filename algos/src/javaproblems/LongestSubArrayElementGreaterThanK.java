package javaproblems;

public class LongestSubArrayElementGreaterThanK {

	//Given an array of N integers and a number K, the task is to find the length of the longest 
	//subarray in which all the elements are greater than K.
	public static void main(String[] args) {
		int []a = { 8, 25, 10, 17,19, 19, 18, 20,22, 11, 18};
		subArray(a,13);
	}
	
	/*
	 * i = 0; 8 not greater than 13, counter = 0;
	 * i = 1; 25 greater than 13, counter = 1;
	 * i = 2; 10 not greater
	 * */
	
	static int subArray(int a[],int x) {
		int length = 0;
		int counter = 0;
		int end = 0;
		for(int i = 0; i<a.length;i++) {
			if(a[i]>x) {
				counter = counter+1;
			}
			else {
				length = Math.max(counter, length);
				counter = 0;
				end = i - 1;
			}
//			if(counter>0) {
//				length  = Math.max(counter, length);
//				System.out.println(length);
//			}
		}
		System.out.println(end);
		System.out.println(length);
		return length;
	}

}
