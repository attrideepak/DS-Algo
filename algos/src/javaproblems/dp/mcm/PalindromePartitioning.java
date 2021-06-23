package javaproblems.dp.mcm;

//https://www.geeksforgeeks.org/palindrome-partitioning-dp-17/
//https://www.youtube.com/watch?v=szKVpQtBHh8&list=PL_z_8CaSLPWekqhdCPmFohncHwz8TY2Go&index=36
//https://www.youtube.com/watch?v=fOUlNlawdAU&list=PL_z_8CaSLPWekqhdCPmFohncHwz8TY2Go&index=37
//https://www.youtube.com/watch?v=9h10fqkI7Nk&list=PL_z_8CaSLPWekqhdCPmFohncHwz8TY2Go&index=38

import java.util.Arrays;

public class PalindromePartitioning {
    static int[][]dp;

    static boolean isPalindrome(String string, int i, int j)
    {
        while(i < j)
        {
            if(string.charAt(i) != string.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static int palindromePartitionRecursive(String str,int i,int j){
        if(i>=j || isPalindrome(str,i,j)){
            return 0;
        }
        int min = Integer.MAX_VALUE;
        for(int k = i;k<j;k++){
            int temp = palindromePartitionRecursive(str,i,k)+palindromePartitionRecursive(str,k+1,j)+1;
            min = Math.min(min,temp);
        }

        return min;
    }

    public static int palindromePartitionMemoised(String str,int i,int j){
        dp = new int[j+1][j+1];
        for(int l=0;l<j;l++){
            Arrays.fill(dp[l],-1);
        }
        if(i>=j || isPalindrome(str,i,j)){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }

        int min = Integer.MAX_VALUE;
        for(int k = i;k<j;k++){
            int temp = palindromePartitionRecursive(str,i,k)+palindromePartitionRecursive(str,k+1,j)+1;
            min = Math.min(min,temp);
        }

        return dp[j][j] = min;
    }

    public static int palindromePartitionMemoisedOtimized(String str,int i,int j){
        dp = new int[j+1][j+1];
        for(int l=0;l<j;l++){
            Arrays.fill(dp[l],-1);
        }
        if(i>=j || isPalindrome(str,i,j)){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }

        int min = Integer.MAX_VALUE;
        for(int k = i;k<j;k++){
           // int temp = palindromePartitionRecursive(str,i,k)+palindromePartitionRecursive(str,k+1,j)+1;
            int left;
            int right;
            if(dp[i][k]!=-1){
                left = dp[i][k];
            }else {
                left =  palindromePartitionRecursive(str,i,k);
                dp[i][k] = left;
            }

            if(dp[k+1][j]!=-1){
                right = dp[k+1][j];
            }else {
                right = palindromePartitionRecursive(str,k+1,j);
                dp[k+1][j] = right;
            }
            int temp = left+right+1;
            min = Math.min(min,temp);
        }

        return dp[j][j] = min;
    }


    public static void main(String[] args) {
        String x = "abbac";
        System.out.println(palindromePartitionRecursive(x,0,x.length()-1));
        System.out.println(palindromePartitionMemoised(x,0,x.length()-1));
        System.out.println(palindromePartitionMemoisedOtimized(x,0,x.length()-1));
    }
}
