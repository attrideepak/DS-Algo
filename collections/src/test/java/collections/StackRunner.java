package com.mylearnings.java.collections;

public class StackRunner {

		public static void main(String[] args) {
			Stack nums = new Stack();
			nums.push(15);
			nums.push(51);
			nums.push(67);
			nums.push(12);
			
			System.out.println(nums.peek());
			System.out.println(nums.pop());
			
			nums.show();
			
			
		}
}
