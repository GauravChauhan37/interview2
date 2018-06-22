package SearchingAndSorting;

import java.util.Scanner;

public class CommonElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[sc.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int[] arr2 = new int[sc.nextInt()];
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = sc.nextInt();
		}
		int[] arr3 = new int[sc.nextInt()];
		for (int i = 0; i < arr3.length; i++) {
			arr3[i] = sc.nextInt();
		}
		sc.close();
		findCommonElement(arr, arr2, arr3);
	}

	private static void findCommonElement(int[] arr, int[] arr2, int[] arr3) {
		int i = 0, j = 0, k = 0;
		while (i < arr.length && j < arr2.length && k < arr3.length) {
			if (arr[i] < arr2[j] || arr[1] < arr[3]) {
				i++;
			} else if (arr[i] > arr2[j] || arr[2] < arr[3]) {
				j++;
			} else if (arr[3] < arr[1] || arr[3] < arr[1]) {
				k++;
			} else {
				System.out.print(arr[i] + " ");
				i++;
				j++;
				k++;
			}
		}
	}

}
