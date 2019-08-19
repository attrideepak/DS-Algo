package com.mylearnings.java.collections;

public class HourGlasssSum {
    static int hourglassSum(int[][] arr) {
        int maxsum = Integer.MIN_VALUE;
    for(int i = 0; i<4;i++) {  //rows
        for (int k = 0; k < 4; k++) { //columns
          int sum = arr[i][k] + arr[i][k + 1] + arr[i][k + 2]   //for first row of the hour glass, i = 0
                    + arr[i + 1][k + 1]                    // for second row of hour glass
                    + arr[i + 2][k] + arr[i + 2][k + 1] + arr[i + 2][k + 2]; //for third row of hour glass
            if (sum > maxsum)
            { maxsum = sum;}
        }
    }
        System.out.println(maxsum);
        return maxsum;
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1, 1, 1, 0 ,0, 0},
                {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 0, 2, 4, 4, 0},
                {0, 0, 0, 2, 0, 0},
                {0, 0, 1, 2, 4, 0}
        };
        hourglassSum(arr);
    }
}
