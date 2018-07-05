package Matrices;

import java.util.Scanner;

public class FindCommonElement {
	public static void findCommon(int[][] arr) {
		int[] index = new int[arr.length];
		for (int i = 0; i < index.length; i++) {
			index[i] = arr[0].length - 1;
		}
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			min = Math.min(min, arr[i][arr[0].length - 1]);
		}
		int count = 0;

		A: while (true) {
			for (int i = 0; i < arr.length; i++) {
				if (arr[i][index[i]] > min) {
					if (index[i] == 0) {
						break A;
					}
					index[i]--;
				} else if (arr[i][index[i]] == min) {
					count++;
				}
			}
			if (count == arr.length) {
				break A;
			}
			for (int j = 0; j < index.length; j++) {
				min = Math.min(min, arr[j][index[j]]);
			}
			count = 0;
		}
		System.out.println(arr[0][index[0]]);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[sc.nextInt()][sc.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		findCommon(arr);
	}
}
