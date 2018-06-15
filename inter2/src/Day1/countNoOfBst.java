package Day1;

import java.util.Scanner;

public class countNoOfBst {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		// n represents the total number of keys in the binary search trees..
		int n = scn.nextInt();
		System.out.println(getprob(n));

	}

	public static int getprob(int n) {
		int[] arr = new int[n+1];
		arr[0] = arr[1] = 1;
		for (int i = 2; i <=n; i++) {
			for (int j = 0; j < i; j++) {
				arr[i] += arr[j] * arr[i - j - 1];
			}
		}
		return arr[n];
	}
}
