package day3;

import java.util.Scanner;

public class MinimizeTheMaximumDifference {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[sc.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		sc.close();
		minTheMaxDiff(arr, k);
	}

	private static void minTheMaxDiff(int[] arr, int k) {
		
	}
}
