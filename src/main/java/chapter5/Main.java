package chapter5;

public class Main {
	public static void main(String[] args) {
		System.out.println("================Four values in one=============");
		fourNumInOne();
		System.out.println("================XOR swap=============");
		xorSwap();
	}

	public static void fourNumInOne() {
		int num1 = 12, num2 = 19, num3 = 230, num4 = 241, combined = 0;
		int mask = 0b11111111;
		combined = (num1) | (num2 << 8) | (num3 << 16) | (num4 << 24);


		System.out.println("combined = " + combined);
		System.out.println("num1 = " + (combined & mask));
		System.out.println("num2 = " + ((combined >>> 8) & mask));
		System.out.println("num3 = " + ((combined >>> 16) & mask));
		System.out.println("num4 = " + ((combined >>> 24) & mask));
	}


	public static void xorSwap() {
		int x = 4;
		int y = 3;

		System.out.println("x before = " + x + ", y before = " + y);
		x = x^y;
		y = y^x;
		x = x^y;
		System.out.println("x after = " + x + ", y after = " + y);
	}


}
