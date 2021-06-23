package javaproblems.dp.unboundedknapsack;
//https://leetcode.com/problems/coin-change/
//https://www.youtube.com/watch?v=I-l6PBeERuc&list=PL_z_8CaSLPWekqhdCPmFohncHwz8TY2Go&index=16
//https://www.geeksforgeeks.org/find-minimum-number-of-coins-that-make-a-change/

import java.util.Arrays;

public class CoinChangeProblemMinimumCoins {

    public static int findMinCoins2d(int[] coins,int amount){
        int n = coins.length;
        int[][] dp = new int[n+1][amount+1];

        for(int i = 0; i<amount+1; i++){
            dp[0][i] = Integer.MAX_VALUE-1;
        }

        for(int i = 1; i<n+1; i++ ){
            dp[i][0] = 0;
        }

        for (int i = 1; i<n+1;i++){
            for(int j = 1; j<amount+1; j++){
                if(coins[i-1]<=j){
                    dp[i][j] = Math.min(dp[i][j-coins[i-1]]+1,dp[i-1][j]);
                }else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        return dp[n][amount] != Integer.MAX_VALUE-1 ? dp[n][amount]: -1;
    }

    public static int findMinCoins1d(int coins[],int amount){
        int n = coins.length;
        int[] dp = new int[amount+1];

        Arrays.fill(dp,Integer.MAX_VALUE-1);
        dp[0] = 0;

        for(int i = 0; i<n;i++){
            for(int j = 0; j<amount+1; j++){
                if(coins[i]<=j){
                    dp[j]= Math.min(dp[j],dp[j-coins[i]]+1);
                }
            }
        }
        return dp[amount] != Integer.MAX_VALUE-1 ? dp[amount] : -1;

    }

    public static void main(String[] args) {
     int[] a ={1,2,5};
     int amount = 11;
        System.out.println(findMinCoins2d(a,amount));
        System.out.println(findMinCoins1d(a,amount));
    }
}
