package chapter3.stacks;

public class MyQueue<T> {
	private SubStack<T> forPush;
	private SubStack<T> forPop;

	public MyQueue() {
		forPush = new SubStack<T>(Integer.MAX_VALUE);
		forPop = new SubStack<T>(Integer.MAX_VALUE);
	}

	public void add(T value) {
		if (!forPop.isEmpty()) {
			toppleAllInAnother(forPop, forPush);
		}
		forPush.push(value);
	}

	public T get() {
		if (!forPush.isEmpty()) {
			toppleAllInAnother(forPush, forPop);
		}
		StackElem<T> elem = forPop.pop();
		return elem == null ? null : elem.getValue();
	}

	private void toppleAllInAnother(SubStack<T> from, SubStack<T> to) {
		StackElem<T> cur = from.pop();
		while (cur != null) {
			to.push(cur.getValue());
			cur = from.pop();
		}
	}
}
