package javaproblems.stack;

import java.util.Arrays;
import java.util.Stack;

//1,3,2,4

public class NearestGreaterToRight {

    public  static int[] nearestGreater(int[] arr){
        int n = arr.length;
        int[] a = new int[n];
        Stack<Integer> stack = new Stack<>();
        for(int i = n-1; i>=0; i--){   // start traversing from end
            if(stack.size()==0){   //stack empty
                a[i] = -1;
            }else if(stack.size()>0 && stack.peek()>arr[i]){ // stack top is greater that arr[i]
                a[i]= stack.peek();
            }else if(stack.size() > 0 && stack.peek()<arr[i]){  // stack top is smaller than arr[i]
                while (stack.size() > 0 && stack.peek() <= arr[i]){  // loop until stack is empty or to is greater than arr[i]
                    stack.pop();
                }
                if(stack.size()==0){
                    a[i] = -1;
                }else {
                    a[i] = stack.peek();
                }
            }
            stack.push(arr[i]); //push element at position i in stack once if operations are done
        }
        System.out.println(Arrays.toString(a));
        return a;
    }

    public static void main(String[] args) {
        int a[] = {1,3,2,4,7,4,9,1,4};
        nearestGreater(a);
    }
}
