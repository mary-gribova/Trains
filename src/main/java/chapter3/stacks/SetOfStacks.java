package chapter3.stacks;

import chapter1.StringTool;

import java.util.ArrayList;

public class SetOfStacks<T> {
	ArrayList<SubStack<T>> subStacks;
	private int capacity;

	public SetOfStacks(int capacity) {
		subStacks = new ArrayList<SubStack<T>>();
		this.capacity = capacity;
	}

	public void push(T value) {
		if (getLastSubstack() == null) {
			subStacks.add(new SubStack<T>(capacity));
			subStacks.get(subStacks.size() - 1).push(value);
			return;
		}

		if (!getLastSubstack().push(value)) {
			subStacks.add(new SubStack<T>(capacity));
			subStacks.get(subStacks.size() - 1).push(value);
			return;
		}
	}

	public StackElem<T> pop() {
		StackElem<T> result = null;
		SubStack<T> lastSubStack = getLastSubstack();

		if (lastSubStack == null) {
			return null;
		}

		result = lastSubStack.pop();

		if (result == null) {
			subStacks.remove(subStacks.size() - 1);
			if (subStacks.isEmpty()) {
				result = null;
			} else {
				lastSubStack = getLastSubstack();
				result = lastSubStack.pop();
			}
		}

		return result;
	}

	private SubStack<T> getLastSubstack() {
		if (subStacks.size() == 0) {
			return null;
		}

		return subStacks.get(subStacks.size() - 1);
	}

	public String toString() {
		StringBuilder res = new StringBuilder();

		for (int i = 0; i < subStacks.size(); i++) {
			res.append("Substack num ").append(i).append(": ").append(subStacks.get(i)).append("\n");
		}

		return res.toString();
	}
}
