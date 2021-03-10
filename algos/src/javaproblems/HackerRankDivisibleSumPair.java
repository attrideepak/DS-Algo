package javaproblems;

public class HackerRankDivisibleSumPair {
	//Java 7 solution
	static int divisibleSumPairs(int n, int k, int[] ar) {
	    int count = 0; 
	    for(int i = 0 ; i<n ; i++ ){
	        for(int j = 1; j<n ; j++){
	            if(i<j){
	                int a = ar[i] + ar[j];
	                if(a%k==0){
	                    count++;
	                }
	            }
	        }
	    } 
	    return count;   
}
	//Java 8 solution
	
}
