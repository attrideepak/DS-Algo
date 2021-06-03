package javaproblems.leetcode;

//maximise profit with cooldown day = 1
//https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-cooldown/
public class StockBuyAndSellFour {
    public static int maximizeProfilt(int a[]){

        //// We maintain the maximum profit for each action we took in the previous day
        int obsp = -a[0]; // If we buy on the first day, the max profit is -a[0]
        int ossp = 0; // If we take a rest, the we don't have any profit
        int ocdp = 0;

        // For each day, we consider 3 possible actions we can take: buy, sell, or rest
        // And calculate the max profit in each case
        for(int i = 0; i<a.length; i++){



            // If we decided to buy today, the previous day we have to rest (due to the question)
            // Therefore, we have to compare the 2 scenarios, either:
            // 1. Don't buy today and have a rest (buy)
            // 2. Buy from previous day (rest - prices[i])
              int  nbsp = Math.max((ocdp-a[i]),obsp);

            // If we decide to sell, then we must buy something in the previous day
             int   nssp = Math.max((obsp+a[i]),ossp);

            // If we decide to take a rest, that means in the previous day we either took a rest
            // or sold something. Therefore, the max profit will be between 2 scenarios:
            // 1. Rested in yesterday and rest today
            // 2. Sold something yesterday and rest today

             int  ncdp = Math.max(ossp,ocdp);

            // Update the max profit for each scenario
            ossp = nssp;
            obsp = nbsp;
            ocdp = ncdp;
        }
        System.out.println(ossp);
        // We cannot buy something and have the max profit, therefore, we only compare
        // 2 scenarios :)
        return Math.max(ossp,ocdp);
    }


    //dp solution
    /*
    dp[len][2]  --> 2 because we can ether have a stock or not
    case1:
    We have a stock on day i i.e. dp[i][1]-->max of below
    - I bought it today. If I am buying it today I must have sold it at i-2 day becoz cooldown is 1;
    dp[i-2][0]-a[i]
    - I am carry forwarding.
    dp[i-1][1]
    case2:
    We have no stock on day i i.e. dp[i][0] --> max of below
    - I sold it today
    dp[i-1][1]+a[i]
    - I am carry forwarding and doing nothing.
    dp[i-1][0]
     */

    public static int maxProfit(int[] prices){
        int len = prices.length;
        int[][] dp = new int[len][2];
        if(len<=1){
            return 0;
        }
        if (len == 2 && prices[1]>prices[0]){
            return prices[1]-prices[0];
        }else if(len == 2 && prices[1]<prices[0]){
            return 0;
        }
        //base condition
        dp[0][0]=0;
        dp[0][1]= -prices[0];
        dp[1][0]= Math.max(dp[0][0],dp[0][1]+prices[1]);
        dp[1][1] = Math.max(dp[0][1],dp[0][0]-prices[1]);

        for (int i = 2; i<len; i++){
            dp[i][0] = Math.max(dp[i-1][0],dp[i-1][1]+prices[i]);
            dp[i][1] = Math.max(dp[i-1][1],dp[i-2][0]-prices[i]);
        }
        return dp[len-1][0];
    }



    public static void main(String[] args) {
        int a[] = {1,2,3,0,2};
        System.out.println(maxProfit(a));
    }

}
