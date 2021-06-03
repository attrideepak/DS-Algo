package javaproblems.leetcode;

import java.util.Arrays;

//https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iv/
public class StockBuyAndSellSix {

    public static int maxProfit(int[] arr, int k){
        int n = arr.length;
        int dp[][] = new int[k+1][n];

        if(n <= 1 || k<= 0){
            return 0;
        }


        int profit = 0;
        if(k >= n/2 ){
            for(int i= 0;i<n-1;i++) {
                if (arr[i] < arr[i + 1]) {
                    profit += arr[i+1]-arr[i];
                }
            }
            return profit;
        }

        for(int t=1;t<=k;t++){
            int max = Integer.MIN_VALUE;
            for(int d =1; d<n; d++){
                if(dp[t-1][d-1]-arr[d-1]>max){
                    max = dp[t-1][d-1]-arr[d-1];
                }

                if(max+arr[d]>dp[t][d-1]){
                    dp[t][d] = max + arr[d];
                }else {
                    dp[t][d] = dp[t][d-1];
                }
            }
        }
        return dp[k][n-1];
    }

    public static void main(String[] args) {
        int[] a  = {3,2,6,5,0,3};
        System.out.println(maxProfit(a,2));
    }
}
