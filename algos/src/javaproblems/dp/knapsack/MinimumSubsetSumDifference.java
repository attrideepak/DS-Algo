package javaproblems.dp.knapsack;
//https://www.youtube.com/watch?v=-GtpxG6l_Mc&list=PL_z_8CaSLPWekqhdCPmFohncHwz8TY2Go&index=10
//https://www.geeksforgeeks.org/partition-a-set-into-two-subsets-such-that-the-difference-of-subset-sums-is-minimum/

/*
S1/S2 = sum of subsets
1. Minimize: S2 - S1
2. S1 + S2 = Range(Array sum)
3. S2 = Range - S1  ---> Minimize:  Range - 2*S1
4. S1, S2 will lie between 0-Range
5. There will be some value between 0-Range which cannot be equal to S1/S2. Values of S1 will be in the first half because S1+S2 = Range.
6. We are taking S1 in the small half so it will be smaller than S2.
7. These values will be given last line of dp matrix. Apply SubsetSum and take only those sub problems that return true.
8. Take min of Range-2*S1, last valid valiue;
 */
public class MinimumSubsetSumDifference {

    public static int minDifference(int arr[]){
        int n = arr.length;
        int range = 0;
        for(int i:arr){
            range = range +i;
        }
        boolean[][] dp = new boolean[n+1][range+1];

        // If sum is 0, then value are true
        for(int i = 0; i<n+1; i++){
            dp[i][0] = true;
        }
        // If sum is not 0 and set is empty,
        // then answer is false
        for (int i = 1; i<range+1; i++ ){
            dp[0][i] = false;
        }

        for(int i = 1; i<n+1; i++){
            for(int j = 1; j<range+1; j++){
                if(arr[i-1]<=j){
                    dp[i][j] = dp[i-1][j-arr[i-1]]||dp[i-1][j];
                }else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        // Initialize difference of two sums.
        int diff = Integer.MAX_VALUE;

        // Find the largest j such that dp[n][j]
        // is true where j loops from sum/2 t0 0
        for (int j = range / 2; j >= 0; j--)
        {
            // Find the
            if (dp[n][j] == true)
            {
                diff = range - 2 * j;
                break;
            }
        }
        return diff;
    }

    public static void main(String[] args) {
        int a[] = {1,2,7};
        System.out.println(minDifference(a));
    }
}
