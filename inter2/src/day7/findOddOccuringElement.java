package day7;

import java.util.Scanner;

public class findOddOccuringElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		find(arr);
	}

	private static void find(int[] arr) {
		int num = 0;
		for (int i = 0; i < arr.length; i++) {
			num ^= arr[i];
		}
		System.out.println(num);
	}
}
