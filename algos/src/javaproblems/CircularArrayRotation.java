package javaproblems;

//a = {3,4,5}
//k = 2
//queries = {1,2}
//Here k is the number of rotations on a, and queries holds the list of indices to report. First we perform the two rotations:
//{3,4,5} -> {5,3,4} -> {4,5,3}
//Now return the values from the zero-based indices 1 and 2 as indicated in the queries  array.
//Output = {5,3}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CircularArrayRotation {
    public static List<Integer> circularArrayRotationa(List<Integer> a, int k, List<Integer> queries) {
        int s = a.size();
        List<Integer> rotatedList = a.stream().map(i -> a.get((a.indexOf(i) + (s - k % s)) % s)).collect(Collectors.toList());
        List<Integer> queryList = queries.stream().map(q -> rotatedList.get(q)).collect(Collectors.toList());

        System.out.println(rotatedList.toString());
        System.out.println(queryList.toString());
        return queryList;

    }

    public static List<Integer> circularArrayRotationb(List<Integer> a, int k, List<Integer> queries) {
        List<Integer> queryList = new ArrayList<>();
        List<Integer> rotatedList = new ArrayList<>();
        for (int i = 0; i < a.size(); i++) {
            int s = a.size();
            int j = (i + (s - (k % s))) % s;
            rotatedList.add(a.get(j));

        }
        for (int j = 0; j < queries.size(); j++) {
            queryList.add(rotatedList.get(queries.get(j)));
        }
        System.out.println(queryList);

        return queryList;

    }

    public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
        int element = 0;
        for (int i = 0; i < k; i++) {
            element = a.remove(a.size() - 1);
            a.add(0, element);
        }
        List<Integer> result = new ArrayList<>();
        for (Integer i : queries) {
            result.add(a.get(i));
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(3);
        a.add(4);
        a.add(5);
        List<Integer> queries = Arrays.asList(1, 2);
        circularArrayRotation(a, 5, queries);
    }
}
