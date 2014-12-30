package chapter2;

import chapter2.linkedList.CustomLinkedList;

//	DONE
// 2.1 Write code to remove duplicates from an unsorted linked list.
//	DONE
//	How would you solve this problem if a temporary buffer is not allowed? DONE

// WHAT IS "NTH"?
//	2.2	 Implement an algorithm to find the nth to last element of a singly linked list.


//	DONE
// 2.3	 Implement an algorithm to delete a node in the middle of a single linked list, given
//	only access to that node.
//			EXAMPLE
//	Input: the node ‘c’ from the linked list a->b->c->d->e
//	Result: nothing is returned, but the new linked list looks like a->b->d->e


// DONE
//	2.4	You have two numbers represented by a linked list, where each node contains a sin-
//	gle digit. The digits are stored in reverse order, such that the 1’s digit is at the head of
//	the list. Write a function that adds the two numbers and returns the sum as a linked
//	list.
//			EXAMPLE
//	Input: (3 -> 1 -> 5) + (5 -> 9 -> 2)
//	Output: 8 -> 0 -> 8

public class Main {

	private static CustomLinkedList<Integer> list = new CustomLinkedList<Integer>();

	public static void main(String[] args) {
//		checkList();
//		checkRemoveDuplicates();
//		checkRemoveDuplicatesWithoutBuffer();
		checkCalcSum();
	}

	private static void checkCalcSum() {
		CustomLinkedList<Integer> num1 = new CustomLinkedList<Integer>();
		CustomLinkedList<Integer> num2 = new CustomLinkedList<Integer>();

		num1.add(3);
		num1.add(1);
		num1.add(5);

		num2.add(5);
		num2.add(9);
		num2.add(2);

		CustomLinkedList<Integer> res = list.calcSum(num1, num2);
		System.out.println(num1.toString() + " + " + num2.toString() + " = " + res.toString());
	}


	private static void checkList() {
		System.out.println("Adding...");
		list.add(1);
		list.add(5);
		list.add(6);
		list.add(20);

		System.out.println("After add: ");
		System.out.println(list.toString());

		System.out.println("Removing 5 and 20");
		list.remove(5);
		list.remove(20);
		System.out.println(list.toString());

		System.out.println("Contains 6: " + list.contains(6));
		System.out.println("Contains 5: " + list.contains(5));
		System.out.println("Contains 1: " + list.contains(1));
	}

	private static void checkRemoveDuplicates() {
		list.add(1);
		list.add(1);
		list.add(10);
		list.add(10);
		list.add(10);
		list.add(10);
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(13);
		list.add(20);
		list.add(0);
		list.add(21);
		list.add(20);
		System.out.println("List: " + list.toString());
		list.removeDuplicates();
		System.out.println("After removing duplicates: " + list.toString());
	}

	private static void checkRemoveDuplicatesWithoutBuffer() {
		list.add(1);
		list.add(1);
		list.add(10);
		list.add(10);
		list.add(10);
		list.add(10);
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(13);
		list.add(20);
		list.add(0);
		list.add(21);
		list.add(20);
		System.out.println("List: " + list.toString());
		list.removeDuplicatesWithoutBuffer();
		System.out.println("After removing duplicates: " + list.toString());
	}
}
