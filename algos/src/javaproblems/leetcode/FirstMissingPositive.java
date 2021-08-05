package javaproblems.leetcode;
//Good Problem
//https://leetcode.com/problems/first-missing-positive/
//https://www.youtube.com/watch?v=X8hMbzW1DGU
public class FirstMissingPositive {
    public int firstMissingPositive(int[] arr) {
        if(arr.length == 0){
            return 1;
        }
        int i = 0;
        while( i < arr.length){
            if(arr[i]>0 && arr[i] <= arr.length && arr[i]!=arr[arr[i]-1]){
                int otherIndex = arr[i]-1;
                int temp;
                temp = arr[i];
                arr[i] = arr[otherIndex];
                arr[otherIndex] = temp;
            }else {
                i++;
            }
        }
        for(int j = 0;j<arr.length;j++){
            if(arr[j]!=j+1){
                return j+1;
            }
        }
        return arr.length+1;
    }
}
