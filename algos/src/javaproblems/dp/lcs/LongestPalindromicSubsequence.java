package javaproblems.dp.lcs;
//https://www.youtube.com/watch?v=wuOOOATz_IA&list=PL_z_8CaSLPWekqhdCPmFohncHwz8TY2Go&index=26
//https://www.geeksforgeeks.org/longest-palindromic-subsequence-dp-12/
//https://leetcode.com/problems/longest-palindromic-subsequence/

/* 1.Reverse string
   2. Find LCS => Answer
 */

public class LongestPalindromicSubsequence {
    public static int longestPalindromeSubseq(String s) {
        int m = s.length();

        StringBuilder rev = new StringBuilder(s);
        String r = rev.reverse().toString();

        int[][] dp = new int[m+1][m+1];

        for(int i = 0; i<m+1;i++){
            dp[i][0]= 0;
            dp[0][i]= 0;
        }

        for(int i = 1; i<m+1; i++){
            for(int j = 1; j<m+1; j++){
                if(s.charAt(i-1)==r.charAt(j-1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                }else {
                    dp[i][j] = Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }
        return dp[m][m];
    }

    public static void main(String[] args) {
        System.out.println(longestPalindromeSubseq("cbbd"));
    }
}
