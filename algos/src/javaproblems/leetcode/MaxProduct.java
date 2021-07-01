package javaproblems.leetcode;
//https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/
public class MaxProduct {
    public static int maxProduct(int[] nums) {
        int max = 0;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > secondMax) {
                if (nums[i] > max) {
                    secondMax = max;
                    max = Math.max(max, nums[i]);
                } else {
                    secondMax = nums[i];
                }
            }
        }
        return (max - 1) * (secondMax - 1);
    }
}
