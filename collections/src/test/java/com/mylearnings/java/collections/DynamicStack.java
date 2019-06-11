package com.mylearnings.java.collections;

public class DynamicStack {
	
		int capacity = 2;
		int stack[] = new int[capacity];
		int top = 0;
		
		//push method
		public void push(int data) {
			if(size()==capacity)
				expand();
				stack[top]= data;
				top++;
			
			
		}
		private void expand() {
			int length = size();
			int newStack[] = new int[capacity*2];
			System.arraycopy(stack, 0, newStack, 0, length);
			stack = newStack;
			capacity = capacity*2;
		}
		
		public void show() {
			for(int n : stack)
			{
				System.out.println(n + " ");
			}
		}
		
		//pop method
		
		public int pop() {
			int data=0;
			if(isEmpty())
			{
				System.out.println("Stack is empty");
			}
			else
			{
			
			top--;
			data = stack[top];
			stack[top]= 0;
			shrink();
			
			}
			return data;
		}
		
		private void shrink() {
			int length = size();
			if(length<=(capacity/2)/2)
				capacity = capacity/2;
			int newStack[] = new int[capacity];
			System.arraycopy(stack, 0, newStack, 0, length);
			stack = newStack;
			
		}
		public int peek() {
			int data;
			data = stack[top-1];
			return data;
		}
		
		public int size() {
			
			return top;
		}
		
		public boolean isEmpty() {
			return top <= 0;
		}
		
		public static void main(String[] args) {
			DynamicStack stack = new DynamicStack();
			stack.push(1);
			stack.push(2);
			stack.push(3);
			stack.push(4);
			stack.push(5);
			stack.pop();
			stack.show();
			//stack.pop();
			//stack.show();
		}

	}



