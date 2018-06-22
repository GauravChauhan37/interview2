package SearchingAndSorting;

import java.util.Scanner;

public class FindDuplicates {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[sc.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		findDups(arr);
	}

	private static void findDups(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int idx = Math.abs(arr[i]);
			if (arr[idx] > 0) {
				arr[idx] = -arr[idx];
			} else if (arr[idx] == 0) {
				continue;
			} else {
				System.out.print(idx + " ");
				arr[idx] = 0;
			}
		}
	}
}
