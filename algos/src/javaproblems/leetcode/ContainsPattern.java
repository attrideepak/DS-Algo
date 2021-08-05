package javaproblems.leetcode;
//Good Problem
//https://leetcode.com/problems/detect-pattern-of-length-m-repeated-k-or-more-times
public class ContainsPattern {
    public static boolean containsPattern(int[] arr, int m, int k) {  //m-->size, k =repetetion
        int count = 0;
        for(int i = 0; i  < arr.length-m; i++)
        {
            if(arr[i] == arr[i + m])
            {
                count++;
            }
            else{
                count = 0;
            }
            System.out.println(count);
            if(count==(k-1)*m)
            {
                return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        int arr[] = {1,2,1,2,1,1,1,3};
        containsPattern(arr,2,2);
    }
}
