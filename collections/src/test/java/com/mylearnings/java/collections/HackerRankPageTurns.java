package com.mylearnings.java.collections;

public class HackerRankPageTurns {
	
	static int pageCount(int p, int n) {
		int countfromstart = 0;
		int pageNoIncrement = 0;
		int countfromEnd = 0;
	
		
		if(n/2>p) {
			System.out.println("Count from start");
			while(pageNoIncrement<p) {
				countfromstart++;
				pageNoIncrement=pageNoIncrement+2;
			}
		}
		else
			System.out.println("Count from end");
		while(n>p) {
			countfromEnd++;
			n=n-2;
		}
		System.out.println(Math.min(countfromstart, countfromEnd));
		return Math.min(countfromstart, countfromEnd);
	}
	public static void main(String[]args) {
		pageCount(5,12);
	}

}
