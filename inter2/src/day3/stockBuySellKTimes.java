package day3;

import java.util.Scanner;

public class stockBuySellKTimes {
	public void solution(int[] arr, int k) {
		int[][] sol = new int[k + 1][arr.length];
		for (int i = 0; i < sol.length; i++) {
			for (int j = 0; j < sol[0].length; j++) {
				if (i == 0 || j == 0) {
					sol[i][j] = 0;
				} else {
					int currMax = Integer.MIN_VALUE;
					for (int p = 0; p < j; p++) {
						currMax = Math.max(currMax, arr[j] - arr[p] + sol[i - 1][p]);
					}
					sol[i][j] = Math.max(currMax, sol[i][j - 1]);
				}
			}
		}
		System.out.println(sol[k][arr.length - 1]);
	}

	public static void main(String[] args) {
		stockBuySellKTimes s = new stockBuySellKTimes();
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int[] arr = new int[sc.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		s.solution(arr, k);
	}
}
