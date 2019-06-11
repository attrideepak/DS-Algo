package com.mylearnings.java.collections;

import java.util.ArrayList;
import java.util.List;

public class HackkerRankMigratoryBirds {

	public static void main(String[] args) {
		ArrayList<Integer> birds = new ArrayList<Integer>();
		birds.add(1);
		birds.add(4);
		birds.add(4);
		birds.add(4);
		birds.add(5);
		birds.add(3);
		birds.add(4);
		birds.add(4);
		birds.add(5);
		birds.add(3);
	
		
		migratoryBirds(birds);

	}
	static int migratoryBirds(List<Integer> arr) {
        // Get counts of each type 
        int[] count  = new int[6];
        for(int num : arr){
           count[num]++; 
           System.out.println(count[num]);
        }
        System.out.println("size of array "+count.length);
        
        
        
         // Find max 
        int maxIndex = 1;
        for(int i =0 ; i<count.length;i++){
            if(count[i]>count[maxIndex]){
                maxIndex = i;
            }
        }
       // System.out.println(maxIndex);
        return maxIndex;
        }

}
