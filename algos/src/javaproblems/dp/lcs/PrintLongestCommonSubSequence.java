package javaproblems.dp.lcs;
//https://www.youtube.com/watch?v=x5hQvnUcjiM&list=PL_z_8CaSLPWekqhdCPmFohncHwz8TY2Go&index=23
//https://www.geeksforgeeks.org/printing-longest-common-subsequence/

import javaproblems.Array;

import java.util.Arrays;

public class PrintLongestCommonSubSequence {
    public static void bottomUp(String x, String y) {
        int m = x.length();
        int n = y.length();
        int[][] dp = new int[m + 1][n + 1];


        for (int i = 0; i < m + 1; i++) {
            dp[i][0] = 0;
        }
        for (int i = 0; i < n + 1; i++) {
            dp[0][i] = 0;
        }

        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if (x.charAt(i - 1) == y.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
                }
            }
        }
        System.out.println(dp[m][n]);
        int index = dp[m][n];
      //  int temp = index;
        StringBuilder stringBuilder = new StringBuilder();
      //  char[] string = new char[index];
        int i =m;
        int j =n;


        while(i>0&&j>0){
            if(x.charAt(i-1)==y.charAt(j-1)){
                stringBuilder.append(x.charAt(i-1));
          // string[index-1] = x.charAt(i-1);
                i--;
                j--;
          //      index--;
            }
            else if(dp[i-1][j]>dp[i][j-1]){
                i--;
            }else {
                j--;
            }
        }
        System.out.println(stringBuilder.reverse());

    }


    public static void main(String[] args) {

        String x =  "ylqpejqbalahwr";
        String y =  "yrkzavgdmdgtqpg";
        bottomUp(x,y);

    }
}
