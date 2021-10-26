package javaproblems.leetcode;

import java.util.*;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> result = new HashSet<>();


        for(int i = 0; i< nums.length-2; i++){
            int j = i+1;
            int k = nums.length - 1;
            while (j<k){
                int sum = nums[j]+nums[k];
                if(sum== -nums[i]){
                    result.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                }else if(sum>-nums[i]){
                    k--;
                }else if (sum<-nums[i]){
                    j++;
                }
            }
        }

        return new ArrayList<>(result);
    }
}
