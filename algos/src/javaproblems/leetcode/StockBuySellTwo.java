package javaproblems.leetcode;

//https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/

/*
You are given an array prices where prices[i] is the price of a given stock on the ith day.

Find the maximum profit you can achieve. You may complete as many transactions as you like (i.e., buy one and sell one share of the stock multiple times).

Note: You may not engage in multiple transactions simultaneously (i.e., you must sell the stock before you buy again).
 */
public class StockBuySellTwo {


    static int maxProfit(int arr[]){
        if (arr == null || arr.length <= 1) return 0;
        int profit = 0;
        for (int i = 1; i<arr.length; i++){
            if(arr[i]>arr[i-1]){
                profit +=  arr[i]-arr[i-1];
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] a = {7,1,5,3,6,4};
        maxProfit(a);
    }


}
