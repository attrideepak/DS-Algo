package com.mylearnings.java.collections;


public class SparseArray {
    // Complete the matchingStrings function below.
    static int[] matchingStrings(String[] strings, String[] queries) {

        int a[] = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int count = 0;
            for (int j = 0; j < strings.length; j++) {
                if (queries[i].contentEquals(strings[j])) {
                    count++;
                    a[i] = count;
                }
            }System.out.println(a[i]);

        }

        return a;
    }

    public static void main(String[] args) {
        String[] queries = {"aba", "xzxb", "ab"};
        String[] strings = {"aba", "baba", "aba", "xzxb"};
        matchingStrings(strings, queries);


    }
}
