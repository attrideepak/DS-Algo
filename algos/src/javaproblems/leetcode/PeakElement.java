package javaproblems.leetcode;
//https://leetcode.com/problems/find-peak-element/
public class PeakElement {

    public static int findPeakElementIndex(int[] arr){
        int low = 0;
        int high = arr.length -1;

        if(arr.length<=1){
            return 0;
        }

        while(low<=high){
            int mid = low+(high-low)/2;
            if(mid>0&&mid<arr.length-1){
                if(arr[mid]>arr[mid-1]&&arr[mid]>arr[mid+1]){
                    return mid;
                }else if(arr[mid-1]>arr[mid]){
                    high = mid -1;
                }else {
                    low = mid +1;
                }
            }else if(mid == 0){
                if(arr[mid]>arr[mid+1]){
                    return 0;
                }else {
                    return 1;
                }
            }else if(mid ==  arr.length -1){
                if(arr[mid]>arr[mid -1]) {
                    return arr.length -1;
                }else {
                    return arr.length -2;
                }
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {1,2};
        System.out.println(findPeakElementIndex(a));
    }
}
