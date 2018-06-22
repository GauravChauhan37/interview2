package day7;

import java.util.Scanner;

public class isBleakOrNot {
	public static int countSetBits(int n) {
		int count = 0;
		while (n != 0) {
			if ((n & 1) == 1) {
				count++;
			}
			n >>= 1;
		}
		return count;
	}

	static boolean isBleak(int n) {
		int Set = (int) (Math.log(n) / Math.log(2));
		
		for (int i = n - 1; i >= n - Set; i--) {
			int bits = countSetBits(i);
			if (i + bits == n)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	}
}
