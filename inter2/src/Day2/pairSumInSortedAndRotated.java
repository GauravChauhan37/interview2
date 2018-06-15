package Day2;

import java.util.Scanner;

public class pairSumInSortedAndRotated {
	public static int pivotPoint(int[] arr, int low, int high) {
		if (high < low)
			return -1;
		if (high == low)
			return low;
		int mid = (low + high) / 2;
		if (arr[mid - 1] < arr[mid] && arr[mid] > arr[mid + 1]) {
			return mid;
		} else if (arr[mid] < arr[mid + 1] && arr[mid] < arr[low]) {
			return pivotPoint(arr, low, mid - 1);
		} else if (arr[mid] < arr[mid + 1] && arr[mid] > arr[high]) {
			return pivotPoint(arr, mid + 1, high);
		} else {
			return -1;
		}
	}

	public void search(int[] arr, int targetSum) {
		int pivot = pivotPoint(arr, 0, arr.length - 1);
		int left = pivot;
		int right = pivot + 1;
		int leftSum = 0;
		int rightSum = 0;
		while (left >= 0 || right < arr.length) {// multiple break conditions
			if (left >= 0) {
				leftSum = arr[left];
			}
			if (right < arr.length) {
				rightSum = arr[right];
			}
			if (leftSum + rightSum == targetSum) {
				System.out.println(leftSum + " " + rightSum);
				return;
			} else if (leftSum + rightSum < targetSum) {
				if (right < arr.length)
					right++;
			} else if (leftSum + rightSum > targetSum) {
				if (left >= 0)
					left--;
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
