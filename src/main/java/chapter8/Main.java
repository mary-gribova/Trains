package chapter8;

public class Main {
	public static void main(String[] args) {
		System.out.println("6th: " + getNths(6, 2, 0, 1));
	}


	private static int getNths(int n, int count, int first, int second) {
		int third = first + second;
		count++;
		if (count == n) {
			return third;
		} else {
			return getNths(n, count, second, third);
		}
	}
}
