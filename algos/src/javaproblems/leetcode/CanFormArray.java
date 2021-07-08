package javaproblems.leetcode;

import java.util.HashMap;
import java.util.Map;

public class CanFormArray {
//    Let's take a concrete example (integer is distinct which is given by the question)
//    Input: arr = [91,4,64,78], pieces = [[78],[4,64],[91]]
//    Note that piece's' is the 2d array which is the argument of the function, piece is just an array from piece's'
//
//    We build a hashmap by looping the array pieces , the key is the piece[0], and the value is the whole array piece
//    map.put(78, [78])
//        map.put(4, [4, 64])
//        map.put(91, [91])
//
//    Then we focus on arr. We do a loop on arr and validate the integer inside the arr to see if it matches our pattern
//    arr[0] = 91 -> int[] piece = map.get(91) -> [91]
//            if we can't find the corresponding array from the hashmap, that means it cannot form the arr, return false
//
//    If we can find the corresponding array, it doesn't mean that it can concatenate to form the arr because it only matches the first integer, the piece array can have multiple elements, and we need to match the arr one by one. If the remaining integer inside the piece array is not the same as the arr, return false.
//
//    After every successful comparison of the element between arr and piece, we add the i by 1 for further comparison afterwards

    public boolean canFormArray(int[] arr, int[][] pieces) {
        Map<Integer, int[]> map = new HashMap<>();

        for (int[] piece : pieces) {
            map.put(piece[0], piece);
        }

        int i = 0;
        while (i < arr.length) {
            int[] piece = map.get(arr[i]);
            if (piece == null) return false;

            for (int num : piece) {
                if (arr[i] != num) return false;
                i++;
            }
        }
        return true;
    }
}
