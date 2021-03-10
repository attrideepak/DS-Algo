package javaproblems;

public class LargestIncreasingSubArray {

	
	//Given an array of n positive distinct integers.
	//The problem is to find the largest sum of contiguous increasing subarray in O(n) time complexity.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 1, 4, 7, 3, 6};
		maxSubArraySum(arr);

	}
	
	static int maxSubArraySum(int a[]) { 
    	
    int max_so_far = 0; 
    int start = 0;
    for(int i =0; i<a.length;i++) {
    int cur_sum = a[i];
    while(i+1<a.length && a[i+1]>a[i]) {
    cur_sum = cur_sum + a[i+1];
    i++;
    }
    
    if(cur_sum>max_so_far) {
    	max_so_far = cur_sum;
    	}	
    }
    System.out.println(start);
    System.out.println(max_so_far);
    return max_so_far; 
    } 

}
