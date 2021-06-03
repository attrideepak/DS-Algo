package javaproblems.leetcode;

//https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
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
