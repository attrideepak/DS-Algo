package javaproblems.leetcode;
//https://leetcode.com/problems/partition-to-k-equal-sum-subsets/

public class KEqualPartition {
    public static boolean canPartitionKSubsets(int[] nums, int k) {
        int n = nums.length;
        int sum = 0;
        for(int x:nums){
            sum = sum +x;
        }

        if(sum%k!=0){
            return false;
        }

        for(int i = 0;i<n;i++){

        }

        int effectiveSum = sum/k;

        boolean[][] dp = new boolean[n+1][effectiveSum+1];

        dp[0][0] = true;

        for(int i = 1; i<n+1; i++){
            dp[i][0] = true;
        }

        for(int i = 1; i<effectiveSum+1; i++){
            dp[0][i] = false;
        }

        for(int i = 1; i<n+1; i++){
            for(int j =1; j<effectiveSum+1; j++){
                if(nums[i-1]<=j){
                    dp[i][j] = dp[i-1][j] || dp[i-1][j-nums[i-1]];
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][effectiveSum];
    }

    public static void main(String[] args) {
        int[] n = {2,2,2,2,3,4,5};
        int k = 4;
        System.out.println(canPartitionKSubsets(n,k));
    }
}
