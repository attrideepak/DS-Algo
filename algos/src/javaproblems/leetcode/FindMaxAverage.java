package javaproblems.leetcode;
//https://leetcode.com/problems/maximum-average-subarray-i/submissions/
//sliding window
public class FindMaxAverage {
    public static double findMaxAverage(int[] nums, int k) {

        double sum = 0;
        int i = 0;  //window start
        int j = 0; //window end
        while(j<k){ //moving j and taking sum for first window
            sum = sum + nums[j];
            j++;
        }
        double maxSum = sum/k; //initialising max
        while (j<nums.length){  //j starts from the value set in first while loop
            sum = sum + nums[j]; //add next number
            sum = sum - nums[i]; //minus previous
            maxSum = Math.max(maxSum,sum/k);
            i++;  //move window
            j++;  //move window
        }
        return maxSum;
    }
}
