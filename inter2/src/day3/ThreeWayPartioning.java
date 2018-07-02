package day3;

import java.util.Scanner;

public class ThreeWayPartioning {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[sc.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int low = sc.nextInt();
		int high = sc.nextInt();
		int lo_idx = 0;
		int hi_idx = arr.length - 1;
		sc.close();
		for (int mid = 0; mid <= hi_idx;) {
			if (arr[mid] < low) {
				int temp = arr[mid];
				arr[mid] = arr[lo_idx];
				arr[lo_idx] = temp;
				lo_idx++;
				mid++;
			} else if (arr[mid] > high) {
				int temp = arr[mid];
				arr[mid] = arr[hi_idx];
				arr[hi_idx] = temp;
				hi_idx--;
			} else {
				mid++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
