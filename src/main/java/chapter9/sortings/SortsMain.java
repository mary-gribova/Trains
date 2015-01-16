package chapter9.sortings;

import dataStructures.heap.HeapFullException;

public class SortsMain {
	public static void main(String[] args) throws HeapFullException {
		SortUtil s = new SortUtil();
//		int[] res = s.mergeSort(new int[]{15, 122, 4, 0, 12, 11, 123, 9});
//		int[] res = s.bubbleSort(new int[]{15, 122, 4, 0, 12, 11, 123, 9});
//		int[] res = s.selectionSort(new int[]{15, 122, 4, 0, 12, 11, 123, 9});
//		int[] res = new int[]{15, 122, 4, 0, 12, 11, 123, 9};
		int[] res = new int[]{1, 2, 3, 17, 23, 123, 155, 189};
//		s.quickSort(res, 0, res.length - 1);
//		s.printArray(res);
//		System.out.println(s.binarySearch(0, res, 0, res.length - 1));
//		System.out.println(s.binarySearch(123, res, 0, res.length - 1));
//		System.out.println(s.binarySearch(177, res, 0, res.length - 1));
//		System.out.println(s.binarySearch(23, res, 0, res.length - 1));
		res = s.heapSort(res);
		s.printArray(res);
	}
}
