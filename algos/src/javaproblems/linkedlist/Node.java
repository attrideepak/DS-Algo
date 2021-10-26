package javaproblems.linkedlist;

public class Node {
	int data;
	Node next;
	
	
public Node(int d) {
	data = d;
	next = null;
}

public Node() {

}

	@Override
	public String toString() {
		return "Node{" +
				"data=" + data +
				", next=" + next +
				'}';
	}

//public Node(Node n,int d){
//	data = d;
//	next = n;
//}
}
