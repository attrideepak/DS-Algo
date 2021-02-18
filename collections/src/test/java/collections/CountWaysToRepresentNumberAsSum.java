package com.mylearnings.java.collections;

public class CountWaysToRepresentNumberAsSum {
	
	//Count of different ways to express N as the sum of 1, 3 and 4
	
	static int countWays(int n) 
    { 
        int DP[] = new int[n+1]; 
  
        // base cases 
        DP[0] = DP[1] = DP[2] = 1; 
        DP[3] = 2; 
  
        // iterate for all values from 4 to n 
        for (int i = 4; i <= n; i++) 
            DP[i] = DP[i - 1] + DP[i - 3]  
	                    + DP[i - 4]; 
        return DP[n]; 
    } 
  
    // driver code 
    public static void main(String[] args) 
    { 
        int n = 6; 
        System.out.println(countWays(n)); 
    } 
}

//Make an array DP[] to store number of solution for each number/
//Define base case; DP[0], DP[1], DP[2], DP[3]
//DP[0]=1, only one way to represent 0
//DP[1]=1, only one way to represent 1
//DP[2]= 1, only one way (1,1)
//DP[3]= 2, (1,1,1),(3)
//DP[4]= DP[3]+DP[1]+DP[0] = 5
//DP[5]= DP[4]+DP[2]+DP[1] = 7
//DP[6]= DP[5]+DP[3]+DP[2] = 9
