package chapter3.stacks;

public class SubStack<T> {
	private int capacity;
	private int size = 0;
	private StackElem<T> top;

	public boolean isEmpty() {
		StackElem<T> popped = this.pop();

		if (popped == null) {
			return true;
		}

		this.push(popped.getValue());
		return false;
	}

	public SubStack(int capacity) {
		this.capacity = capacity;
	}

	public boolean push(T value) {
		StackElem<T> elem = new StackElem<T>(value);

		if (top == null) {
			top = elem;
			size++;
			return true;
		}

		if (size >= capacity) {
			return false;
		}

		elem.setNext(top);
		top = elem;
		size++;
		return true;
	}

	public StackElem<T> pop() {
		if (top == null) {
			return null;
		}

		StackElem<T> res = top;
		top = top.getNext();
		size--;
		return res;
	}

	public String toString() {
		StringBuilder res = new StringBuilder();

		StackElem<T> cur = top;
		while (cur != null) {
			res.append(cur.getValue()).append(" ");
			cur = cur.getNext();
		}

		return res.toString();
	}
}
