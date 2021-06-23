package javaproblems.dp.lcs;
//https://www.youtube.com/watch?v=823Grn4_dCQ&list=PL_z_8CaSLPWekqhdCPmFohncHwz8TY2Go&index=24
//https://www.geeksforgeeks.org/shortest-common-supersequence/


/*
1. Find LCS
2. Length of SCS = Length of String a + Length of String b - LCS
 */

public class ShortestCommonSuperSequence {

    public static int shortestCommonSuperSequence(String x, String y){
        int m = x.length();
        int n = y.length();
        int dp[][] = new int[m+1][n+1];

        for(int i = 0; i<m+1; i++){
            dp[i][0] = 0;
        }

        for(int i = 0; i<n+1; i++){
            dp[0][i] = 0;
        }

        for(int i = 1; i<m+1; i++){
            for(int j = 1; j<n+1; j++){
                if(x.charAt(i-1)==y.charAt(j-1)){
                    dp[i][j] = 1+dp[i-1][j-1];
                }else {
                    dp[i][j] = Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }
        int lcs = dp[m][n];
        int scs = m+n-lcs;
        return scs;
    }

    /*
    https://www.geeksforgeeks.org/print-shortest-common-supersequence/
    https://www.youtube.com/watch?v=VDhRg-ZJTuc&list=PL_z_8CaSLPWekqhdCPmFohncHwz8TY2Go&index=29
    https://leetcode.com/problems/shortest-common-supersequence/

    //
     */

    public static String printScs(String str1, String str2){
        int m = str1.length();
        int n = str2.length();
        int[][] dp = new int[m + 1][n + 1];


        for (int i = 0; i < m + 1; i++) {
            dp[i][0] = 0;
        }
        for (int i = 0; i < n + 1; i++) {
            dp[0][i] = 0;
        }

        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
                }
            }
        }
//
        //for tracking back all the characters of both the strings and pushing into the resulting string.
        int i=m;
        int j=n;
        String s = "";
        while(i>0 && j>0){
            if(str1.charAt(i-1) == str2.charAt(j-1)){
                s = str1.charAt(i-1) + s;
                i--;
                j--;
            }
            else{ // for pushing the opposite direction's character into the resulting string when the characters are not equal and we need to decide which direction to move next
                if(dp[i][j-1]>dp[i-1][j]){
                    s = str2.charAt(j-1) + s;
                    j--;
                }
                else{
                    s = str1.charAt(i-1) + s;
                    i--;
                }
            }
        }
        //once any of the pointers(i or j) reaches 0, means the string denoted by that pointer has been fully processed, then --> we need to check if we have any characters left in the other string.
        while(i>0){
            s = str1.charAt(i-1) + s;
            i--;
        }
        while(j>0){
            s = str2.charAt(j-1) + s;
            j--;
        }
        return s;
    }

    public static void main(String[] args) {
        String x = "AGGTAB";
        String y = "GXTXAYB";
       // System.out.println(shortestCommonSubSequence(x,y));
        //"bbbaaaba"
        //"bbababbb"
      //  System.out.println(printScs("bbbaaaba","bbababbb"));
        System.out.println(printScs("abac","cab"));
    }
}
