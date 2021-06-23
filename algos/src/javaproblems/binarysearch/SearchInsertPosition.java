package javaproblems.binarysearch;
//https://leetcode.com/problems/search-insert-position/
public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;

        if(nums[0]>=target)
            return 0;

        if(nums[nums.length-1]<target)
            return nums.length;

        while(start<=end){
            int mid = start + (end-start)/2;
            if(target==nums[mid]){
                return mid;
            }else if(target < nums[mid]){
                end = mid -1;
            }else if(target > nums[mid]) {
                start = mid + 1;
            }
        }
        return start;
    }
}

//3,5,6,7,8
