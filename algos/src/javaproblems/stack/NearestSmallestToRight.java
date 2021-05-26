package javaproblems.stack;

import java.util.Arrays;
import java.util.Stack;

//1,5,3,4,2
public class NearestSmallestToRight {

    static int[] findSmallest(int[] arr){
        int n = arr.length;
        int[] a = new int[n];
        Stack<Integer> stack = new Stack<>();
        for(int i = n-1; i>=0; i--){
            if(stack.size() == 0){
                a[i] = -1;
            }else if (stack.size()>0 && stack.peek()<arr[i]){
                a[i] = stack.peek();
            }else if (stack.size()>0 && stack.peek()>=arr[i]){
                while (stack.size()>0 && stack.peek()>=arr[i]){
                    stack.pop();
                }
                if(stack.size()==0){
                    a[i] = -1;
                }else {
                    a[i] = stack.peek();
                }
            }

            stack.push(arr[i]);
        }
        System.out.println(Arrays.toString(a));
        return a;
    }

    public static void main(String[] args) {
        int[] a = {1,5,3,4,2};
        findSmallest(a);
    }
}
