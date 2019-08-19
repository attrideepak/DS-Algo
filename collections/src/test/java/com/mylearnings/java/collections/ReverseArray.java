package com.mylearnings.java.collections;



public class ReverseArray {
    static int[] reverseArray(int[] a) {
        int[] b = new int[a.length];
        for (int j = 0; j < a.length; j++)
        {
            b[j]=a[a.length-j-1];
            System.out.print(b[j]+ " ");
        }
        return b;
    }

   // a[0] = 1, a[1] = 4, a[2]=3, a[3]=2

    public static void main(String[] args) {

        int[] a = {1,4,3,2};
        reverseArray(a);

    }

}
