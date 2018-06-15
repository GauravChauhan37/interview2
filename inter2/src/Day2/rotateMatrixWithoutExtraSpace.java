package Day2;

import java.util.Scanner;

public class rotateMatrixWithoutExtraSpace {
	public void transpose(int[][] mat) {
		for (int idx = 0; idx < mat.length; idx++) {
			for (int i = idx; i < mat.length; i++) {
				int temp = mat[i][idx];
				mat[i][idx] = mat[idx][i];
				mat[idx][i] = temp;
			}
		}
	}

	private void display(int[][] mat) {
		for (int idx = 0; idx < mat.length; idx++) {
			for (int i = 0; i < mat.length; i++) {
				System.out.print(mat[idx][i] + " ");
			}
			System.out.println();
		}
	}

	private void rotateCounterClockWise(int[][] arr) {
		rotateMatrixWithoutExtraSpace r = new rotateMatrixWithoutExtraSpace();
		// column reverse
		for (int col = 0; col < arr[0].length; col++) {
			int i = 0;
			int j = arr.length - 1;
			while (i < j) {
				int temp = arr[i][col];
				arr[i][col] = arr[j][col];
				arr[j][col] = temp;
				i++;
				j--;
			}
		}
		r.display(arr);
	}

	private void rotateClockWise(int[][] arr) {
		rotateMatrixWithoutExtraSpace r = new rotateMatrixWithoutExtraSpace();
		// row reverse
		for (int row = 0; row < arr[0].length; row++) {
			int i = 0;
			int j = arr[0].length - 1;
			while (i < j) {
				int temp = arr[row][i];
				arr[row][i] = arr[row][j];
				arr[row][j] = temp;
				i++;
				j--;
			}
		}
		r.display(arr);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		for (int idx = 0; idx < mat.length; idx++) {
			for (int i = 0; i < mat.length; i++) {
				mat[idx][i] = sc.nextInt();
			}
		}
		sc.close();
		rotateMatrixWithoutExtraSpace r = new rotateMatrixWithoutExtraSpace();
		r.transpose(mat);
		int[][] p = new int[mat.length][mat[0].length];
		for (int idx = 0; idx < mat.length; idx++) {
			for (int i = 0; i < mat.length; i++) {
				p[idx][i] = mat[idx][i];
			}
		}
		r.rotateClockWise(mat);
		System.out.println();
		r.rotateCounterClockWise(p);
	}

}