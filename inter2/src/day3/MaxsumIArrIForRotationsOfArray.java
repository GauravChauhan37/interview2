package day3;

import java.util.Scanner;

public class MaxsumIArrIForRotationsOfArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[sc.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int cum_sum = 0;
		for (int i = 0; i < arr.length; i++) {
			cum_sum += arr[i];
		}
		int curr_val = 0;
		int over_max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			curr_val += arr[i] * i;
		}
		if (over_max < curr_val) {
			over_max = curr_val;
		}
		for (int i = 1; i < arr.length; i++) {
			int next = curr_val - (cum_sum - arr[i - 1]) + (arr[i - 1] * (arr.length - 1));
			curr_val = next;
			if (over_max < curr_val) {
				over_max = curr_val;
			}
		}
		System.out.println(over_max);
	}
}
