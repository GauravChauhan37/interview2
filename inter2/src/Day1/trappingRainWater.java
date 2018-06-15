package Day1;

import java.util.Scanner;

public class trappingRainWater {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[sc.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		solve(arr);
	}

	private static void solve(int[] arr) {
		int peakValue = Integer.MIN_VALUE;
		int peakValueIdx = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > peakValue) {
				peakValue = arr[i];
				peakValueIdx = i;
			}
		}
		int waterStored = 0;
		int currPeak = arr[0];
		for (int i = 1; i <= peakValueIdx; i++) {
			if (arr[i] < currPeak) {
				waterStored += (currPeak - arr[i]);
			} else {
				currPeak = arr[i];
			}
		}
		currPeak = arr[arr.length - 1];
		for (int i = arr.length - 2; i >= peakValueIdx; i--) {
			if (arr[i] < currPeak) {
				waterStored += (currPeak - arr[i]);
			} else {
				currPeak = arr[i];
			}
		}
		System.out.println(waterStored);
	}
}