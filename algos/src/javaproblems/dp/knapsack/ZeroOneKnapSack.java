package javaproblems.dp.knapsack;

public class ZeroOneKnapSack {

    public static int recursiveSolution(int[] itemsWeight, int[] valueOfItems, int knapSackWeight,int n){
        //base condition
        if(n==0||knapSackWeight==0){
            return 0;
        }

        if(itemsWeight[n-1]<=knapSackWeight){   //last item weight --> have two options either to discard or choose
           return Math.max(valueOfItems[n-1]+recursiveSolution(itemsWeight,valueOfItems,knapSackWeight-itemsWeight[n-1],n-1), //when choosen
                    recursiveSolution(itemsWeight,valueOfItems,knapSackWeight,n-1));  //discarded
        }else {  //weight of item is greater than knapsack
            return recursiveSolution(itemsWeight,valueOfItems,knapSackWeight,n-1);
        }
    }

    public static int memoizationSolution(int[] itemsWeight, int[] valueOfItems, int knapSackWeight,int n){
        int[][] dp = new int[knapSackWeight+1][n+1];
        if(dp[knapSackWeight][n]>0){  //check if the items is already stored in dp array
            return dp[knapSackWeight][n];
        }else {
            if(itemsWeight[n-1]<=knapSackWeight){   //last item weight --> have two options either to discard or choose
                dp[knapSackWeight][n] =  Math.max(valueOfItems[n-1]+recursiveSolution(itemsWeight,valueOfItems,knapSackWeight-itemsWeight[n-1],n-1), //when choosen
                        recursiveSolution(itemsWeight,valueOfItems,knapSackWeight,n-1));  //discarded
                return dp[knapSackWeight][n];
            }else {  //weight of item is greater than knapsack
                dp[knapSackWeight][n] = recursiveSolution(itemsWeight,valueOfItems,knapSackWeight,n-1);
                return  dp[knapSackWeight][n];
            }
        }

    }

    public static int topDownSolution(int[] itemsWeight, int[] valueOfItems, int knapSackWeight, int n){
        int[][] dp = new int[n+1][knapSackWeight+1];
        for(int i =0;i<n+1;i++){  //items weight
            for(int j =0; j<knapSackWeight+1; j++){  //knapsack weight
                if (i == 0 || j == 0){ //initialisation/base condition
                    dp[i][j] = 0;
                } else if(itemsWeight[i-1]<=j){
                    dp[i][j] = Math.max(valueOfItems[i-1]+dp[i-1][j-itemsWeight[i-1]],dp[i-1][j]);  //if item weight is less than knapsack weight
                }else {
                    dp[i][j] = dp[i-1][j]; //weight of item is greater than knapsack
                }
            }
        }
        return dp[n][knapSackWeight];
    }

    public static void main(String args[])
    {
        int val[] = new int[] { 60, 100, 120 };
        int wt[] = new int[] { 10, 20, 30 };
        int W = 50;
        int n = val.length;
        System.out.println(recursiveSolution(wt,val,W,n));
        System.out.println(memoizationSolution(wt,val,W,n));
        System.out.println(topDownSolution(wt,val,W,n));

    }
}
