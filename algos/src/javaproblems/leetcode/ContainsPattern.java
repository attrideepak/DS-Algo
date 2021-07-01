package javaproblems.leetcode;
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
            if(count==(k-1)*m)
            {
                return true;
            }
        }
        return false;

    }
}
