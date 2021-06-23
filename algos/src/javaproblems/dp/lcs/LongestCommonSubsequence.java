package javaproblems.dp.lcs;
//https://www.youtube.com/watch?v=4Urd0a0BNng&list=PL_z_8CaSLPWekqhdCPmFohncHwz8TY2Go&index=19
//https://www.youtube.com/watch?v=g_hIx4yn9zg&list=PL_z_8CaSLPWekqhdCPmFohncHwz8TY2Go&index=20
//https://www.youtube.com/watch?v=hR3s9rGlMTU&list=PL_z_8CaSLPWekqhdCPmFohncHwz8TY2Go&index=21
//https://www.geeksforgeeks.org/longest-common-substring-dp-29/
//https://www.geeksforgeeks.org/longest-common-subsequence-dp-4/

import java.util.Arrays;

public class LongestCommonSubsequence {

    public static int longestCommonSubsequenceRecursive(String x, String y, int m, int n) {
        if (m == 0 || n == 0) {
            return 0;
        } else if (x.charAt(m - 1) == y.charAt(n - 1)) {
            return 1 + longestCommonSubsequenceRecursive(x, y, m - 1, n - 1);
        } else {
            return Math.max(longestCommonSubsequenceRecursive(x, y, m, n - 1), longestCommonSubsequenceRecursive(x, y, m - 1, n));
        }
    }

    public static int memoizationSolution(String x, String y,int m, int n,int[][]dp){
        if (m == 0 || n == 0) {
            return 0;
        }
        if(dp[m][n]!= -1){
            return dp[m][n];
        } else if (x.charAt(m - 1) == y.charAt(n - 1)) {
            return  dp[m][n] = 1 + memoizationSolution(x, y, m - 1, n - 1,dp);
        } else {
            return dp[m][n] = Math.max(memoizationSolution(x, y, m, n - 1,dp), memoizationSolution(x, y, m - 1, n,dp));
        }
    }

    public static int longestCommonSubsequence(String x,String y){
        int m = x.length();
        int n = y.length();

        int[][] dp = new int[m+1][n+1];

        for(int r[] : dp)
            Arrays.fill(r,-1);
        return memoizationSolution(x,y,m,n,dp);
    }

    public static int bottomUp(String x, String y){
        int m = x.length();
        int n = y.length();
        int[][] dp = new int[m+1][n+1];

        for(int i = 0; i<m+1;i++){
            dp[i][0]= 0;
        }
        for(int i = 0; i<n+1;i++){
            dp[0][i]= 0;
        }

        for(int i = 1; i<m+1; i++){
            for(int j = 1; j<n+1; j++){
                if(x.charAt(i-1)==y.charAt(j-1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                }else {
                    dp[i][j] = Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }
        return dp[m][n];
    }






    public static void main(String[] args) {

      String x =  "ylqpejqbalahwr";
      String y =  "yrkzavgdmdgtqpg";
      System.out.println(longestCommonSubsequence(x,y));
        System.out.println(bottomUp(x,y));
    }

}
