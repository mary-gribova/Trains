package chapter3;
//Described:
// Divide array to three parts
//
//3.1	 Describe how you could use a single array to implement three stacks.

// NOT DESCRIBED
// To calculate min while push-pop
// For example, we pushed 0 - it's the first ==> it's min.
// Further, we pushed -2 - it's less than actual min ==> -2 is new min.
// But now we poped -2. The new min must be 0, but how we can decide it?

//ASK KIRUSHA ((
//3.2	 How would you design a stack which, in addition to push and pop, also has a function
//min which returns the minimum element? Push, pop and min should all operate in
//O(1) time.

// DONE
//3.3	 Imagine a (literal) stack of plates. If the stack gets too high, it might topple. There-
//fore, in real life, we would likely start a new stack when the previous stack exceeds
//some threshold. Implement a data structure SetOfStacks that mimics this. SetOf-
//Stacks should be composed of several stacks, and should create a new stack once
//the previous one exceeds capacity. SetOfStacks.push() and SetOfStacks.pop() should
//behave identically to a single stack (that is, pop() should return the same values as it
//would if there were just a single stack).
//FOLLOW UP
//Implement a function popAt(int index) which performs a pop operation on a specific
//sub-stack.

//
//
//3.4
//In the classic problem of the Towers of Hanoi, you have 3 rods and N disks of different
//sizes which can slide onto any tower. The puzzle starts with disks sorted in ascending
//order of size from top to bottom (e.g., each disk sits on top of an even larger one). You
//have the following constraints:
//(A) Only one disk can be moved at a time.
//(B) A disk is slid off the top of one rod onto the next rod.
//(C) A disk can only be placed on top of a larger disk.
//Write a program to move the disks from the first rod to the last using Stacks.

// DONE
//3.5	 Implement a MyQueue class which implements a queue using two stacks.

//
//
//3.6	 Write a program to sort a stack in ascending order. You should not make any assump-
//tions about how the stack is implemented. The following are the only functions that
//should be used to write this program: push | pop | peek | isEmpty.

import chapter3.stacks.MyQueue;
import chapter3.stacks.SetOfStacks;

public class Main {
	public static void main(String[] args) {
//		checkSetOfStacks();
		checkMyQueue();
	}

	public static void checkMyQueue() {
		MyQueue<Integer> queue = new MyQueue<Integer>();
		queue.add(20);
		queue.add(1);
		queue.add(2);
		queue.add(19);
		queue.add(4);
		System.out.println("Added: 20 1 2 19 4");
		System.out.println("Get " + queue.get());
		System.out.println("Get " + queue.get());
		System.out.println("Get " + queue.get());
		System.out.println("Add 111");
		queue.add(111);
		System.out.println("Add 87");
		queue.add(87);
		System.out.println("Get " + queue.get());
		System.out.println("Get " + queue.get());
		System.out.println("Get " + queue.get());
		System.out.println("Get " + queue.get());
		System.out.println("Get " + queue.get());
	}

	public static void checkSetOfStacks() {
		SetOfStacks<Integer> setOfStacks = new SetOfStacks<Integer>(3);
		setOfStacks.push(1);
		setOfStacks.push(32);
		setOfStacks.push(4);

		setOfStacks.push(5);
		setOfStacks.push(7);
		setOfStacks.push(0);

		setOfStacks.push(12);
		setOfStacks.push(21);
		setOfStacks.push(3);

		setOfStacks.push(1);
		setOfStacks.push(90);
		System.out.println(setOfStacks.toString());

		System.out.println("After pop some elements...");
		setOfStacks.pop();
		setOfStacks.pop();
		setOfStacks.pop();
		setOfStacks.pop();
		System.out.println(setOfStacks.toString());
	}
}
