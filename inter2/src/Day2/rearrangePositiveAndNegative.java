package Day2;

import java.util.Scanner;

public class rearrangePositiveAndNegative {
	public void arrange(int[] arr) {
		int posIndex = 0;
		int negIndex = arr.length - 1;
		while (posIndex < negIndex) {
			if (arr[posIndex] < 0 && arr[negIndex] > 0) {
				int temp = arr[posIndex];
				arr[posIndex] = arr[negIndex];
				arr[negIndex] = temp;
			} else if (arr[posIndex] >= 0) {
				posIndex++;
			} else if (arr[negIndex] < 0) {
				negIndex--;
			}
		}
		posIndex = 1;
		int i;
		for (i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				negIndex = i;
				break;
			}
		}
		while (negIndex < arr.length) {
			int temp = arr[negIndex];
			arr[negIndex] = arr[posIndex];
			arr[posIndex] = temp;
			posIndex += 2;
			negIndex++;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[sc.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		boolean flag = false;
		int index = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				flag = true;
				index = i;
				break;
			}
		}
		if (index != 0 && flag == true) {
			rearrangePositiveAndNegative r = new rearrangePositiveAndNegative();
			r.arrange(arr);
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
