package tariqul.java.exercise;

import java.util.LinkedList;


/*
 * Example of Stack and Queue implementation in java
 * Java LinkedList class implements both stack and queue related methods
 */



public class StackAndQueue {

	LinkedList<Integer> myStack;
	LinkedList<Integer> myQueue;
	
	LinkedList<Integer> myDQueue;

	
	LinkedList<Integer> myPriorityQueuu; // TODO
	LinkedList<Integer> myCircularQueue; // TODO
	
	public StackAndQueue(){
		myStack = new LinkedList<Integer>();
		myQueue = new LinkedList<Integer>();
		
		myDQueue = new LinkedList<Integer>();
	}
	
	public static void main(String[] args) {

		StackAndQueue obj = new StackAndQueue();
		// ----------------- STACK :------------------
		// push into stack
		obj.myStack.push(11);
		obj.myStack.push(22);
		obj.myStack.push(33);
		
		// pop from stack
		System.out.println(obj.myStack.pop());  // prints: 33 
		System.out.println(obj.myStack.pop());  // prints: 22 		

		// ----------------- QUEUE :------------------
		
		// insert into queue
		// use offer() or add() method
		obj.myQueue.offer(55); // returns false when element can not be added
		obj.myQueue.add(66);  // throws exception when element can not be added
		obj.myQueue.add(77);
		
		
		// pull from queue 
		System.out.println(obj.myQueue.poll());  // prints: 55 
		System.out.println(obj.myQueue.poll());  // prints: 66 		

		// ----------------- DOUBLE ENDED QUEUE :------------------
		
		// insert at front of queue
		obj.myDQueue.offerFirst(777);
		
		// insert at back of queue
		obj.myDQueue.offerLast(888);
		
		// poll from front of queue
		System.out.println(obj.myDQueue.pollFirst());
		
		// poll from back of queue
		System.out.println(obj.myDQueue.pollLast());
		
	}
}
