package javaproblems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SmallestPositiveInteger {
    public static int smallestPositive(int[] arr) {
        if (arr.length == 0) {
            return 1;
        }
        int i = 0;
        while (i < arr.length) {
            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[arr[i] - 1]) {
                int otherIndex = arr[i] - 1;
                int temp;
                temp = arr[i];
                arr[i] = arr[otherIndex];
                arr[otherIndex] = temp;
            } else {
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                return j + 1;
            }
        }
        return arr.length + 1;
    }


    public static int hashSetSolution(int arr[]) {
        Set<Integer> hSet = new HashSet<>();

        for (int i : arr) {
            if (i > 0) {
                hSet.add(i);
            }
        }

        if (hSet.size() <= 1 && !hSet.contains(1)) {
            return 1;
        }

        for (int i = 1; i <= hSet.size(); i++) {
            if (!hSet.contains(i)) {
                return i;
            }
        }
        return hSet.size() + 1;
    }

    public int normalSolution(int[] arr) {
        int smallestInt = 1;

        if (arr.length == 0) return smallestInt;

        Arrays.sort(arr);

        if (arr[0] > 1) return smallestInt;
        if (arr[arr.length - 1] <= 0) return smallestInt;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == smallestInt) {
                smallestInt++;
            } else if (arr[i] > smallestInt) {
                break;
            }

        }

        return smallestInt;
    }

    public static void main(String[] args) {
        // int a[] ={1,2,3,4,5};
        // int a[] ={1,2,5,7,8,9};
        // int a[] = {1,2,0};

        //  int a[] = {-1,3,1,-3,4};
        // int a[] = {-1,-2,-3,-4};
        //int a[] = {7,8,9,11};
        // int a[] = {1};
        // int a[] = {2};
        int a[] = {7, -1, 3, 1, -3, 4, 8};

        System.out.println(smallestPositive(a));
    }
}
