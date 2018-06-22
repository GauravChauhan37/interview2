package day6;

import java.util.Scanner;

public class josephusProblem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		jopeshtribbani(n);
	}

	private static void jopeshtribbani(int n) {
		if ((n & 1) == 0) {
			System.out.println("1");
		} else {
			int x = 2;
			while (x < n) {
				x *= 2;
			}
			x = x / 2;
			int diff = n - x;
			int ans = 2 * diff + 1;
			System.out.println(ans);
		}
	}
}
