package day7;

import java.util.Scanner;

public class countAllSetBitsFrom1toN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		countAllSetBits(n);
	}

	public static void countAllSetBits(int n) {
		int bits = countBits(n);
		int countOfSetBits = 0;
		int fact = 1;
		n = n + 1; // pairs start from 0
		for (int i = 1; i <= bits; i++) {
			fact *= 2;
			// pair additions of 2->1, 4->2, 8->4
			int pairs = n / fact;
			countOfSetBits += pairs * fact / 2;
			// extras that don't form pair
			int extras = n % fact;
			if (extras > (fact / 2)) {
				countOfSetBits += extras - fact / 2;
			}
		}

		System.out.println(countOfSetBits);
	}

	public static int countBits(int n) {
		int count = 0;
		while (n > 0) {
			count++;
			n >>= 1;
		}
		return count;
	}

}