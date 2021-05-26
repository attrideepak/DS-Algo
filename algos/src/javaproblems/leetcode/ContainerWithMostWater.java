package javaproblems.leetcode;
//https://leetcode.com/problems/container-with-most-water/
//https://www.youtube.com/watch?v=ZHQg07n_tbg

//[1,8,6,2,5,4,8,3,7]

public class ContainerWithMostWater {
    public static int maxWater(int[] arr){
        int n = arr.length;

        int l = 0;
        int r = n-1;
        int max = 0;
        if(n<=1){
            return 0;
        }
        while(l<r){
            int leftHeight = arr[l];
            int rightHeight = arr[r];
            int minHeight = Math.min(leftHeight,rightHeight);
            int width = r-l;
            int currentArea = minHeight*width;
            max = Math.max(max,currentArea);
            if(leftHeight<rightHeight){
                l++;
            }else {
                r--;
            }
        }
        System.out.println(max);
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1,8,6,2,5,4,8,3,7};
        maxWater(arr);
    }
}
