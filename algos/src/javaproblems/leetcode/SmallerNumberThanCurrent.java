package javaproblems.leetcode;

import java.util.Arrays;
import java.util.HashMap;

//https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/

/*Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it.
That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].
 */
public class SmallerNumberThanCurrent {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        // 8,1,2,2,3  --> 1,2,2,3,8  ---> 4,0,1,1,3
        int[] sortedArray = nums.clone();
        Arrays.sort(sortedArray);

        HashMap<Integer,Integer> hmap = new HashMap<>();

        for(int i = 1; i<sortedArray.length; i++){
            hmap.put(sortedArray[0],0);
            if(sortedArray[i]!=sortedArray[i-1]){
                hmap.put(sortedArray[i],i);
            }else if(sortedArray[i]==sortedArray[i-1]){
                hmap.put(sortedArray[i],hmap.get(sortedArray[i]));
            }
        }

        for(int i = 0; i<nums.length;i++){
            nums[i] = hmap.get(nums[i]);
        }

        return nums;
    }

    public int[] smallerNumbersThanCurrentOtimised(int[] nums) {
        int[] smaller = new int[101];

        for(int i = 0; i<nums.length; i++){
            smaller[nums[i]]++;
        }

        for(int i = 1; i < 101; i++){
            smaller[i] += smaller[i-1];
        }

        for(int i = 0; i < nums.length; i++){
            int position = nums[i];

            if(position == 0) nums[i] = 0;

            else{
                nums[i] = smaller[position-1];
            }
        }

        return nums;
    }
}
/*
* count the frequency of each number and store into another countArray array. For example input array [8,1,2,2,3] and count array stores the occurances
[1,2,3,8]
[1,2,1,1]

scan the count array from left to right which has already smaller to larger element as an index. calculate number of smaller element present in the array using a variable: valuesSeenBefore = 0.

For the element 1, valuesSeenBefore = 0, countArray = [0,2,1,1]. Now valuesSeenBefore becomes = 0 + 1 = 1
For the element 2, valuesSeenBefore = 1, countArray = [0,1,1,1]. Now valuesSeenBefore becomes = 1 + 2 = 3
For the element 3, valuesSeenBefore = 3, countArray = [0,1,3,1]. Now valuesSeenBefore becomes = 3 + 1 = 4
For the element 8, valuesSeenBefore = 4, countArray = [0,1,3,4]. Now valuesSeenBefore becomes = 4 + 1 = 5

store this count into the final output array


* */