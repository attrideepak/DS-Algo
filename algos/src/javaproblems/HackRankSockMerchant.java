package javaproblems;

import java.util.Arrays;

public class HackRankSockMerchant {

	public static void main(String[] args) {
		int arr[] = {10,20 ,20, 10, 10, 30, 50, 10, 20};
		//10,10,10,10,20,20,20,30,50
		sockMerchant(9,arr);
		

	}
	
    static int sockMerchant(int n, int[] ar) {
    	Arrays.sort(ar);
        int count=0;
        for(int i=0;i<n-1;i++){
            if(ar[i]==ar[i+1]){
                count=count+1;
                i=i+1;
            }
        }
        System.out.print(count);
        return count;
}
}
