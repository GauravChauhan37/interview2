package Day1;

import java.util.Scanner;

public class findAllPairsDiffequalToDiff {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int tar = scn.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}

		solve(tar, arr);
	}

	private static void solve(int tar, int[] arr) {
		int start = 0;
		int end = 0;
		int sum = arr[0];

		while (start < arr.length && end < arr.length) {
			if (sum < tar) {
				end++;
				sum += end;
			} else if (sum > tar) {
				// case 2
				sum -= start;
				start++;
			} else {
				for (int i = start; i <= end; i++) {
					System.out.print(arr[i] + " ");
				}
				return;
				// case 3
				// print the subarray and return
			}
		}

		System.out.println("Not found");
	}

}