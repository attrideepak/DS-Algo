package javaproblems;

public class Stack {
	
	int stack[] = new int[5];
	int top = 0;
	
	//push method
	public void push(int data) {
		if(top==5) 
		{
			System.out.println("Stack is full");
		}
		else
		{
			stack[top]= data;
			top++;
		}
		
	}
	
	public void show() {
		for(int n : stack)
		{
			System.out.print(n + " ");
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
		
		}
		return data;
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

}
