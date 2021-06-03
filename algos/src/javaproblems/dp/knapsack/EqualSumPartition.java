package javaproblems.dp.knapsack;
//https://www.youtube.com/watch?v=UmMh7xp07kY&list=PL_z_8CaSLPWekqhdCPmFohncHwz8TY2Go&index=8
//https://leetcode.com/problems/partition-equal-subset-sum/

public class EqualSumPartition {



    public static boolean canPartition(int[] nums) {
        int sum = 0;
        int n = nums.length;
        boolean[][]dp;
        int w;
        for(int i =0; i<n; i++){
            sum = sum + nums[i];
        }
        /* sum of sum of both the subset equals to sum of the array. Array can only be partitioned equally if its sum is even.
        Problem reduces to SubsetSum where we have to find a subset with sum = sum/2
         */
        if(sum%2!=0){
            return false;
        }else{
            w = sum/2;
            dp = new boolean[n+1][w+1];
            // If sum is 0, then value are true
            for(int i = 0; i<n+1; i++){
                dp[i][0] = true;
            }
            // If sum is not 0 and set is empty,
            // then answer is false
            for (int i = 1; i<w+1; i++ ){
                dp[0][i] = false;
            }
            for(int i = 1;i<n+1;i++){
                for(int j = 1;j<w+1;j++){
                    if(nums[i-1]<=j){
                        dp[i][j] = dp[i-1][j-nums[i-1]]||dp[i-1][j];
                    }else {
                        dp[i][j] = dp[i-1][j];
                    }
                }
            }
        }
        return dp[n][w];
    }

    public static void main(String[] args) {
        int[] a = {1,5,11,5};
        System.out.println(canPartition(a));
    }


    /*     // If sum is 0, then value are true
        for(int i = 0; i<n+1; i++){
            dp[i][0] = true;
        }
        // If sum is not 0 and set is empty,
        // then answer is false
        for (int i = 1; i<sum+1; i++ ){
            dp[0][i] = false;
        }

        for(int i = 1; i<n+1; i++){
            for(int j = 1; j<sum+1; j++){
               if(set[i-1]<=j){
                   dp[i][j] = dp[i-1][j-set[i-1]]||dp[i-1][j];
               }else {
                   dp[i][j] = dp[i-1][j];
               }
            }
        }*/
}
