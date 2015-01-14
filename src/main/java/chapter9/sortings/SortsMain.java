package chapter9.sortings;

public class SortsMain {
	public static void main(String[] args) {
		SortUtil s = new SortUtil();
//		int[] res = s.mergeSort(new int[]{15, 122, 4, 0, 12, 11, 123, 9});
//		int[] res = s.bubbleSort(new int[]{15, 122, 4, 0, 12, 11, 123, 9});
//		int[] res = s.selectionSort(new int[]{15, 122, 4, 0, 12, 11, 123, 9});
		int[] res = new int[]{15, 122, 4, 0, 12, 11, 123, 9};
		s.quickSort(res, 0, res.length - 1);
		s.printArray(res);
	}
}
