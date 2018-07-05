package Matrices;

import java.util.Scanner;

public class FindLargestSubSquare {
	public static void largestSub(char[][] arr) {
		int[][] hor = new int[arr.length][arr[0].length];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (arr[i][j] == 'X') {
					if (j == 0) {
						hor[i][j] = 1;
					} else {
						hor[i][j] = 1 + hor[i][j - 1];
					}
				} else {
					hor[i][j] = 0;
				}
			}
		}
		int[][] ver = new int[arr.length][arr[0].length];
		for (int j = 0; j < arr[0].length; j++) {
			for (int i = 0; i < arr.length; i++) {
				if (arr[i][j] == 'X') {
					if (i == 0) {
						ver[i][j] = 1;
					} else {
						ver[i][j] = 1 + ver[i - 1][j];
					}
				} else {
					ver[i][j] = 0;
				}
			}
		}
		int ovmax = Integer.MIN_VALUE;
		for (int i = arr.length - 1; i >= 0; i--) {
			for (int j = arr[0].length - 1; j >= 0; j--) {
				int temp = Math.min(hor[i][j], ver[i][j]);
				if (temp > 1) {
					for (int k = temp; k >= 1; k--) {
						if (hor[i][temp - 1] >= 1 && ver[temp - 1][j] >= 1) {
							if (temp > ovmax) {
								ovmax = temp;
							}
						}
					}
				}
			}
		}
		System.out.println(ovmax);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[][] arr = new char[n][n];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = sc.next().charAt(0);
			}
		}
		largestSub(arr);
	}
}
