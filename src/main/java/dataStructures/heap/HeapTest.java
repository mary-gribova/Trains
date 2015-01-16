package dataStructures.heap;

public class HeapTest {
	public static void main(String[] args) throws HeapFullException {
		Heap heap = new Heap(100);
		heap.add(20);
		heap.add(123);
		heap.add(21);
		heap.add(2);
		heap.add(0);
		heap.add(78);
		heap.add(156);
		heap.add(11);

		heap.printHeap();

		System.out.println("Get and remove max: " + heap.getAndRemoveMax());
		heap.printHeap();

		System.out.println("Get and remove max: " + heap.getAndRemoveMax());
		heap.printHeap();

		System.out.println("Get and remove max: " + heap.getAndRemoveMax());
		heap.printHeap();

		System.out.println("Get and remove max: " + heap.getAndRemoveMax());
		heap.printHeap();

		Heap heap1 = new Heap();
		heap1.createHeapFromArraySimple(new int[]{3, 6, 8, 11, 125, 7, 13, 25});
		heap1.printHeap();

		Heap heap2 = new Heap();
		heap2.createHeapFromArrayNormal(new int[]{3, 6, 8, 11, 125, 7, 13, 25});
		heap2.printHeap();
	}
}
