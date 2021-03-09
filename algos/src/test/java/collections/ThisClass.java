package com.mylearnings.java.collections;

public class ThisClass {
	public static void main(String[] args) {
		A obj = new A(2);
		obj.show();
	}

}

class A {
	private int x; //instance variable: defined outside method
	
	public A(int x) { //local variable. this.x means that the x is not a local variable its a instance variable
	this.x = x;          //this.x assigns value to current instance variable
	}
	public void show() {
		System.out.println("value of x is " + x);
	}
}
