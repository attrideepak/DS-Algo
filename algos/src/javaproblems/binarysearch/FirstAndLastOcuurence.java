package javaproblems.binarysearch;

//Java program to find first and last occurrence of an elements in given sorted array
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
//https://www.youtube.com/watch?v=zr_AoTxzn0Y&t=445s
public class FirstAndLastOcuurence {

    //time complexity O()N
    public static void getFirstAndLast(int[] arr,int k){
        int first = -1;
        int last = -1;
            for(int i = 0; i<arr.length; i++){
                if(k == arr[i]){
                    if(first==-1) {
                        first = i;
                    }
                    last = i;
                }

            }
        if (first != -1) {
            System.out.println("First Occurrence = " + first);
            System.out.println("Last Occurrence = " + last);
        }

    }
    //time complexity Log(N)
    public static int findFirst(int[] arr,int k){
        int start = 0;
        int end = arr.length - 1;
        int first = -1;

        while (start <= end) {
            int mid = (start +end)/2;
            if(k == arr[mid]){
                first = mid;
                end = mid - 1;
            }else  if(k<arr[mid]){
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
        return first;

    }

    public int[] searchRange(int[] nums, int target) {
        int[] range = new int[2];
        range[0] = findFirst(nums,target);
        range[1] = findLast(nums,target);
        return range;
    }

    //time complexity Log(N)
    public static int findLast(int[] arr,int k){
        int start = 0;
        int end = arr.length - 1;
        int last = -1;

        while (start <= end) {
            int mid = (start +end)/2;
            if(k == arr[mid]){
                last = mid;
                start = mid + 1;
            }else  if(k<arr[mid]){
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
       return last;
    }



    public static void main(String[] args) {
            int a[] = {1, 2, 2, 2, 2, 3, 4, 7, 8, 8};
           // getFirstAndLast(a,2);
        findFirst(a,2);
        findLast(a,2);
    }
}
