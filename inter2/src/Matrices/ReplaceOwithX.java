package Matrices;

import java.util.Scanner;

public class ReplaceOwithX {
	public static void replaceOwithX(char[][] mat, boolean[][] arr, int row, int col) {
		if (row + 1 < mat.length && mat[row + 1][col] == 'O' && arr[row + 1][col] == false) {
			arr[row + 1][col] = true;
			replaceOwithX(mat, arr, row + 1, col);
		}
		if (row - 1 >= 0 && mat[row - 1][col] == 'O' && arr[row - 1][col] == false) {
			arr[row - 1][col] = true;
			replaceOwithX(mat, arr, row - 1, col);
		}
		if (col + 1 < mat[0].length && mat[row][col + 1] == 'O' && arr[row][col + 1] == false) {
			arr[row][col + 1] = true;
			replaceOwithX(mat, arr, row, col + 1);
		}
		if (col - 1 >= 0 && mat[row][col - 1] == 'O' && arr[row][col - 1] == false) {
			arr[row][col - 1] = true;
			replaceOwithX(mat, arr, row, col - 1);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[][] mat = new char[sc.nextInt()][sc.nextInt()];
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				mat[i][j] = sc.next().charAt(0);
			}
		}
		sc.close();
		boolean[][] arr = new boolean[mat.length][mat[0].length];
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				if (i == 0 || j == 0 || i == mat.length - 1 || j == mat[0].length - 1)
					replaceOwithX(mat, arr, i, j);
			}
		}
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}

}
