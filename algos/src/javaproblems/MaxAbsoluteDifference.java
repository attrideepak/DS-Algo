package javaproblems;

public class MaxAbsoluteDifference {

	public static void main(String[] args) {
		int[] arr = { 2, -1, 5, 3,-7}; 
		absoluteDifference(arr);

	}
	
	static int absoluteDifference(int a[]) {
		int min = a[0];
		int max = a[0];
		
		for(int i = 0; i<a.length; i++) {
			min = Math.min(min,a[i]);
			max = Math.max(max, a[i]);
		}
		System.out.println(max-min);
		return max-min;
	}

}
