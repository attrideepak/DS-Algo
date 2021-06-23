package javaproblems.leetcode;
//https://leetcode.com/problems/sort-array-by-parity-ii/submissions/
public class SortByParity {
    //O(N) : Time O(N):Space
    public int[] sortArrayByParityII(int[] nums) {
        int t=0;
        int[] a = new int[nums.length];
        for(int i = 0; i<nums.length; i++){
            if(nums[i]%2==0){
                a[t] = nums[i];
                t = t+2;
            }
        }
        t=1;
        for(int i = 0; i<nums.length; i++){
            if(nums[i]%2==1){
                a[t] = nums[i];
                t = t+2;
            }
        }
        return a;
    }

    public static int[] sortArrayByParityIIOptimised(int[] nums) {
        int e = 0;
        int o = 1;
        while(e<nums.length && o <nums.length){
            if(nums[e]%2==0){
                e = e+2;
            }else if(nums[o]%2==0){   //id there are even nums at odd index swap them with even index
                int temp = nums[e];
                nums[e] = nums[o];
                nums[o] = temp;
                e = e+2;
                o = o+2;
            }else {
                o = o+2;  //find next o with even number
            }
        }
        return nums;
    }
}
