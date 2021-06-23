package javaproblems.dp.lcs;

//https://www.youtube.com/watch?v=HrybPYpOvz0&list=PL_z_8CaSLPWekqhdCPmFohncHwz8TY2Go&index=22
//https://www.geeksforgeeks.org/longest-common-substring-dp-29/
//https://leetcode.com/problems/maximum-length-of-repeated-subarray/
public class LongestCommonSubstring {


    public static int longestSubString(String x, String y){
        int m = x.length();
        int n = y.length();
        int result = 0;
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
                    result = Integer.max(result,
                            dp[i][j]);
                }else {
                    dp[i][j] = 0;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String x = "GeeksforGeeks";
        String y = "GeeksQuiz";
        System.out.println(longestSubString(x,y));
    }
}
