package javaproblems;
//https://www.geeksforgeeks.org/minimum-replacements-required-to-make-sum-of-all-k-length-subarrays-equal/

//The idea is based on the observation that all subarrays will have equal sum, when all elements separated by distance K are equal.

import java.util.HashMap;
import java.util.Map;

public class FindMinOperations {

    public static void main(String[] args) {
        int[] arr = { 3, 4, 3, 5, 6 };
        int n = arr.length;
        int K = 3;

        int operations = -1;

        for(int i = 0; i<K; i++){

            // Stores frequency of elements
            // separated by distance K

            HashMap<Integer,Integer> frequency = new HashMap<>();

            for(int j =i;i<n;j = i+K){
                if(frequency.containsKey(arr[j])){
                    frequency.put(arr[j],frequency.get(arr[j])+1);
                }else {
                    frequency.put(arr[j],1);
                }
            }

            int max = -1; int num = 0;

            for (Map.Entry<Integer,Integer> entry :frequency.entrySet()){
                if(entry.getKey()>max){
                    max = entry.getValue();
                    num = entry.getKey();
                }
            }

            for (Map.Entry<Integer,Integer> entry :frequency.entrySet()){
                if(entry.getKey()!=num){
                    operations += entry.getValue();
                }
            }

            System.out.println(operations);
        }

    }
}
