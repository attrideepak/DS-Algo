package javaproblems.linkedlist;

public class LinkedListQueue{
	 Node front;   //the point from where we dequeue/remove or head node
	 Node rear;     //tail reference, the point where we enqueue/add or tail
	 int size;
	 
	 public Boolean isEmpty() {
		 return rear == null;
		
	}
	 
	 public int size() {
	 return size;
	 }
	 
	 public int getfront() {
		 if(isEmpty()) {
			 System.out.println("empty queue");
			 return -1;
		 }
		 else {
			  return front.data;
		 }
	 }
	 
	 public int getRear() {
		 if(isEmpty()) {
			 System.out.println("empty queue");
			 return -1;
		 }
		 else {
			  return rear.data;
		 }
	 }
	 
	 
	 public void Enqueue(int x) {
		 //Create a new Node
		 Node newNode = new Node();
		 newNode.data = x;   //assigning data to node
		 newNode.next = null;
		 if(isEmpty()) {
			 	rear = front = newNode;
			 	size++;
		 }
		 else
		 {	
			rear.next =newNode;
			rear = rear.next;
			size++;
			
		 }
		 rear = newNode;
		 }
	 
	// We only provide users with access to interact
     // with the head node.
     // If the list is empty return null and do nothing
	 public int dequeue() {
		 	if(isEmpty()) {
			 System.out.println("Queue is EMPTY");
			 return -1;
		 }
		 else {
			 size--;
			 int data = front.data;
			 front = front.next;
			if(front==null) {
				rear=null;
			}
			 return data;
			  }
		  }
	 
	 public void show() {
			Node node = front;
			while(node.next!=null)
			{
				System.out.println(node.data);  //loop will stop as soon as null value comes so it will not print the data with null node
				node = node.next;
			}
			System.out.println(node.data);  //therefore we print the data for that node outside loop
		}
	 
	 public static void main(String[] args) {
		LinkedListQueue Queue = new LinkedListQueue();
		Queue.Enqueue(1);
		Queue.Enqueue(2);
		Queue.Enqueue(3);
		Queue.Enqueue(4);
		Queue.Enqueue(5);
		Queue.dequeue();
    	Queue.dequeue();
    	
    	
    	Queue.show();
		System.out.println("size of queue " +Queue.size());
		System.out.println("front element of the queue " +Queue.getfront());
		System.out.println("rear element of the queue " +Queue.getRear());
		System.out.println(Queue.isEmpty());
		
		
		
	}

}
