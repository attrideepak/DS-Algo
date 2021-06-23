package javaproblems.binarysearch;

//Find the Rotation Count in Rotated Sorted array
/*
- Find index of min element
 */
public class RotationCountSortedArray {


    public static int getCount(int[] arr){
        int n = arr.length;
        int start = 0;
        int end = n-1;
        int first = -1;

        if(n<=1){
            System.out.println("Invalid input");
            return -1;
        }

        while (start<=end){
            if (arr[start] < arr[end]) {   //not rotated, sorted array
                System.out.println("Array is rotated 0 times");
                return start;
            }
            int mid = (start+end)/2;
            int previous = (mid +n -1)%n ;
            int next = (mid+1)%n;

            if(arr[mid]<=arr[previous]&&arr[mid]<=arr[next]){  //compare mid with next and previous to find min element
                first = mid;
                end = mid - 1;  // first occurence
            }
            else if(arr[start]<=arr[mid]){
                start = mid + 1;
            }else if(arr[mid]<=arr[end]){
                end = mid -1;
            }
        }
        System.out.println("Array is rotated "+first+ " times");
        return first;
    }


    public static void main(String[] args) {
        int[] a = {15,16,17};
        getCount(a);
    }
}
