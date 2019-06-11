package com.mylearnings.java.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HackerRankBirthdatChocolate {
	
	public static void main(String[] args) {
		List<Integer> s = new ArrayList<Integer>();
		s.add(1);
		s.add(2);
		s.add(1);
		s.add(3);
		s.add(2);
		
		int[] a = {1,2,1,3,2};
		
		//birthday(s,3,2);
		birthdayJava8(a,3,2);
	}
	////1 2 1 3 2
	//m = length = 2
	//d = sum= 3
	static int birthday(List<Integer> s, int d, int m) {
        int startingIndex = 0;
        int result = 0;
        int sumDate = 0;
        for(int i = 0; i< (s.size()-(m-1)); i++) {
            startingIndex = i;
            for(int j = 0; j<m;j++) {
                sumDate = sumDate + s.get(i+j);
            }
            if(sumDate==d) {
                result++;
            }
         sumDate = 0;   
        }
        
        System.out.print(result);
        return result;


    }
	
	static int birthdayJava8(int[] s, int d, int m) {
        int result = 0;
        for(int i = 0; i< (s.length-(m-1)); i++) {
            if(Arrays.stream(s,i,i+m).sum() == d)
            
           // System.out.println(Arrays.stream(s,i,i+m).sum()== d);
            
            result++;
            
        }
        System.out.println(result);
        return result;

    }


}
