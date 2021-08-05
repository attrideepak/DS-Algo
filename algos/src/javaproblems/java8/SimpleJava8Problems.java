package javaproblems.java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SimpleJava8Problems {


    /**
     * counts character in a string
     * @param str
     * @param ch
     * @return
     */
    static int countCharacters(String str,char ch){
        long count = str.chars().filter(e->(char)e == ch).count();
        return (int)count;
    }


    /**
     * count vowel in a string
     * @param str
     * @return
     */
    static int countVowels(String str) {
        IntPredicate vowel = i -> i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u';
        long count = str.chars().filter(vowel).count();
        return (int)count;
    }


    /**
     * concat two arrays
     * @param arr1
     * @param arr2
     * @return
     */
    static String[] concatArray(String[] arr1,String[] arr2){
        Stream<String> str1 = Arrays.stream(arr1);
        Stream<String> str2 = Arrays.stream(arr2);

        String[] combinedArray = Stream.concat(str1,str2).toArray(s->new String[s]);

        return combinedArray;
     }

    /**
     * duplicates in string array
     * @param arr
     * @return
     */

     static List<String> duplicates(String[] arr){
        Set<String>dataSet = new HashSet<>();

        List<String> dups = Arrays.stream(arr).filter(e->!dataSet.add(e)).collect(Collectors.toList());

        return dups;
     }


}
