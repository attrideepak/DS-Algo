package javaproblems.leetcode;

//selling with a fee find max profit
//https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-transaction-fee/
public class StockBuyAndSellThree {

    static int findMaxProfit(int[] arr, int fee) {
        int obsp = -arr[0];
        int ossp = 0;

        if (arr.length <= 2)
            return 0;

        for (int i = 1; i < arr.length; i++) {


            //find bsp
            int nbsp = Math.max((ossp - arr[i]), obsp);

            //find ssp
            int nssp = Math.max((obsp + arr[i] - fee), ossp);


            obsp = nbsp;
            ossp = nssp;
        }

        return ossp;
    }

  /*
  Case 1: I have stock on day i represented by dp[i][1],select max of the below
  1. I bought it today
  dp[i][1] = dp[i-1][0]-prices[i]-fee
  2. carring a prebought stock doing nothing
  dp[i][1] = dp[i-1][1]

  Case 2: I dont have a stock on day i represented by dp[i][0], select max of the below
  1. I sold the stock today
  dp[i][0] = dp[i-1][1]+prces[i]
  1. Doing nothing
  dp[i][0] = dp[i-1][0]

   */
  public int maximumProfit(int arr[],int fee){
      int len = arr.length;
      int dp[][] = new int[len][2];
      dp[0][0] = 0;
      dp[0][1] = -arr[0]-fee;
      if(len<=1){
          return 0;
      }
      for(int i = 1; i<len; i++){
          dp[i][0] = Math.max((dp[i-1][1]+arr[i]),dp[i-1][0]);
          dp[i][1] = Math.max(( dp[i-1][0]-arr[i]-fee),dp[i-1][1]);
      }
      return dp[len-1][0];

  }

    public static void main(String[] args) {
        int[] a = {10,15,17,20,16,18,22,20,22,20,23,25};
        int fee = 3;
        findMaxProfit(a,fee);
    }
}
