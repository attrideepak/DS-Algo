package javaproblems.leetcode;
//https://leetcode.com/problems/maximum-subarray/

public class MaximumSumSubArray {

    public static int maxSum(int arr[]){
        int currentSum = 0;
        int max_so_far =Integer.MIN_VALUE;
        int n = arr.length;

        for(int i = 0; i<n; i++){
            currentSum = currentSum + arr[i];
            if(currentSum>max_so_far){
                max_so_far = currentSum;
            }
            if(currentSum<0){
                currentSum = 0;
            }
        }
        return max_so_far;
    }

    public static void main(String[] args) {
      // int[] a = {5,4,-1,7,8};
       int[] a  = {-1};
        System.out.println(maxSum(a));
    }
}
