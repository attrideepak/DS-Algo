package javaproblems.leetcode;
//https://www.geeksforgeeks.org/allocate-minimum-number-pages/
//https://leetcode.com/problems/split-array-largest-sum/submissions/
//https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/submissions/

public class SplitArrayMinimumSum {



    public static int splitArray(int[] arr, int k) {
        int n = arr.length;
        int start = -1;
        int end = 0;   //sum of array
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++){
            end = end+arr[i];
            start = Math.max(start,arr[i]);
        }
        int mid = -1;
        while(start<=end) {
            mid = start + (end - start) / 2;
            if (isValid(arr, n, k,mid)==true) {
                result = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return result;
    }
    public static boolean isValid(int[] arr, int n,int k,int maxPages ){  //n = arr.length, k = students
        if(n<k){
            return false;
        }
        int student = 1;
        int sum = 0;
        // iterate over all books
        for(int i = 0; i<arr.length; i++){
            sum= sum+arr[i];
            if(sum>maxPages){
                student++;
                sum = arr[i];
            }
            if(student>k){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] a = {7,2,9,10};
        System.out.println(splitArray(a,2));
    }
}
