package com.mylearnings.java.collections;
/**
 * Created by Aeepakattri on 18/07/18.
 */

public class Array {

    public static void main(String[] args) {

        // Complete the diagonalDifference function below

        int[][] arr = {
                {1, 2, 3, 4},
                {1, 3, 3, 4},
                {1, 2, 3, 4},
                {1, 2, 3, 5}
        };

        int pDiagnol = 0;
        int sDiagnol = 0;
        for (int i = 0; i < 4; i++)
        { pDiagnol += arr[i][i];
            sDiagnol += arr[i][4-i-1];

        }
        System.out.println("Sum of primary diagnol  " + pDiagnol);
        System.out.println("Sum of secondary diagnol  " + sDiagnol);

        Math.abs(pDiagnol-sDiagnol);

        System.out.println("Absolute difference " +Math.abs(pDiagnol-sDiagnol));


//        int sDiagnol = 0;
//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j < 4; j++) {
//                sDiagnol += arr[i][4-i-1];
//                System.out.println("Sum of secondary diagnol  " + sDiagnol);
//            }
//
//        }

    }
}
