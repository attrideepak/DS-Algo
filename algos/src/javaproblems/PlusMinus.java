package javaproblems;


public class PlusMinus {

    static void plusMinus(int[] arr) {
        // Complete the plusMinus function below.

        float plusCount = 0;
        float minusCount = 0;
        float zeroCount = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {

            if (arr[i] > 0) {
                plusCount++ ;
            }

            else if (arr[i]<0) {
                minusCount++ ;
            }
            else{
                zeroCount ++ ;
            }



        }

        System.out.println(String.format("%.6f",plusCount/n));
        System.out.println(String.format("%.6f",minusCount/n));
        System.out.println(String.format("%.6f",zeroCount/n));

    }

    public static void main(String[] args) {
        int[] ar = {-4 ,3 ,-9, 0, 4 ,1};
        plusMinus(ar);
    }
}





