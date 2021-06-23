package javaproblems.leetcode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
//https://leetcode.com/problems/number-of-equivalent-domino-pairs/
public class DominoPairs {
    public static int numEquivDominoPairs(int[][] arr) {
        Map<List<Integer>, Integer> map = new HashMap<>();
        int ans = 0;

        for (int i = 0; i < arr.length; i++) {
            List<Integer> list = new LinkedList<>();
            if (arr[i][0] > arr[i][1]) {
                list.add(arr[i][0]);
                list.add(arr[i][1]);
            } else {
                list.add(arr[i][1]);
                list.add(arr[i][0]);
            }
            if (map.containsKey(list)) {
                map.replace(list, 1 + map.get(list));
                ans += map.get(list);
            } else map.put(list, 0);

        }

        return ans;
    }

    public static int numEquivDominoPairsOptimised(int[][] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int result = 0;
        for(int[] item : arr) {
            //key should be unique
            int val = item[0] < item[1] ? item[0] *10 + item[1] : item[1] *10 + item[0];
            int count = map.getOrDefault(val,0);
            //increment the count
            map.put(val, count + 1);
            //store in the result
            result += count;
        }
        return result;
    }
}
