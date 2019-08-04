package com.mylearnings.java.collections;

public class LinkedList {
	Node head;  //initial node is head
//	Node tail;
	
	public void insert(int userData) {  //whenever inserting a new data a new node is created
		
		Node node = new Node(); //creating a obj of Node class i.e creating a node
		node.data = userData;   //assigning data to node
		node.next = null;      //this is by default
		
		if(head == null) {//means that no nodes are present we start with creating a first node and 
							//it is equal to head
			head = node; 
		}
		else { 
			Node n = head;  
			
			/*n is a temporary node that holds the data while we traverse through the list 
			and we assigned it a initial value 'head' becoz we want to start from the begining*/
			
		while(n.next!=null) { //traverse it till we get a null value and add a node after that null
				n = n.next;
				//n.next = node; 
			}
		n.next = node;  //once we get a null value we will assign the node which we created
			
		}
		
		
		
	/*	
	 * By taking a head and tail node
	 * Node newNode = new Node();
		 newNode.data = userData;   //assigning data to node
		 newNode.next = null;
		 if(head==null) {
			 	head = tail = newNode;
			 	
		 }
		 else
		 {	
			tail.next =newNode;
			tail = tail.next;
			
			
		 }
		tail = newNode;  */
		
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
	
	public void insertAtStart(int data) {
		Node node = new Node(); 		
		node.data = data;   		
		node.next = head;
		head = node;
		}
	
	void printList() 
	{ 
	    Node temp = head; 
	    while (temp != null) 
	    { 
	        System.out.print(temp.data + " "); 
	        temp = temp.next; 
	    }  
	    System.out.println(); 
	}
	
	
	public void insertAt(int index, int data) {
		Node node = new Node(); 
		node.data = data;   
		node.next = null;  
		
		if(index==0) {
			insertAtStart(data);
		}
		else {
		Node n = head;
		for(int i =0; i <index-1;i++)
		{
			n = n.next;
		}
		node.next = n.next;
		n.next = node;
		}
	}

	public void deleteAt(int index) {
		if(index==0) {
			head = head.next;
		}
		else {
			Node n =head;
			Node n1 = null;
			for(int i=0;i<=index-1;i++) {
				n = n.next;
			}
			n1 = n.next;
			n.next = n1.next;
			n1 = null; //free the memory
			
		}
	}
	
	public void addToTheLast(Node node)  
	{ 
	    if (head == null) 
	    { 
	        head = node; 
	    } 
	    else 
	    { 
	        Node temp = head; 
	        while (temp.next != null) 
	            temp = temp.next; 
	        temp.next = node; 
	    } 
	} 
	//reversing linked list
//	public void reverse() { 
//		Node pointer = head; 
//		Node previous = null, 
//				current = null; 
//		while (pointer != null) 
//		{ current = pointer; 
//		pointer = pointer.next; 
//		}
//	}
	
	public static void main(String[] args) {
		LinkedList List = new LinkedList();
		List.insert(1);
		List.insert(2);
		List.insert(3);
		List.insert(4);
		List.insert(5);
		List.show();
		
	} 
		
	
		

	

}
