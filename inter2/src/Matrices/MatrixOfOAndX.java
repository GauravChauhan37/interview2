package Matrices;

import java.util.Scanner;

public class MatrixOfOAndX {
	public static void create(int row, int col) {
		char[][] mat = new char[row][col];
		int counter = row * col;
		int srow = 0, scol = 0, frow = mat.length - 1, fcol = mat[0].length - 1;
		char ch = 'X';
		while (counter > 0) {
			for (int i = scol; i <= fcol && counter > 0; i++) {
				mat[srow][i] = ch;
				counter--;
			}
			srow++;
			for (int i = srow; i <= frow && counter > 0; i++) {
				mat[i][fcol] = ch;
				counter--;
			}
			fcol--;
			for (int i = fcol; i >= scol && counter > 0; i--) {
				mat[frow][i] = ch;
				counter--;
			}
			frow--;
			for (int i = frow; i >= srow && counter > 0; i--) {
				mat[i][scol] = ch;
				counter--;
			}
			scol++;
			ch = ch == 'X' ? 'O' : 'X';
		}
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		create(row, col);
	}
}
