package dataStructures.heap;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Heap {
	private int heapSize;
	private int capacity;
	private int[] heap;

	public Heap() {
		capacity = 100;
		heap = new int[capacity];
		heapSize = 0;
	}

	public Heap(int capacity) {
		this.capacity = capacity;
		heap = new int[capacity];
		heapSize = 0;
	}

	/**
	 * "Push down" - opposite to balanceNewValue
	 */
	private void heapify(int pos) {
		int left = 2 * pos + 1;
		int right = 2 * pos + 2;
		int temp;
		int largest = pos;

		if (heap[left] > heap[largest]) {
			largest = left;
		}

		if (heap[right] > heap[largest]) {
			largest = right;
		}

		if (largest == pos) {
			return;
		}

		temp = heap[pos];
		heap[pos] = heap[largest];
		heap[largest] = temp;

		heapify(largest);
	}

	/**
	 * Get max and remove it
	 *
	 * @return
	 */
	public int getAndRemoveMax() {
		int max = heap[0];
		heap[0] = heap[heapSize - 1];
		heap[heapSize - 1] = 0;
		heapSize--;

		heapify(0);

		return max;
	}

	/**
	 * Get max element - root of heap
	 * @return
	 */
	public int getMax() {
		return heap[0];
	}

	/**
	 * Add new elements to heap
	 *
	 * @param value
	 */
	public void add(int value) throws HeapFullException {
		if (heapSize == capacity) {
			throw new HeapFullException();
		}
		int valuePos = heapSize;
		heap[valuePos] = value;
		heapSize++;

		//balance heap
		balanceNewValue(value, valuePos);
	}

	/**
	 * Balance heap after adding new element to the end
	 *
	 * @param newValue
	 * @param valuePos
	 */
	private void balanceNewValue(int newValue, int valuePos) {
		int parentPos;

		//newValue is root
		if (valuePos == 0) {
			return;
		}

		//right
		if (valuePos % 2 == 0) {
			parentPos = (valuePos - 2) / 2;
			//left
		} else {
			parentPos = (valuePos - 1) / 2;
		}

		if (heap[parentPos] < newValue) {
			//change parent and newValue
			int temp = heap[parentPos];
			heap[parentPos] = newValue;
			heap[valuePos] = temp;
			balanceNewValue(newValue, parentPos);
		}
	}

	/**
	 * Print heap array
	 */
	public void printHeap() {
		for (int i = 0; i < heapSize; i++) {
			System.out.print(heap[i] + " ");
		}
		System.out.println();
	}

	/**
	 * Create heap from array
	 *
	 * @param array
	 * @return
	 */
	public void createHeapFromArraySimple(int[] array) throws HeapFullException {
		for (int el : array) {
			this.add(el);
		}
	}
}
