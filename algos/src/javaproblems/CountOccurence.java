package javaproblems;

import java.util.Arrays;

public class CountOccurence {

	public static void main(String[] args) {
		int[] a = {1, 9, 8, 8, 7, 6, 5, 4, 3, 3, 2, 1,15};

		Arrays.sort(a);

		int nbOccurences = 1;

		for (int i = 0, length = a.length; i < length; i++) {
			if (i < length - 1) {
				if (a[i] == a[i + 1]) {
					nbOccurences++;
				}
			} else {
				System.out.println(a[i] + " occurs " + nbOccurences
						+ " time(s)"); //end of array
			}

			if (i < length - 1 && a[i] != a[i + 1]) {
				System.out.println(a[i] + " occurs " + nbOccurences
						+ " time(s)"); //moving to new element in array
				nbOccurences = 1;
			}
		}
	}
//		1 occurs 2 time(s)
//		2 occurs 1 time(s)
//		3 occurs 2 time(s)
//		4 occurs 1 time(s)
//		5 occurs 1 time(s)
//		6 occurs 1 time(s)
//		7 occurs 1 time(s)
//		8 occurs 2 time(s)
//		9 occurs 1 time(s)
//		15 occurs 1 time(s)
//		int[] a = {1, 9, 8, 8, 7, 6, 5, 4, 3, 3, 2, 1,15};
//
//		Arrays.sort(a);
//
//		int nbOccurences = 1;
//
//		for (int i = 0; i < a.length-1; i++) {
//				if (a[i] == a[i + 1]) {
//					nbOccurences++;
//				}
////				System.out.println(a[i] + " occurs " + nbOccurences
////						+ " time(s)"); //end of array
//			   if (a[i] != a[i + 1]) {
////				System.out.println(a[i] + " occurs " + nbOccurences
////						+ " time(s)"); //moving to new element in array
//				nbOccurences = 1;
//			}
//			   
//		}
//		
//	}
}






