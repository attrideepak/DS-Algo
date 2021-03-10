package javaproblems;



import java.util.Arrays;

/**
 * Created by Deepakattri on 03/08/18.
 */
public class BirthDayCandles {
    static int birthdayCakeCandles(int[] ar) {
        int blown=0;
        Arrays.sort(ar);
        int m = ar.length;
        int n= ar[m-1];
        for(int i=0; i< m;i++){
            if(ar[i]==n){
                blown++;
            }
        }
        return blown;



    }
}
