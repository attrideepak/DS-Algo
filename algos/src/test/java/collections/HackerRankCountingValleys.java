package com.mylearnings.java.collections;

public class HackerRankCountingValleys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "DDUUUUDD";
		countingValleys(8,s);

	}
	static int countingValleys(int n, String s) {
		char[] stepsArray = s.toCharArray();
		int valleyCount = 0;
		int currentLevel = 0;
		for(char c:stepsArray ) {
		if(c == 'D') {
			--currentLevel;
		}
		if(c == 'U') {
			++currentLevel;
		}
		if(currentLevel==0&&c=='U') {
			++valleyCount;
		}
		}
		System.out.print(valleyCount);
		
		return valleyCount;


    }

}
