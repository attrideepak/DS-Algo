package javaproblems.dp.zerooneknapsack;
//https://www.youtube.com/watch?v=ot_XBHyqpFc&list=PL_z_8CaSLPWekqhdCPmFohncHwz8TY2Go&index=12
//https://www.youtube.com/watch?v=Hw6Ygp3JBYw&list=PL_z_8CaSLPWekqhdCPmFohncHwz8TY2Go&index=12
//https://leetcode.com/problems/target-sum/

/* Given an array, divide into two subsets such that difference of there sum = k
S1/S2 = sum of subsets
S1-S2 = k
S1+S2 = sum(array)
2S1 = k + sum(array)
S1 = (k+ sum(array))/2
Problem reduces to count of subsets with sum S1
 */

public class CountSubsetWithDifference {
    public static int countSubsets(int[] arr, int k){
        int sum = 0;
        for(int i:arr){
            sum = sum+i;
        }
        int x = (k+sum)/2;

        if(k>sum || (k+sum)%2!=0)
            return 0;

        int n = arr.length;
        int[][] dp = new int[n+1][x+1];

        // // Initializing the first value of matrix
        dp[0][0] = 1;

        for(int i = 1; i<n+1; i++){
            dp[i][0] = 1;  //when x = 0 and array length is changing
        }

        for(int i = 1; i<x+1; i++){
            dp[0][i] = 0;  // when x is changing and array is blank
        }

        for(int i =1; i<n+1; i++){
            for(int j =0; j<x+1; j++){   //can start j from 1 when values are greater than zero
                if(arr[i-1]<=j){
                    dp[i][j] = dp[i-1][j]+dp[i-1][j-arr[i-1]];   //adding the solution from both since we have to find the total count
                }else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][x];
    }

    public static void main(String[] args) {
        int[] a = {0,0,0,0,0,0,0,0,1};
        int x = 1;
        System.out.println(countSubsets(a,x));
    }
}
