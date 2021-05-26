package javaproblems.leetcode;

//https://leetcode.com/problems/two-sum/
//[2,7,11,15],9

import java.util.*;

public class TwoSum {

    //all pairs values
    static List<List<Integer>> findAllPairs(int[] arr, int target){
    int l = 0;
    int r = arr.length - 1;
    List<List<Integer>>finalList = new ArrayList<>();

        Arrays.sort(arr);
    while(l<r){
        if(arr[l]+arr[r]>target){
            r--;
        }else if(arr[l]+arr[r]<target){
            l++;
        }else {
            List<Integer> sumPair = new ArrayList<>();
            sumPair.add(arr[l]);
            sumPair.add(arr[r]);
            finalList.add(sumPair);
            l++;
            r--;
           // break;
        }
    }
        System.out.println(finalList.toString());
    return finalList;
    }

    //return index
    static int[] findSum(int arr[],int target){
        Map<Integer,Integer>deltaMap = new HashMap<>();
        for(int i = 0; i<arr.length; i++){
            int delta = target - arr[i];
            if(deltaMap.containsKey(delta)){
                return new int[] {deltaMap.get(delta),i};
            }else {
                deltaMap.put(arr[i],i);
            }
        }
        return new int[] {-1,-1};
    }

    public static void main(String[] args) {
        int a[] = {2,3,7,4,8,5};
        //int a[] = {3};
        System.out.println(Arrays.toString(findSum(a,7)));
    }


}
