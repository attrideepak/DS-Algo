package javaproblems.leetcode;
//https://leetcode.com/problems/sum-of-all-odd-length-subarrays/
public class SumOfOddSubArrays {
    public static int sumOddLengthSubarrays(int[] arr) {
        int result = 0;
        int n = arr.length;

        for(int i =0; i<n; i++){
            int end = i+1;  //subarray ending at i
            int start = n-i;  //subarray starting at i
            int total = start*end; //total subarray
            int odd = total/2;  //odd length subarray
            if(total%2==1){  //if total subarrays are odd add 1
                odd++;
            }
            result += odd*arr[i];  //arr[i] occurs in odd length subarray * arr[i]
        }
        return result;
    }
}
