package javaproblems.leetcode;

import java.util.Stack;
//https://leetcode.com/problems/final-prices-with-a-special-discount-in-a-shop


//Given the array prices where prices[i] is the price of the ith item in a shop. There is a special discount for items in the shop,
// if you buy the ith item, then you will receive a discount equivalent to prices[j] where j is the minimum index such that j > i and
// prices[j] <= prices[i], otherwise, you will not receive any discount at all.
// Return an array where the ith element is the final price you will pay for the ith item of the shop considering the special discount.
//[8,4,6,2,3] => [4,2,4,2,3]
public class FinalPrices {
    public static int[] finalPrices(int[] prices) {
        //use stack to keep track of the larger numbers from processed array
        Stack<Integer> stack = new Stack<>();

        //Iterate prices array from back, so we have smaller elements in stack
        for (int i = prices.length - 1; i >= 0; i--) {
            // store cur elem for future use as we will manipulate prices[i]
            int cur = prices[i];
            while (!stack.isEmpty() && stack.peek() > cur) {
                // clear all the element from stack which are greater than current element
                stack.pop();
            }
            if (stack.isEmpty()) {
                // if stack is empty, that means we don't have anything ahead of that element in array which is smaller
                // so item will be sold at current price only
                prices[i] = cur;
            } else {
                // after clearing all the greater elements from the stack
                // now we have 1st occurrence of smaller element at top of stack
                prices[i] = cur - stack.peek();
            }
            // store current element for the next iteration
            stack.push(cur);
        }
        return prices;
    }
}
