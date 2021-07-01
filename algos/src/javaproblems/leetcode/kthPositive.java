package javaproblems.leetcode;
//https://leetcode.com/problems/kth-missing-positive-number/
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
