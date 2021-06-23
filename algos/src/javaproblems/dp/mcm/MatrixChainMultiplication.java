package javaproblems.dp.mcm;

//https://www.geeksforgeeks.org/matrix-chain-multiplication-dp-8/
//https://www.youtube.com/watch?v=kMK148J9qEE&list=PL_z_8CaSLPWekqhdCPmFohncHwz8TY2Go&index=34
//https://www.youtube.com/watch?v=9uUVFNOT3_Y&list=PL_z_8CaSLPWekqhdCPmFohncHwz8TY2Go&index=35

import java.util.Arrays;

public class MatrixChainMultiplication {
    static int[][] dp;

    public static int findCostRecursively(int arr[], int i, int j){
        if(i>=j){
            return 0;
        }
            int min = Integer.MAX_VALUE;
            for(int k = i;k<j;k++){
                int temp = findCostRecursively(arr,i,k)+findCostRecursively(arr,k+1,j)+(arr[i-1]*arr[k]*arr[j]);
                min = Math.min(min,temp);
            }

        return min;
    }

    public static int findCostMemoization(int arr[], int i, int j){
         dp = new int[j+1][j+1];
        for(int l=0;l<j;l++){
            Arrays.fill(dp[l],-1);
        }
        if(i>=j){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int min = Integer.MAX_VALUE;
        int temp = 0;
        for(int k = i;k<j;k++){
            temp = findCostRecursively(arr,i,k)+findCostRecursively(arr,k+1,j)+(arr[i-1]*arr[k]*arr[j]);
            min = Math.min(min,temp);
        }

        return dp[i][j] = min;
    }

    public static void main(String[] args) {
        int[] arr = {40, 20, 30, 10, 30};
        System.out.println(findCostRecursively(arr,1,arr.length-1));
        System.out.println(findCostMemoization(arr,1,arr.length-1));
    }
}
