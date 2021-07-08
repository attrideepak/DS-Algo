package javaproblems.leetcode;
//https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/
public class CheckRotatedSortedArray {
    public static boolean check(int[] nums) {

        int count = 0;
        for(int i = 0; i < nums.length; i++){

            //check kiya ki kya pichli value agli se badi hai
            if(nums[i] > nums[(i + 1) % nums.length])   // or nums[i]>nums[i+1]  and add another conditions if if(nums[0]<nums[nums.length-1]) return false
                count++;
        }

        //baar baar value badi mil rhi hai iska mtlb sorted ni hai
        if(count > 1){
            return false;
        }

        return true;
    }
}
