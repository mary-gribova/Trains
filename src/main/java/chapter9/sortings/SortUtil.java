package chapter9.sortings;

public class SortUtil {
	//Heap sort 
	public int[] heapSort(int[] array) {
		return array;
	}

	//bubble sort. Complexity - O(n^2)
	public int[] bubbleSort(int[] array) {
		int n = array.length;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (array[i] < array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}

		return array;
	}

	//selection sort. Complexity - O(n^2)
	public int[] selectionSort(int[] array) {
		int len = array.length;

		for (int i = 0; i < len; i++) {
			int index = findMin(i, array);
			if (index != i) {
				int temp = array[i];
				array[i] = array[index];
				array[index] = temp;
			}
		}

		return array;
	}

	private int findMin(int start, int[] array) {
		int min = array[start];
		int index = start;

		for (int i = start; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
				index = i;
			}
		}

		return index;
	}

	//Quick sort. Complexity - O(n*log(n)) and O(n^2) in worst case
	public void quickSort(int[] array, int start, int end) {
		if (start >= end)
			return;

		int l = start, r = end;
		int pivot =  l + (r - l) / 2;

		while (l < r) {
			while(l < pivot && array[l] <= array[pivot]) {
				l++;
			}

			while (r > pivot && array[r] >= array[pivot]) {
				r--;
			}

			if (l < r) {
				int temp = array[l];
				array[l] = array[r];
				array[r] = temp;
				if (l == pivot) {
					pivot = r;
				} else if (r == pivot) {
					pivot = l;
				}
			}
		}

		quickSort(array, start, pivot);
		quickSort(array, pivot + 1, end);
	}

	//merge sort. Complexity - O(n*log(n))
	public int[] mergeSort(int[] array) {
		int len = array.length;
		int l = len / 2;

		int[] left = new int[l];
		int[] right = new int[len - l];

		for (int i = 0; i < l; i++) {
			left[i] = array[i];
		}

		for (int i = 0, j = l; j < len && i < len - l; i++, j++) {
			right[i] = array[j];
		}

		if (len != 1) {
			left = mergeSort(left);
			right = mergeSort(right);
			return merge(left, right);
		}

		return array;
	}


	private int[] merge(int[] mas1, int[] mas2) {
		int n1 = mas1.length;
		int n2 = mas2.length;
		int n = n1 + n2;
		int i = 0, j = 0, k = 0;
		int[] res = new int[n];

		while (i < n1 || j < n2) {
			//mas1 ended --> copy all from mas2
			if (i == n1) {
				for (; k < n; k++) {
					res[k] = mas2[j];
					j++;
				}
				return res;
				//mas2 ended --> copy all from mas1
			} else if (j == n2) {
				for (; k < n; k++) {
					res[k] = mas1[i];
					i++;
				}

				return res;
			}

			if (mas1[i] < mas2[j]) {
				res[k] = mas1[i];
				i++;
			} else {
				res[k] = mas2[j];
				j++;
			}

			k++;
		}

		return res;
	}

	public boolean binarySearch(int val, int[] array, int first, int last) {
		if (first > last || val > array[last] || val < array[first])
			return false;

		int mid = first + (last - first) / 2;
		if (val > array[mid]) {
			return binarySearch(val, array, mid + 1, last);
		} else if (val < array[mid]) {
			return binarySearch(val, array, first, mid - 1);
		} else if (val == array[mid]) {
			return true;
		}

		return false;
	}

	public void printArray(int[] array) {
		for (int el : array) {
			System.out.print(el + " ");
		}
		System.out.println();
	}
 }
