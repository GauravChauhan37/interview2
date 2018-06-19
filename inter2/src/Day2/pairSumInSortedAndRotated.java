package Day2;

import java.util.Scanner;

public class pairSumInSortedAndRotated {
	public static int pivotPoint(int[] arr, int low, int high) {
		if (high < low)
			return -1;
		if (high == low)
			return low;
		int mid = (low + high) / 2;
		int prev = arr[(mid - 1 + arr.length) % arr.length];
		int next = arr[(mid + 1) % arr.length];
		if (prev < arr[mid] && arr[mid] > next) {
			return mid;
		} else if (arr[mid] < arr[mid + 1] && arr[mid] < arr[0]) {
			return pivotPoint(arr, low, mid - 1);
		} else if (arr[mid] < arr[mid + 1] && arr[mid] > arr[arr.length-1]) {
			return pivotPoint(arr, mid + 1, high);
		} else {
			return -1;
		}
	}

	public void search(int[] arr, int targetSum) {
		int pivot = pivotPoint(arr, 0, arr.length - 1);
		System.out.println(pivot);
		int left = pivot + 1;
		int right = pivot;
		int leftSum = 0;
		int rightSum = 0;
		int count = 0;
		while (count < arr.length - 1) {
			leftSum = arr[left];
			rightSum = arr[right];
			if (leftSum + rightSum == targetSum) {
				System.out.println(leftSum + " " + rightSum);
				left = (left + 1) % arr.length;
				right = (right - 1 + arr.length) % arr.length;
				count += 2;
			} else if (leftSum + rightSum > targetSum) {
				right = (right - 1 + arr.length) % arr.length;
				count++;
			} else if (leftSum + rightSum < targetSum) {
				left = (left + 1) % arr.length;
				count++;
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[sc.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int sum = sc.nextInt();
		sc.close();
		pairSumInSortedAndRotated s = new pairSumInSortedAndRotated();
		s.search(arr, sum);
	}

}
