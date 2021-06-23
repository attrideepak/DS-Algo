package javaproblems.leetcode;

public class MinCostToClimbStairs {
    public static int minCostClimbingStairs(int[] cost)
    {
        int n = cost.length;
        return solve(n,cost);
    }


    public static int solve(int i,int[]cost){
        if(i<=1){
            return 0;
        }
        int op1 = cost[i-1] + solve(i-1, cost);   //comes from one step before
        int op2 = cost[i-2] + solve(i-2, cost);   //comes from two steps before

        return Math.min(op1, op2);

    }

    public static int minCostClimbingStairsDP(int[] cost){
        int n = cost.length;
        int dp[] = new int[n+1];
        dp[0] = 0;
        dp[1] = 0;
        for(int i = 2; i<n+1;i++){
            dp[i] = Math.min((cost[i-1]+dp[i-1]),(cost[i-2]+dp[i-2]));
        }
        return dp[n];
    }

    /*
    We can observe that we are only ever accessing the previous or previous-to-previous step. So, in the iterative version,
    we don't really need to store the whole dp array and we can just store the minimum cost required to reach the i-1th and i-2th steps.
     */
    public static int minCostClimbingStairsDPOptimised(int[] cost){
        int n = cost.length;
        int prev1 = cost[1]; //one step back
        int prev2 = cost[0]; //two step back
        int cur = Math.min(prev1,prev2);
        for(int i = 2; i<n;i++){
           // cur = (i != n ? cost[i] : 0) + Math.min(prev1, prev2);
            cur = cost[i] +  Math.min(prev1, prev2);
            prev2 = prev1;
            prev1 = cur;
        }
        return cur;
    }

    public static void main(String[] args) {
        int[] a = {1,100,1,1,1,100,1,1,100,1};
        //int a[] = {2, 1, -1};
        System.out.println(minCostClimbingStairsDPOptimised(a));
        // System.out.println(51.0/4);
        //1,100,1,1,1,100,1,1,100,1

    }

   /* min[0] & min[1] is declared as 0 as climbing to those positions is free of cost. Now for min[2] we can either come from index '0' or index '1', So we check which is minimum possible way by Math.min function.
    Similarly, for min[i] , we can come from 'i-1' or 'i-2'.
    We are adding cost and min because min for 'ith' index is min of 'i-1' plus its cost to climb to 'i'(or) min of 'i-2' plus its cost to climb to 'i'.
    As we have to climb out of array , we are finding last element of min whose length is 1 more than cost array.

    */

}
