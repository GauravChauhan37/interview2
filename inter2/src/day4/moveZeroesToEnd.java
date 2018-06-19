package day4;

import java.util.Scanner;

public class moveZeroesToEnd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[sc.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int pos = 0;
		int zero = 0;
		while (pos < arr.length && zero < arr.length) {
			if (arr[zero] == 0) {
				zero++;
			} else {
				int temp = arr[pos];
				arr[pos] = arr[zero];
				arr[zero] = temp;
				zero++;
				pos++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}