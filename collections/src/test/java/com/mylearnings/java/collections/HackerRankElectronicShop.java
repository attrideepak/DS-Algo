package com.mylearnings.java.collections;

public class HackerRankElectronicShop {

	public static void main(String[] args) {
		
		int[] keyboards = {3,1};
		int[] drives = {5,2,8};
		int b =10;
		
		getMoneySpent(keyboards,drives,b);
		System.out.println(getMoneySpent(keyboards,drives,b));
		
		
	}
	
	static int getMoneySpent(int[] keyboards, int[] drives, int b) {
		int totalAmount = -1;
		for(int i = 0;i<=keyboards.length;i++) {
			for(int j = 0;i<=drives.length;j++) {
				if(totalAmount<b) {
					totalAmount = keyboards[i]+drives[i];
			}else if(totalAmount>b) {
				totalAmount = -1;
				}
			}
		}
		System.out.println(totalAmount);
		return totalAmount;
	}
}
		
 
