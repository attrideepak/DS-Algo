package javaproblems.leetcode;

import java.util.Arrays;
import java.util.Stack;

//{2,5,3,4}   0,

public class MaxAreaOfHistogram {


    static int[] smallestToLeft(int arr[]){   //finding indexes of nearest smallest to left
        int n = arr.length;
        int[] a = new int[n];
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i<n; i++){
            if(stack.size() == 0){
                a[i] = -1;
            }else if (stack.size()>0 && arr[stack.peek()]<arr[i]){
                a[i] =stack.peek();
            }else if (stack.size()>0 && arr[stack.peek()]>=arr[i]){
                while (stack.size()>0 && arr[stack.peek()]>=arr[i]){
                    stack.pop();
                }
                if(stack.size()==0){
                    a[i] = -1;
                }else {
                    a[i] = stack.peek();
                }
            }

            stack.push(i);
        }
        System.out.println(Arrays.toString(a));
        return a;
    }

    static int[] smallestToRight(int[] arr){  //finding indexes of nearest smallest to right
        int n = arr.length;
        int[] a = new int[n];
        Stack<Integer> stack = new Stack<>();
        for(int i = n-1; i>=0; i--){
            if(stack.size() == 0){
                a[i] = n;
            }else if (stack.size()>0 && arr[stack.peek()]<arr[i]){
                a[i] = stack.peek();
            }else if (stack.size()>0 && arr[stack.peek()]>=arr[i]){
                while (stack.size()>0 && arr[stack.peek()]>=arr[i]){
                    stack.pop();
                }
                if(stack.size()==0){
                    a[i] = n;
                }else {
                    a[i] = stack.peek();
                }
            }

            stack.push(i);
        }
        System.out.println(Arrays.toString(a));
        return a;
    }

    static int[] width(int[] arr){
        int[] right = smallestToRight(arr);
        int[] left = smallestToLeft(arr);
        int[] width = new int[arr.length];
        for(int i = 0; i< arr.length;i++){
            width[i] = right[i] -left[i] -1;
        }
        System.out.println(Arrays.toString(width));
        return width;
    }

    static int findMaxArea(int[] arr){
        int[] area = new int[arr.length];
        int [] width = width(arr);
        for(int i = 0; i<arr.length; i++){
            area[i] = width[i]*arr[i];
        }
        System.out.println(Arrays.toString(area));
        Arrays.sort(area);
        System.out.println(area[arr.length-1]);
        return area[arr.length-1];
    }


    public static void main(String[] args) {
        int[] a = {2,1,5,6,2,3};
        findMaxArea(a);
    }


}
