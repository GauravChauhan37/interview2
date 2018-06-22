package day6;

import java.util.Scanner;

public class arrangeAndFormBiggestNumber {
	public void printLargest(int[] arr) {
		
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[sc.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		arrangeAndFormBiggestNumber a = new arrangeAndFormBiggestNumber();
		a.printLargest(arr);
	}
}