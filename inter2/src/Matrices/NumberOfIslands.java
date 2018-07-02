package Matrices;

import java.util.Scanner;

public class NumberOfIslands {
	public static int count(int[][] mat, boolean[][] arr) {
		int count = 0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				if (mat[i][j] == 1 && arr[i][j] == false) {
					markAllVisited(mat, arr, i, j);
					count++;
				}
			}
		}
		return count;
	}

	private static void markAllVisited(int[][] mat, boolean[][] arr, int row, int col) {
		arr[row][col] = true;
		if (row + 1 < mat.length && arr[row + 1][col] == false && mat[row + 1][col] != 0) {
			markAllVisited(mat, arr, row + 1, col);
		}
		if (row - 1 >= 0 && arr[row - 1][col] == false && mat[row - 1][col] != 0) {
			markAllVisited(mat, arr, row - 1, col);
		}
		if (col - 1 >= 0 && arr[row][col - 1] == false && mat[row][col - 1] != 0) {
			markAllVisited(mat, arr, row, col - 1);
		}
		if (col + 1 < mat[0].length && arr[row][col + 1] == false && mat[row][col + 1] != 0) {
			markAllVisited(mat, arr, row, col + 1);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] mat = new int[sc.nextInt()][sc.nextInt()];
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		sc.close();
		boolean[][] arr = new boolean[mat.length][mat[0].length];
		System.out.println(count(mat, arr));
	}
}
