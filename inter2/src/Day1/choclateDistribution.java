package Day1;

import java.util.Arrays;
import java.util.Scanner;

public class choclateDistribution {
	private static void solve(int m, int[] arr) {
		Arrays.sort(arr);

		int i = 0;
		int j = i + m - 1;
		int mindiff = Integer.MAX_VALUE;
		while (j < arr.length) {

			if (mindiff > arr[j] - arr[i]) {
				mindiff = arr[j] - arr[i];
			}
			i++;
			j++;
		}
		System.out.println(mindiff);
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}

		solve(m, arr);
	}

}
