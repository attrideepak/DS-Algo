package javaproblems;

public class LinkedListStack {
	Node head;
	
	public boolean isEmpty() {
		return (head == null);    //check if the stack is empty
	}

	public void push(int data) { //inserting a node at start
		Node node = new Node();
		node.data = data;   		
		//node.next = null;
		node.next = head;
		head = node;
		
	}
	
	public int pop() {
		int data = 0;
		if(isEmpty()==true)
		{
			System.out.println("Stack is empty");
		}
		else
		{
		data = head.data; 
		head = head.next;
			//Node temp;
			//temp = head;
			//head = head.next;
		}
		return data;
		
	}
	
	public void show() {
		Node node = head;
		while(node.next!=null)
		{
			System.out.println(node.data);  //loop will stop as soon as null value comes so it will not print the data with null node
			node = node.next;
		}
		System.out.println(node.data);  //therefore we print the data for that node outside loop
	}
	
	public static void main(String[] args) {
		LinkedListStack stack = new LinkedListStack();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.pop();
		stack.show();
		stack.pop();
		stack.show();
		
	}
	
}
