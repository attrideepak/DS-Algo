package com.mylearnings.java.collections;

public class MoveZeroesToEnd {

	public static void main(String[] args) {
		int a[] = {0,1,0,3,0,1,4,4,0};
		moveZeroes(a);
		for (int i=0; i<a.length; i++) 
            System.out.print(a[i]+" "); 

	}
	
	static void moveZeroes(int a[]) {
		int count = 0;
		for(int i =0; i<a.length;i++) {
			if(a[i]!= 0) {
				a[count++] = a[i];
			}
		}
		while (count<a.length) {
			a[count++] = 0;
		}
	}
	
	/*
	 * i = 0; a[0]is not equal to zero, a[1]=a[1]=1
	 * i = 1; a[1] is equal to zero, nothing happens
	 * i = 2; a[2] is not zero, a[2] = a[2] = 
	 * */

}
