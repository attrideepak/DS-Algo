package com.mylearnings.java.collections;

public class ArrayQueue {
 int queue[]= new int[5];
 int size;
 int front;   //remove items from front
 int rear;    //add items to rear. initially both front and rear are same
 
 public void enQueue(int data) {
	 if(!isFull())
	 {queue[rear]=data;   //assign data at rear and increase rear by 1
	 rear = (rear+1)%5;
	 size++;}
	 else
	 {System.out.println("queue is full");}
	
}
 public void show() {
	 for(int i=0;i<size;i++) {
		 System.out.println(queue[(front+i)%5] + "");
	 }
 }
 
 public int deQueue(){
	 int data = queue[front]; //fetch the value at front
	 
	 if(!isEmpty()) {
	 front =(front+1)%5;		//to remove the value move the front to next position
	 size--;       //size will be decreased by one
	 }
	 else
		 
	 {System.out.println("queue is empty");}
	 
	 return data;
 }
 
 public int getSize() {
	 return size;
 }
 
 public boolean isEmpty() {
	 return getSize() == 0;
 }
 
 public boolean isFull() {
	 return getSize() == 5;
 }
}
