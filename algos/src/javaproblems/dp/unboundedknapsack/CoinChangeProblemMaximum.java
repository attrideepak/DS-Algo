package javaproblems.dp.unboundedknapsack;

import java.util.Arrays;

//https://www.youtube.com/watch?v=I4UR2T6Ro3w&list=PL_z_8CaSLPWekqhdCPmFohncHwz8TY2Go&index=15
//https://www.geeksforgeeks.org/coin-change-dp-7/
//Similar to unbounded knapsack
//https://leetcode.com/problems/coin-change-2/submissions/
public class CoinChangeProblemMaximum {


   //gives combination
    public static int findMaxWays(int[] coins, int value){
        int n = coins.length;
        int[][] dp = new int[n+1][value+1];

      dp[0][0] = 1;

      for(int i =1; i<value+1; i++){
          dp[0][i] = 0;
      }

        for(int i =1; i<n+1; i++){
            dp[i][0] = 1;
        }


        for(int i = 1; i<n+1; i++){
            for(int j =1; j<value+1; j++){
                if(coins[i-1]<=j){
                    dp[i][j] =  dp[i][j-coins[i-1]] + dp[i-1][j];
                }else {
                    dp[i][j] =   dp[i-1][j];
                }
            }
        }


       return dp[n][value];
    }

    //gives number of combination i.e {a,b,c} and {b,c,a} are same.
    public static int findMaxWaysOptimized(int[] coin, int value){
        int n = coin.length;
        int[] dp = new int[value+1];
        dp[0] = 1;


        for(int i = 0; i< n; i++){  //iterate over all coins
            for(int j = 1; j<value+1; j++) {  //iterate till value, we can also start iteration from coin[i]
                if (coin[i] <= j) {
                    dp[j] = dp[j] + dp[j - coin[i]];
                }
            }
        }
        return dp[value];
    }

   //gives number of permutations i.e {a,b,c} and {b,c,a} are diff.
    public static int findMaxWaysPermutation(int[] coin, int value){
        int n = coin.length;
        int[] dp = new int[value+1];
        dp[0] = 1;
    for(int i = 1; i< value+1; i++){  //iterate till value
        for(int j = 0; j<n; j++){  //iterate over number of coins
            if(coin[j]<= i){
                dp[i] = dp[i] + dp[i-coin[j]];
            }
        }
    }
    return dp[value];
    }



    public static void main(String[] args) {
        int[] a = {1,2,3};
        int value = 5;
        System.out.println(findMaxWays(a,value));
        System.out.println(findMaxWaysOptimized(a,value));
        System.out.println(findMaxWaysPermutation(a,value));

    }

}
