package javaproblems.linkedlist;
/*
Insert Node at Start
Insert Node at end
Delete a node
Reverse linked list
Add a loop
Is cyclic
Middle element
reverse recursively
kth node from end
 */

public class LinkedList {
	Node head;  //initial node is head

	
	public void add(int userData) {  //whenever inserting a new data a new node is created
		
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
	}

	public void add(Node node) {
		if(head == null) {
			head = node;
		}
		else {
			Node n = head;
			while(n.next!=null) {
				n = n.next;
			}
			n.next = node;
		}
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
	public void reverse(){
		Node current = head;
		Node previous = null;
		Node temp;
		while(current!=null){
			temp = current.next;  // store current.next in temp node since this link will break
			current.next = previous;  //current.next points to previous node
			previous = current; //move previous to current
			current = temp;  //move current to next node, temp refers to next node of current
		}
		head = previous;
	}

	// reverse recursive
	public void reverse(Node node){
		if(node.next==null){
				head = node;
				return;
		}
		reverse(node.next);
		Node temp = node.next;
		temp.next = node;
		node.next = null;
	}

	/* * If singly LinkedList contains Cycle then following would be true
	1) slow and fast will point to same node i.e. they meet
	2) On the other hand if fast will point to null and next node of fast will point to null then LinkedList does not contains cycle. */

	//Read more: https://javarevisited.blogspot.com/2013/05/find-if-linked-list-contains-loops-cycle-cyclic-circular-check.html#ixzz7534uGc8V
	public boolean isCyclic(){
		Node fast = head;
		Node slow = head;
		while (fast!=null && fast.next != null){
			fast = fast.next.next;
			slow = slow.next;
			if(fast == slow ){
				return true;
			}
		}
		return false;
	}

	// Function to make loop at k-th elements of linked list
	public void makeloop(int k)
	{
		// traverse the linked list until loop
		// point not found
		Node temp = head;
		int count = 1;
		while (count < k)
		{
			temp = temp.next;
			count++;
		}
		// backup the joint point
		Node joint = temp;

		// traverse remaining nodes
		while (temp.next != null) {
			temp = temp.next;
		}

		// joint the last node to k-th element
		temp.next = joint;
	}

	public void midElement(){
		Node slow = head;
		Node fast = head;
		int length = 0;

		while(fast!=null && fast.next!=null){
			fast = fast.next.next;
			slow = slow.next;
		}
		System.out.println(slow.data);
	}

	public void kthNodeFromEnd(int k){
		Node fast = head;
		Node slow = head;

		for(int i = 1; i<=k; i++){
			fast = fast.next;
		}

		while(fast!=null){
			fast = fast.next;
			slow = slow.next;
		}
		System.out.println(slow.data);
	}

	public
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(5);
		list.add(10);
		list.add(50);
		list.add(60);

		list.printList();
		//list.reverse(list.head);
		list.printList();
		list.kthNodeFromEnd(2);
		//list.makeloop(3);

		//System.out.println(list.isCyclic());
		
	} 
		
	
		

	

}
