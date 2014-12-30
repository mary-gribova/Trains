package chapter3.stacks;

public class StackElem<T> {
	private T value;
	private StackElem<T> next;

	public StackElem(T value) {
		this.value = value;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public void setNext(StackElem<T> next) {
		this.next = next;
	}

	public StackElem<T> getNext() {
		return next;
	}
}
