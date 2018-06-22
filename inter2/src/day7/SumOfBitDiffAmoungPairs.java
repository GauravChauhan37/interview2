package day7;

import java.util.Scanner;

public class SumOfBitDiffAmoungPairs {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[sc.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		diff(arr);
	}

	private static void diff(int[] arr) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			max = Math.max(max, arr[i]);
		}
		int count = 0;
		while (max != 0) {
			count++;
			max >>= 1;
		}
		int sum = 0;
		int countOfOnes = 0;
		int countOfZeroes = 0;
		while (count != 0) {
			for (int i = 0; i < arr.length; i++) {
				if ((arr[i] & 1) == 1) {
					countOfOnes++;
				} else {
					countOfZeroes++;
				}
				arr[i] >>= 1;
			}
			sum += (2 * countOfZeroes * countOfOnes);
			count--;
			countOfOnes =0;
		    countOfZeroes=0;
		}
		System.out.println(sum);
	}
}
