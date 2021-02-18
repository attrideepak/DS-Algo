package com.mylearnings.java.collections;
//Breaking the Records

public class HackerrankWorstAndBestProblem {
	// Complete the breakingRecords function below.
    static int[] breakingRecords(int[] scores) {
        int countMax=0;
        int countMin = 0;
       int max = scores[0];
       int min = scores[0];
        int[] result = new int[2];
        for(int i =0;i<scores.length;i++){
            if(scores[i]>max){
                max = scores[i];
                countMax++;
            }
            else if(scores[i]<min){
                min = scores[i];
                countMin++;
            }
        }
        result[0]=countMax;
        result[1]=countMin;
        return result;

    }

}
