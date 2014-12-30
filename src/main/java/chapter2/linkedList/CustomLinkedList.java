package chapter2.linkedList;

import java.util.ArrayList;

public class CustomLinkedList<T> {
	private Node<T> head;

	public Node<T> getHead() {
		return head;
	}

	/**
	 * Add to the end
	 * @param value
	 */
	public void add(T value) {
		Node newElem = new Node(value);
		Node cur = head;
		Node prev = head;

		if (head == null) {
			head = newElem;
			return;
		}

		while (cur != null) {
			prev = cur;
			cur = cur.getNext();
		}

		prev.setNext(newElem);
	}

	/**
	 * Remove specified obj
	 * @param value
	 */
	public void remove (T value) {
		Node cur = head;
		Node prev = head;

		while (cur != null && !cur.getValue().equals(value)) {
			prev = cur;
			cur = cur.getNext();
		}

		if (cur == head) {
			head = cur.getNext();
			return;
		}

		if (cur != null && cur.getValue().equals(value)) {
			prev.setNext(cur.getNext());
		}
	}

	/**
	 * If specified elem contains in list
	 * @param value
	 * @return
	 */
	public boolean contains(T value) {
		Node cur = head;

		while (cur != null) {
			if (cur.getValue().equals(value)) {
				return true;
			}

			cur = cur.getNext();
		}

		return false;
	}

	public String toString() {
		StringBuilder res = new StringBuilder();

		Node cur = head;
		while (cur != null) {
			res.append(cur.getValue() + " ");
			cur = cur.getNext();
		}

		return res.toString();
	}

	//	2.1 Write code to remove duplicates from an unsorted linked list.
	//	How would you solve this problem if a temporary buffer is not allowed?
	public void removeDuplicates() {
		ArrayList<T> buffer = new ArrayList<T>();
		Node<T> cur = head;

		while (cur != null) {
			if (buffer.contains(cur.getValue())) {
				this.remove(cur.getValue());
			} else {
				buffer.add(cur.getValue());
			}
			cur = cur.getNext();
		}
	}

	public void removeDuplicatesWithoutBuffer() {
		Node<T> cur = head;
		while (cur != null) {
			T value = cur.getValue();
			Node next = cur.getNext();

			if (containsFrom(cur.getNext(), value)) {
				remove(value);
			}

			cur = next;
		}
	}

	private boolean containsFrom(Node<T> from, T value) {
		Node cur = from;
		while (cur != null) {
			if (value.equals(cur.getValue())) {
				return true;
			}

			cur = cur.getNext();
		}

		return false;
	}


	//	2.4	You have two numbers represented by a linked list, where each node contains a sin-
	//	gle digit. The digits are stored in reverse order, such that the 1’s digit is at the head of
	//	the list. Write a function that adds the two numbers and returns the sum as a linked
	//	list.
	//			EXAMPLE
	//	Input: (3 -> 1 -> 5) + (5 -> 9 -> 2)
	//	Output: 8 -> 0 -> 8
	public CustomLinkedList<Integer> calcSum(CustomLinkedList<Integer> num1, CustomLinkedList<Integer> num2) {
		CustomLinkedList<Integer> result = new CustomLinkedList<Integer>();

		Node<Integer> curNum1 = num1.getHead();
		Node<Integer> curNum2 = num2.getHead();
		int toNextDigit = 0;

		while (curNum1 != null && curNum2 != null) {
			int value1 = curNum1.getValue();
			int value2 = curNum2.getValue();

			int res = (value1 + value2 + toNextDigit) % 10;
			toNextDigit = (value1 + value2 + toNextDigit) / 10;
			result.add(res);

			curNum1 = curNum1.getNext();
			curNum2 = curNum2.getNext();
		}

		return result;
 	}


}
