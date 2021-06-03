package javaproblems.leetcode;

//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

import java.util.Arrays;

//(7,1,5,3,6,4)
public class StockBuySellOne {

    //O(N) space and O(N) Time
    public static void maxProfit(int[] arr){
        int n = arr.length;
        int[] a = new int[n];
        int maxSoFar = -1;

        for(int i = n-1; i>=0; i--){
            if(arr[i] >= maxSoFar){
                maxSoFar = arr[i];
            }else {
                maxSoFar = a[i+1];
            }
            a[i] = maxSoFar;
        }
        System.out.println(Arrays.toString(a));

        int profit[] = new int[n];

        int maxProfit = 0;
        for(int i = 0; i<n; i++){
            profit[i] = a[i] - arr[i];
            if(profit[i]>maxProfit){
                maxProfit = profit[i];
            }
        }
        System.out.println(Arrays.toString(profit));
        System.out.println(maxProfit);
    }

    //O(1) space and O(N) time
    public static int maximumProfit(int arr[]){
        int minSoFar = arr[0];
        int maxProfit = 0;
        int n = arr.length;
        for(int i = 0; i<n; i++){
            if(minSoFar>=arr[i]){
                minSoFar = arr[i];
            }
            if(maxProfit <= arr[i] - minSoFar){
                maxProfit = arr[i] - minSoFar;
            }
        }
        System.out.println(maxProfit);
        return maxProfit;
    }



    public static void main(String[] args) {
        int a[] = {3,1,4,8,7,2,5};   //{8,8,8,8,7,5,5}
       // maxProfit(a);
        maximumProfit(a);
    }
}


