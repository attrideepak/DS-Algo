package javaproblems.dp.lcs;
//https://www.youtube.com/watch?v=-fx6aDxcWyg&list=PL_z_8CaSLPWekqhdCPmFohncHwz8TY2Go&index=25
//https://www.geeksforgeeks.org/minimum-number-deletions-insertions-transform-one-string-another/

public class NumberOfInsertionsAndDeletions {


    public static void getNumber(String x, String y){
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

        int minDeletion = m-lcs;
        System.out.println(minDeletion);
        int minInsertion = n-lcs;
        System.out.println(minInsertion);


    }

    public static void main(String[] args) {
        String x = "heap";
        String y = "pea";
        getNumber(x,y);

    }
}
