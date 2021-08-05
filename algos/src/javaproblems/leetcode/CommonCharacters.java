package javaproblems.leetcode;
//Good Problem
//https://leetcode.com/problems/find-common-characters/
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CommonCharacters {
    public static List<String> commonChars(String[] words) {
//["bella","label","roller"]
        String first = words[0];
        HashMap<Character,Integer> prev = new HashMap<>();
        for(char c:first.toCharArray()){
            prev.put(c,prev.getOrDefault(c,0)+1);
        }
        for(int i = 1; i < words.length; i++) {
            HashMap<Character, Integer> curr = new HashMap<>();
            for(char c : words[i].toCharArray()) {

                if(prev.containsKey(c) && prev.get(c) > 0) {
                    curr.put(c, curr.getOrDefault(c, 0)+1);
                    prev.put(c, prev.get(c)-1);
                }
            }
            prev = curr;
        }

        ArrayList<String> res = new ArrayList<>();
        for(char c : prev.keySet()) {
            while(prev.get(c) > 0) {
                res.add(c+"");
                prev.put(c, prev.get(c)-1);
            }
        }
        System.out.println(res.toString());
        return res;

    }
}
