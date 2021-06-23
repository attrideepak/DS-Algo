package javaproblems.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
//https://leetcode.com/problems/rank-transform-of-an-array/
public class ArrayRankTransform {
    public static int[] arrayRankTransform(int[] arr) {
        if(arr.length==0) return new int[0];
        int temp[]=new int[arr.length];
        for(int i=0;i<arr.length;i++)
            temp[i]=arr[i];
        Arrays.sort(temp); //10,20,30,40
        int rank[]=new int[arr.length];
        Map<Integer,Integer> ranks=new HashMap<>();
        int r=1;
        for(int i=0;i<temp.length;i++){
            if (!ranks.containsKey(temp[i]))
                ranks.put(temp[i], r++); //10 -> 1
        }
        for(int i=0;i<arr.length;i++)
            rank[i]=ranks.get(arr[i]);
        System.out.println(Arrays.toString(rank));
        return rank;
    }
}
