package javaproblems.leetcode;

public class ShuffleTheArray {
    public int[] shuffle(int nums[], int n){
        int arr[] = new int[nums.length];

        int l = 0;
        int r = n;

        for(int i = 0; i < arr.length; i++) {
            if(i % 2 == 0) {
                arr[i] = nums[l];
                l++;
            }
            else {
                arr[i] = nums[r];
                r++;
            }
        }

        return arr;
    }
}
