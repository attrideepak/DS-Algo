package javaproblems.dp.unboundedknapsack;
//https://www.youtube.com/watch?v=aycn9KO8_Ls&list=PL_z_8CaSLPWekqhdCPmFohncHwz8TY2Go&index=13
//https://www.geeksforgeeks.org/unbounded-knapsack-repetition-items-allowed/
//https://www.geeksforgeeks.org/cutting-a-rod-dp-13/

public class UnboundedKnapsack {
    private static int unboundedKnapsack(int W, int[] val, int[] wt){

        int n = val.length;
        int dp[] = new int[W+1];

        for(int i = 0; i <= W; i++){
            for(int j = 0; j < n; j++){
                if(wt[j] <= i){
                    dp[i] = Math.max(dp[i], dp[i - wt[j]] + val[j]);
                }
            }
        }
        return dp[W];

    }

    private static int unboundedKnapSack(int W,int[] val,int[] wt){
        int n = val.length;
        int dp[][] = new int[n+1][W+1];

        dp[0][0] = 1;

        for(int i =1 ; i<n+1; i++){
            dp[i][0] = 0;
        }

        for(int i =1 ; i<W+1; i++){
            dp[0][i] = 0;
        }

        for(int i = 1; i<n+1; i++){
            for(int j = 1; j<W+1; j++){
                if(wt[i-1]<=j){
                    dp[i][j] = Math.max(val[i-1]+dp[i][j-wt[i-1]],dp[i-1][j]);  //We can choose the item again so we are usind dp[i] again
                }else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

    return dp[n][W];
    }

    public static void main(String[] args)
    {
        int W = 100;
        int val[] = {10, 30, 20};
        int wt[] = {5, 10, 15};
        System.out.println(unboundedKnapsack(W, val, wt));
        System.out.println(unboundedKnapsack(W,val,wt));
    }
}
