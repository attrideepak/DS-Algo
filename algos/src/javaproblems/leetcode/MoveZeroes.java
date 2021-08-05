package javaproblems.leetcode;

import java.util.Arrays;
//https://leetcode.com/problems/move-zeroes/submissions/
public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
//2,1,0,0,12 --> 2,1,12,0,0
        int j = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i]!=0&&nums[j]!=0){
               j++;
            }else if(nums[i]!=0 && nums[j]==0) {
                int temp;
                temp = nums[i];
                nums[i]=nums[j];
                nums[j] = temp;
                j++;
            }
        }
        System.out.println(Arrays.toString(nums));

    }


    public static void printArray(int[] nums){
        for(int num:nums){
            System.out.print(num + ",");
        }
    }

    public static void main(String[] args) {
        int a[] = {0,1,0,0,12};
        //swap(1,2);
        moveZeroes(a);
    }

}
