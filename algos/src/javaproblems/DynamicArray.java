package javaproblems;


import java.util.*;



/**
 * Created by Aeepakattri on 23/07/18.
 */
public class DynamicArray {

    // Complete the dynamicArray function below.
    static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
        int lastAnswer = 0;
        ArrayList<ArrayList<Integer>> seqList = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < n; i++) {
            seqList.add(new ArrayList<Integer>());
        }

        List<Integer> seq = new ArrayList<Integer>();
        List<Integer> lastAnswerList = new ArrayList<Integer>();
        for (int i = 0; i < queries.size(); i++) {
            int x = queries.get(i).get(1);
            int y = queries.get(i).get(2);
            int type = queries.get(i).get(0);
            int index = (x ^ lastAnswer) % n;
            seq = seqList.get(index);
            if (type == 1) {
                seqList.get(index).add(y);
            }
            else if (type == 2) {
                y = (queries.get(i).get(2)) % seq.size();
                lastAnswer = seqList.get(index).get(y);
                lastAnswerList.add(lastAnswer);
               // System.out.println(lastAnswerList);
            }

        }
        System.out.println(lastAnswerList);
        return lastAnswerList;
    }

    public static void main(String[] args) {



        List<List<Integer>> seqList = new ArrayList<List<Integer>>();
        ArrayList<Integer> subList1 = new ArrayList<Integer>();
        ArrayList<Integer> subList2 = new ArrayList<Integer>();
        ArrayList<Integer> subList3 = new ArrayList<Integer>();
        ArrayList<Integer> subList4 = new ArrayList<Integer>();
        ArrayList<Integer> subList5 = new ArrayList<Integer>();

        subList1.add(1);
        subList1.add(0);
        subList1.add(5);

        subList2.add(1);
        subList2.add(1);
        subList2.add(7);

        subList3.add(1);
        subList3.add(0);
        subList3.add(3);

        subList4.add(2);
        subList4.add(1);
        subList4.add(0);

        subList5.add(2);
        subList5.add(1);
        subList5.add(1);


        seqList.add(subList1);
        seqList.add(subList2);
        seqList.add(subList3);
        seqList.add(subList4);
        seqList.add(subList5);

       // System.out.println(seqList);
       // System.out.println(seqList.get(0).get(0));

        dynamicArray(2, seqList);


        //[[1,0,5],[1,1,7],[1,0,3],[2,1,0],[2,1,1]];









    }
}
