package javaproblems.leetcode;

//[1,0,2,1,0,1,3,2,1,2,1]
// Output = 6

import java.util.Arrays;

public class TappingTheRainWater {

   // O(N) time complexity and 0(N) space
    public static int trappedWater(int arr[]){
       int n = arr.length;
       if(n<=2){  //at least 3 bars needed to collect water
           return 0;
       }

       int[] left = new int[n];
       int[] right = new int[n];

       int leftMax = arr[0];

       for(int i = 1;i<n;i++){
           left[i] = leftMax;  //store leftMax for each bar
           leftMax = Math.max(leftMax,arr[i]);
       }

        System.out.println(Arrays.toString(left));

       int rightMax = arr[n-1];
       for(int i = n-2;i>=0;i--){
            right[i] = rightMax;  //store rightMax for each bar
            rightMax = Math.max(rightMax,arr[i]);
        }

        System.out.println(Arrays.toString(right));

       int trappedWater = 0;

       for(int i = 0; i<n; i++){
           if(arr[i]<left[i]&&arr[i]<right[i]){
               trappedWater += Math.min(left[i],right[i])-arr[i];
           }
       }
       System.out.println("Total Amount: "+trappedWater);
       return trappedWater;
    }

    //O(N) time complexity and O(1) space complexity
    public static int trappedWaterOptimal(int arr[]){
        int n = arr.length;
        if(n<=2)
            return 0;
        int maxLeft = arr[0];
        int maxRight = arr[n-1];
        int trappedWater = 0;
        int left = 1; // left pointer
        int right = n-2; // right pointer
        while (left<=right){
            if(maxLeft<maxRight){
                if(arr[left]>=maxLeft){
                    maxLeft = arr[left];
                }else {
                    trappedWater += maxLeft - arr[left];
                }
                left++;
            }else {
                if(arr[right]>maxRight) {
                    maxRight = arr[right];
                }else {
                    trappedWater += maxRight - arr[right];
                }
                right--;

            }
        }
        System.out.println("Total Water: "+trappedWater);
        return trappedWater;

    }

    public static void main(String[] args) {
        //int arr[] = {1,0,2,1,0,1,3,2,1,2,1};
        int arr[] = {4,2,0,3,2,5};
        trappedWaterOptimal(arr);
    }
}
