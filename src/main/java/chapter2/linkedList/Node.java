package chapter2.linkedList;

public class Node<T> {
	private T value;
	private Node<T> next;

	public T getValue() {
		return value;
	}

	public Node<T> getNext() {
		return next;
	}

	public Node(T value) {
		this.value = value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}
}
