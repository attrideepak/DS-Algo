package javaproblems.leetcode;
//https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iii/
// 2 transactions
public class StockBuyAndSellFive {

    public static int maxProfit(int[] arr){

        int maxProfitIfSoldToday = 0;
        int minSoFarBeforeToday = arr[0];
        int[] dpLeft = new int[arr.length];  //max profit before and including today if sold

        for(int i = 1; i<arr.length; i++){
            if(arr[i]<minSoFarBeforeToday){
                minSoFarBeforeToday = arr[i];
            }
            maxProfitIfSoldToday = arr[i]-minSoFarBeforeToday;
            dpLeft[i] = Math.max(maxProfitIfSoldToday,dpLeft[i-1]);

        }
        int maxProfitIfBoughtToday = 0;
        int maxSoFarAfterToday = arr[arr.length-1];
        int[] dpRight = new int[arr.length];  //max profit after and including today if bought
        for(int i = arr.length-2;i>=0;i--){
            if(arr[i]>maxSoFarAfterToday){
                maxSoFarAfterToday = arr[i];
            }
            maxProfitIfBoughtToday = maxSoFarAfterToday - arr[i];
            dpRight[i] = Math.max(maxProfitIfBoughtToday,dpRight[i]);
        }

        int totalProfit = 0;
        for(int i =0; i<arr.length; i++){
            if(dpLeft[i]+dpRight[i]>totalProfit){
               totalProfit =  Math.max((dpLeft[i]+dpRight[i]),totalProfit);
            }
        }
        return totalProfit;
    }

    /*
    Stock Price = 10,20
    Suppose amount we have is 100.
    In order to maximize the amount I have I will buy stock with price 10, lower price.
    Similarly inorder to maximize the amount I will sell the stock at high price.
    */

    public static int maximizeProfit(int prices[]){
        if(prices.length==0){
            return 0;
        }
        int fb = Integer.MIN_VALUE;  //amount of money after first buy
        int sb = Integer.MIN_VALUE;  //amount of money after second buy
        int fs = 0; //amount of money after first sell
        int ss = 0; //amount of money after second sell

        for(int i = 0; i<prices.length; i++){
            fb = Math.max(fb,-prices[i]);
            fs = Math.max(fs, fb+prices[i]);
            sb = Math.max(sb,fs-prices[i]);
            ss = Math.max(ss,sb+prices[i]);
        }
        return ss;
    }

    public static void main(String[] args) {
        int[] a = {3,3,5,0,0,3,1,4};
        System.out.println(maxProfit(a));
    }
}
