package dataStructures.heap;

public class HeapFullException extends Exception {
	private static final String message = "Heap is full!";

	public HeapFullException() {
		super(message);
	}
}
