package javaproblems.leetcode;

import java.util.ArrayList;
import java.util.List;
//https://leetcode.com/problems/summary-ranges
public class SummaryRanges {
    public static List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        if(nums.length==1){
            int num = nums[0];
            list.add("\""+num+"\"");
        }else {
            int start = nums[0];
            int end = nums[0];
            for(int i = 0;i<nums.length-1;i++) {
                if(nums[i]+1 == nums[i+1]){
                    end = nums[i+1];
                }else {
                    if(start==end){
                        list.add(start +"");
                    }else {
                        list.add(start + "->" + end);
                    }
                    start = nums[i+1];
                    end = nums[i+1];
                }
                if(end==nums[nums.length-1]&&start!=end){
                    list.add(start + "->" + end);
                }
                if(end==nums[nums.length-1]&&start==end){
                    list.add(start +"");
                }
            }

        }
        System.out.println(list.toString());
        return list;

    }

    public static void main(String[] args) {
        int[] a = {1,2,4,5,7};
        summaryRanges(a);
    }
}
