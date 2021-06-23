package javaproblems.dp.lcs;
//https://www.youtube.com/watch?v=hbTaCmQGqLg&list=PL_z_8CaSLPWekqhdCPmFohncHwz8TY2Go&index=30
//https://www.geeksforgeeks.org/longest-palindromic-subsequence-dp-12/
/*
The idea is to find the LCS(str, str) where str is the input string with the restriction that when both the characters are same,
they shouldn’t be on the same index in the two strings.
 */
public class LongestRepeatingSubSequence {
    public static int findReapeating(String s){
        int m = s.length();
        int[][] dp = new int[m+1][m+1];

        for(int i = 0; i<m+1;i++){
            dp[i][0]= 0;
            dp[0][i]= 0;
        }

        for(int i = 1; i<m+1; i++){
            for(int j = 1; j<m+1; j++){
                if(s.charAt(i-1)==s.charAt(j-1)&&i!=j) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                }else {
                    dp[i][j] = Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }
        return dp[m][m];
    }

    public static void main(String[] args) {
        System.out.println(findReapeating("AABEBCDD"));
    }
}
