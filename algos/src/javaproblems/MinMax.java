package javaproblems;



/**
 * Created by Aeepakattri on 21/07/18.
 */
public class MinMax {
    public static void main(String[] args) {
        long[] arr = {1,2,3,4,5};
        long sum = 0;
        long max = arr[0];
        long min = arr[0];
        int i;
        for(i =1 ; i<arr.length;i++)
        {
            {
                if (arr[i] > max)
                    max = arr[i];
            }

            {
                if (arr[i] < min)
                    min = arr[i];
            }
        }
        for(int j=0;j<arr.length;j++)
        {
            sum += arr[j];
        }
        System.out.print((sum-max) + " " + (sum-min));

    }
}
