package javaproblems.leetcode;

public class KLengthApart {
    public static boolean kLengthApart(int[] nums, int k) {
        int tempDistance = -1, size = nums.length;
        for (int i = 0; i < size; i++) {
            if (nums[i] == 1) {
                if (tempDistance != -1 && tempDistance < k) {
                    return false;
                }
                tempDistance = 0;
            } else {
                if (tempDistance != -1) {
                    tempDistance++;
                }
            }
        }

        return true;
    }
}
