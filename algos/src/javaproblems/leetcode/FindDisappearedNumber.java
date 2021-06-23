package javaproblems.leetcode;



import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
public class FindDisappearedNumber {
    //[4,3,2,7,8,2,3,1]
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            while (nums[i] != i + 1 && nums[i] != nums[nums[i] - 1]) {
                swap(nums, i, nums[i] - 1);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                list.add(i + 1);
            }

        }
        return list;
    }

    private static void swap(int[] a, int i, int j) {

        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }




    public static void main(String[] args) {
        int[] a = {1,12,-5,-6,50,3}; //2
      //  int[] a = {0,0,1,0,1}; //1
       // int[] a = {1,0,0,0,1,0,0}; //2
    }
/*
This pattern can be used when you have items in the range of 1 - n (where n = elements in array).
Basically the idea is to set each element at its correct position while iterating the array.

Start from the first element. This item is at it correct position if a[i] == i+1

If the item is not at its correct position, we will try to put it at the correct position, so now lets look at its correct position i.e. a[a[i] - 1]. ( 4 has to be placed at index 3)

Now two conditions arise from here, either the item is at a[a[i]-1] is equal to a[i] or it is not equal to a[i]

a. If it is equal to a[i], it means the item is duplicated we will leave the item as is and move further. Later we will use this item to find out that item which was supposed to it at this index is missing.

b. If it is not equal to a[i], then lets swap it with a[i],** and check again from STEP 2**

Perform the same thing for each item in the array.

At the end of the loop, Items which are not repeated will be at its correct place, and item which are duplicated, will be at its correct place and other duplicates will be occupying some other places.

We can check the places where item is not at its correct place and add the item to the item, which is supposed to be there.


 */

}
