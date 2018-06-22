package day7;

import java.util.Scanner;

public class CopySetBitsInRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int low = sc.nextInt();
		int high = sc.nextInt();
		copy(x, y, high, low);
	}

	private static void copy(int x, int y, int high, int low) {
		int bitmask = 1;
		bitmask <<= high - low + 1;
		bitmask -= 1;
		bitmask <<= low - 1;
		bitmask &= y;
		bitmask |=x;
		System.out.println(bitmask);
	}
}
