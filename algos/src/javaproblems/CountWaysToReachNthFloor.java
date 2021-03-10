package javaproblems;
//Count ways to reach the nth stair using step 1, 2 or 3

public class CountWaysToReachNthFloor {
	
	
	static int countWays(int n) {
		int DP[] = new int[n+1];
		
		DP[0] = 1;
		DP[1] = 1;
		DP[2] = 2;
		DP[3] = 4;
		
		
		for(int i =4; i<=n; i++) {
			DP[i] = DP[i-1]+DP[i-2]+DP[i-3];
		}
		return DP[n];
		
	}
		
		//base cases
		
		public static void main(String argc[]) 
	    { 
	        int n = 5; 
	        System.out.println(countWays(n)); 
	    } 
		
	}

//DP[0] = 1
//DP[1] = 1;
//DP[2] = 2 :(1,1),2
//DP[3] = DP[2]+DP[1]+DP[0]=4
//DP[4] = D[3]+DP[2]+DP[1] = 4+2+1=7


