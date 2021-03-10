package javaproblems;
import java.util.*;


public class SolutionDynamicArray {

    private static Scanner in;

	public static void main(String[] args){
        in = new Scanner(System.in);
        int n = in.nextInt();
        int lastAns = 0;

        ArrayList<ArrayList<Integer>> seqList = new ArrayList<ArrayList<Integer>>(n);
        for(int i = 0; i < n; i++){
            seqList.add(new ArrayList<Integer>());
        }

        int queries = in.nextInt();

        for(int i = 0; i < queries; i++) {
            int command = in.nextInt();
            int x = in.nextInt();
            int y = in.nextInt();

            int index = ((x ^ lastAns) % n);

            if (command == 1) {
                seqList.get(index).add(y);
            } else if (command == 2) {
                y = y % seqList.get(index).size();
                lastAns = seqList.get(index).get(y);
                System.out.println(lastAns);
            } else {
                // Invalid command
            }


        }}}
