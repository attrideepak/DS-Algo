package javaproblems.leetcode;

import java.util.Arrays;
import java.util.HashMap;

//https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
public class SmallerNumberThanCurrent {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        // 8,1,2,2,3  --> 1,2,2,3,8  ---> 4,0,1,1,3
        int[] sortedArray = nums.clone();
        Arrays.sort(sortedArray);

        HashMap<Integer,Integer> hmap = new HashMap<>();

        for(int i = 1; i<sortedArray.length; i++){
            hmap.put(sortedArray[0],0);
            if(sortedArray[i]!=sortedArray[i-1]){
                hmap.put(sortedArray[i],i);
            }else if(sortedArray[i]==sortedArray[i-1]){
                hmap.put(sortedArray[i],hmap.get(sortedArray[i]));
            }
        }

        for(int i = 0; i<nums.length;i++){
            nums[i] = hmap.get(nums[i]);
        }


        return nums;
    }

    public int[] smallerNumbersThanCurrentOtimised(int[] nums) {
        int[] smaller = new int[101];

        for(int i = 0; i<nums.length; i++){
            smaller[nums[i]]++;
        }

        for(int i = 1; i < 101; i++){
            smaller[i] += smaller[i-1];
        }

        for(int i = 0; i < nums.length; i++){
            int position = nums[i];

            if(position == 0) nums[i] = 0;

            else{
                nums[i] = smaller[position-1];
            }
        }

        return nums;
    }
}
