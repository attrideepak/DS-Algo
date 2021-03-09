package com.mylearnings.java.collections;


public class RecursionDemo {

	public static void main(String[] args) {
		//reduceByOne(10);
		//System.out.println(factorial(5));
		//for(int i=1;i<=100;i++) 
		//System.out.print(fib(i) + " ");
		//System.out.println(factorial(i));
		fibonacci(9);


	}
	public static void reduceByOne(int n) {
		if(n>=0) {              //base case, condition which tells the recursion to stop
		reduceByOne(n-1);
	}
		System.out.println("Completed Execution" +n);
	}
	
	public static long factorial(int n) {    //factorial
		if(n==1)
			return 1;
		else { 
			return n*factorial(n-1);
		}
	}
	
	public static int fib(int n) {
		if(n==1||n==2)
			return 1;
		else {
			//System.out.print(fib(n-1)+fib(n-2));
			return fib(n-1)+fib(n-2);
		}
		
	}
	
	public static void fibonacci(int n) {
		int a = 0;
		int b = 0;
		int c = 1;
		
		for(int i = 1; i <= n; i++)
        {
            a = b;
            b = c;
            c = a + b;
            System.out.print(a+" ");
        }
		
	}
	
	
}
