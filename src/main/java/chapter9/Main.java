package chapter9;
//DONE
//9.1	 You are given two sorted arrays, A and B, and A has a large enough buffer at the end
//to hold B. Write a method to merge B into A in sorted order.


//9.2	 Write a method to sort an array of strings so that all the anagrams are next to each
//other.


//9.3	 Given a sorted array of n integers that has been rotated an unknown number of
//times, give an O(log n) algorithm that finds an element in the array. You may assume
//that the array was originally sorted in increasing order.
//EXAMPLE:
//Input: find 5 in array (15 16 19 20 25 1 3 4 5 7 10 14)
//Output: 8 (the index of 5 in the array)


//9.4	 If you have a 2 GB file with one string per line, which sorting algorithm would you use
//to sort the file and why?


//9.5	 Given a sorted array of strings which is interspersed with empty strings, write a meth-
//od to find the location of a given string.
//Example: find “ball” in [“at”, “”, “”, “”, “ball”, “”, “”, “car”, “”, “”, “dad”, “”, “”] will return 4
//Example: find “ballcar” in [“at”, “”, “”, “”, “”, “ball”, “car”, “”, “”, “dad”, “”, “”] will return -1


//9.6	 Given a matrix in which each row and each column is sorted, write a method to find
//an element in it.


//9.7	 A circus is designing a tower routine consisting of people standing atop one anoth-
//er’s shoulders. For practical and aesthetic reasons, each person must be both shorter
//and lighter than the person below him or her. Given the heights and weights of each
//person in the circus, write a method to compute the largest possible number of peo-
//ple in such a tower.
//EXAMPLE:
//Input (ht, wt): (65, 100) (70, 150) (56, 90) (75, 190) (60, 95) (68, 110)
//Output: The longest tower is length 6 and includes from top to bottom: (56, 90)
//(60,95) (65,100) (68,110) (70,150) (75,190)
public class Main {
	public static void main(String[] args) {
		Main m = new Main();
		int[] a = new int[]{4, 9, 10};
		int[] b = new int[]{1, 2, 3, 6, 7, 8};
		int[] res = m.mergeBtoA(a, b);
		m.printArr(res);
	}


	public void printArr(int[] a) {
		for (int el : a) {
			System.out.print(el + " ");
		}

		System.out.println();
	}

	public int[] mergeBtoA(int[] a, int[] b) {
		int lenA = a.length;
		int lenB = b.length;
		int[] aWithBuff = new int[lenA + lenB];
		for (int i = 0; i < lenA; i++) {
			aWithBuff[i] = a[i];
		}

		int i = lenA - 1, j = lenB - 1, k = lenA + lenB - 1;

		while (i >= 0 && j >= 0) {
			if (aWithBuff[i] > b[j]) {
				aWithBuff[k] = aWithBuff[i];
				i--;
				k--;
			} else {
				aWithBuff[k] = b[j];
				j--;
				k--;
			}
		}

		//copy b to end of a
		if (i < 0) {
			for (; j >= 0; j--) {
				aWithBuff[k--] = b[j];
			}
		//copy a to end of a
		} else if (j < 0) {
			for (; i >= 0; i--) {
				aWithBuff[k--] = aWithBuff[i];
			}
		}

		return aWithBuff;
	}
}
