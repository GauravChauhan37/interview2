package RecursionAndBacktracking;

import java.util.Scanner;

public class CombinationalSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[sc.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int target = sc.nextInt();
		sc.close();
		Combinations(arr, "", 0, target);
	}

	private static void Combinations(int[] arr, String asf, int lpi, int target) {
		if (target == 0) {
			System.out.println(asf);
			return;
		}
		if (target < 0) {
			return;
		}
		for (int i = lpi; i < arr.length; i++) {
			Combinations(arr, asf + arr[i]+" ", i, target - arr[i]);
		}
	}
}
