package javaproblems.dp.knapsack;
//https://www.youtube.com/watch?v=F7wqWbqYn9g&list=PL_z_8CaSLPWekqhdCPmFohncHwz8TY2Go&index=9
//https://www.geeksforgeeks.org/count-of-subsets-with-sum-equal-to-x/
public class CountOfSubsets {

    public static int countSubsets(int[] arr, int x){
        int n = arr.length;
        int[][] dp = new int[n+1][x+1];

        // // Initializing the first value of matrix
        for(int i = 0; i<n+1; i++){
            dp[i][0] = 1;  //when x = 0 and array length is changing
        }

        for(int i = 1; i<x+1; i++){
            dp[0][i] = 0;  // when x is changing and array is blank
        }

        for(int i =1; i<n+1; i++){
            for(int j =1; j<x+1; j++){
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
        int[] a = {1,1,1,1};
        int x = 1;
        System.out.println(countSubsets(a,x));
    }
}
