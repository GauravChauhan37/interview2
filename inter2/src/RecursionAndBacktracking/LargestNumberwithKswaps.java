package RecursionAndBacktracking;

import java.util.Scanner;

public class LargestNumberwithKswaps {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int k = sc.nextInt();
		sc.close();
		int max = kSwaps(num, k, Integer.MIN_VALUE, 0);
		System.out.println(max);
	}

	private static int kSwaps(int num, int k, int max, int ls) {
		if (k == 0) {
			return Integer.MIN_VALUE;
		}
		num = swap(num, ls);
		max = Math.max(num, kSwaps(num, k - 1, max, ls + 1));
		return max;
	}

	private static int swap(int num, int ls) {
		String s = "" + num;
		for (int i = ls + 1; i < s.length(); i++) {
			if (s.charAt(ls) < s.charAt(i)) {
				char temp = s.charAt(ls);
				char temp2 = s.charAt(i);
				String first = s.substring(0, ls);
				String scnd = s.substring(ls + 1, i);
				String thrd = s.substring(i + 1);
				s = first + temp2 + scnd + temp + thrd;
			}
		}
		num = Integer.parseInt(s);
		return num;
	}
}
