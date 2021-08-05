package javaproblems.leetcode;
//Good Problem
//https://leetcode.com/problems/kth-missing-positive-number/
//[2,3,4,7,11], k = 5 => 9   , [1,5,6,8,9,10,12,13,...]
public class kthPositive {
    public int findKthPositive(int[] arr, int k) {
        int count=0,next=1;
        for(int i=0;i<arr.length;i++){
            while(next!=arr[i]){
                count++;
                if(count==k)
                    return next;
                next++;
            }
            next++;
        }
        if(count<k)
            return next+(k-count-1);
        else return next;
    }
}
