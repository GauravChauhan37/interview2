package RecursionAndBacktracking;

import java.util.Scanner;

public class FindPathsFromCornertoMiddleCell {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[sc.nextInt()][sc.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		sc.close();
		for (int i = 0; i < arr[0].length; i++) {
			findPath(arr, i, 0, arr.length / 2, arr[0].length / 2, "", new boolean[arr.length][arr[0].length]);
		}
	}

	private static void findPath(int[][] arr, int sr, int sc, int dr, int dc, String psf, boolean[][] mat) {
		if (sr == dr && sc == dc) {
			System.out.println(psf + " MID");
			return;
		}
		if (isInvalid(arr, sr, sc, mat)) {
			return;
		}
		mat[sr][sc] = true;
		findPath(arr, sr + arr[sr][sc], sc, dr, dc, psf + sr + sc + " ", mat); // down
		findPath(arr, sr, sc + arr[sr][sc], dr, dc, psf + sr + sc + " ", mat); // right
		findPath(arr, sr, sc - arr[sr][sc], dr, dc, psf + sr + sc + " ", mat); // left
		findPath(arr, sr - arr[sr][sc], sc, dr, dc, psf + sr + sc + " ", mat); // top
		mat[sr][sc] = false;
	}

	private static boolean isInvalid(int[][] arr, int sr, int sc, boolean[][] mat) {
		if (sr < 0 || sc < 0 || sr >= arr.length || sc >= arr[0].length || mat[sr][sc] == true) {
			return true;
		}
		return false;
	}
}