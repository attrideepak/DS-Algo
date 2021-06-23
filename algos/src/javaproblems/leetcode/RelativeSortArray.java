package javaproblems.leetcode;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

//https://leetcode.com/problems/relative-sort-array/
public class RelativeSortArray {
    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        // Counts array which stores occurences of each element in arr1, result array stores final result
        int[] counts = new int[1001];
        int[] result = new int[arr1.length];

        // Stored counts of all elements of arr1
        for (int num : arr1) {
            counts[num]++;
        }
        // Starting index for results
        int index = 0;
        // Iterating over each element in arr2
        for (int num : arr2) {
            // Adding elements to results as per number's counts/occurences
            for (int i = 0; i < counts[num]; i++) {
                result[index++] = num;
            }
            // As the number from arr2 has been added as per its counts/occurences in arr2, we set its counts value as 0
            counts[num] = 0;
        }
        // Iterating over counts array to add the remaining elements of arr1 which are not present in arr2
        for (int i = 0; i < 1001; i++) {
            // Adding elements as per their counts/occurences
            for (int j = 0; j < counts[i]; j++)
                result[index++] = i;
        }
        return result;
    }

    public static int[] relativeSortArrayUsingHasMap(int[] arr1, int[] arr2) { Arrays.sort(arr1);
        TreeMap<Integer,Integer> arr1map = new TreeMap<>();
        for(int i = 0;i<arr1.length;i++){
            arr1map.put(arr1[i],arr1map.getOrDefault(arr1[i],0)+1);
        }
        int k = 0;
        for(int i = 0; i<arr2.length; i++){
            for(Map.Entry<Integer,Integer>entry:arr1map.entrySet()){
                if(entry.getKey()==arr2[i]){
                    int value = entry.getValue();
                    while (value>0){
                        arr1[k++]=entry.getKey();
                        value--;
                    }
                    entry.setValue(0);
                }
            }
        }

        for(Map.Entry<Integer,Integer>entry:arr1map.entrySet()){
            int value = entry.getValue();
            if(value!=0) {
                while (value>0){
                    arr1[k++]=entry.getKey();
                    value--;
                }
            }
        }
        System.out.println(Arrays.toString(arr1));
        return arr1;
    }


    public static void main(String[] args) {
        int[] a = {2,3,1,3,2,4,6,7,9,2,19};
        int[] b = {2,1,4,3,9,6};
        relativeSortArray(a,b);


    }
}
