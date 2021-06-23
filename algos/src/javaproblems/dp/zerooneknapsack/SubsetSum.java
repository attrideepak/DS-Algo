package javaproblems.dp.zerooneknapsack;
//https://www.youtube.com/watch?v=_gPcYovP7wc&list=PL_z_8CaSLPWekqhdCPmFohncHwz8TY2Go&index=7
//https://www.geeksforgeeks.org/subset-sum-problem-dp-25/
public class SubsetSum {

    public static boolean recursiveSolution(int set[],int n, int sum){
        if(n == 0){  //base condition
            return false;
        }
        if(sum == 0){ //base condition
            return true;
        }

        if(set[n-1]>sum){   // If last element is greater than sum, then ignore it
            return recursiveSolution(set,n-1,sum);
        }

         /* else, check if sum can be obtained by any of the following
            (a) including the last element
            (b) excluding the last element */
        return recursiveSolution(set,n-1,sum)||recursiveSolution(set,n-1,sum-set[n-1]);
    }

    public static boolean topDownSolution(int set[], int n, int sum){
        boolean[][] dp = new boolean[n+1][sum+1];

        // If sum is 0, then value are true
        for(int i = 0; i<n+1; i++){
            dp[i][0] = true;
        }
        // If sum is not 0 and set is empty,
        // then answer is false
        for (int i = 1; i<sum+1; i++ ){
            dp[0][i] = false;
        }

        for(int i = 1; i<n+1; i++){
            for(int j = 1; j<sum+1; j++){
               if(set[i-1]<=j){
                   dp[i][j] = dp[i-1][j-set[i-1]]||dp[i-1][j];
               }else {
                   dp[i][j] = dp[i-1][j];
               }
            }
        }

        return dp[n][sum];
    }

    public static void main(String[] args) {
        int set[] = { 3, 34, 4, 12, 5, 2 };
        int sum = 9;
        int n = set.length;
        System.out.println(recursiveSolution(set,n,sum));
        System.out.println(topDownSolution(set,n,sum));
    }
}
