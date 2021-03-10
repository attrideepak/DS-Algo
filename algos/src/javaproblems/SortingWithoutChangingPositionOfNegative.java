package javaproblems;

import java.util.ArrayList;
import java.util.Collections;

public class SortingWithoutChangingPositionOfNegative {

	public static void main(String[] args) {
		int arr[] = { 2, -6, -3, 8, 4, 1 }; 
		sort(arr);

	}
	
	static void sort(int a[]) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		//Add positive to list
		for(int i =0 ; i<a.length ; i++) {
			if(a[i]>=0) {
				list.add(a[i]);
			}
		}
		//Sort the list
		Collections.sort(list);	
		int  j = 0;
		
		//Replace the elements of the array with the sorted elements from list, only positive will be replaced and negative will be skipped.
		for(int i =0 ; i<a.length; i++) {
			if(a[i]>=0) {
				a[i]= list.get(j);
				j++;
			}
		}
		for (int i = 0; i < a.length; i++) 
	        System.out.print(a[i] + " ");
	}

}
