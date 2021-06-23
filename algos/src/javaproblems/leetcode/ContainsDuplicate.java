package javaproblems.leetcode;

import java.util.HashMap;
//https://leetcode.com/problems/contains-duplicate/

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> hmap = new HashMap<>();
        for(int num:nums){
            if(hmap.containsKey(num)){
                hmap.put(num,hmap.get(num)+1);
            }else{
                hmap.put(num,1);
            }
            if(hmap.get(num)>=2){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,1};
        System.out.println(containsDuplicate(a));
    }
}
