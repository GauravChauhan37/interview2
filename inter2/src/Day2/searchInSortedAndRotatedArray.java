package Day2;

import java.util.Scanner;

public class searchInSortedAndRotatedArray {
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

	public int search(int[] arr, int key) {
		int pivot = pivotPoint(arr, 0, arr.length - 1);
		int ans3 = -1;
		if (pivot == -1) {
			ans3 = binarySearch(arr, 0, arr.length - 1, key);
		}
		int ans = binarySearch(arr, 0, pivot, key);
		int ans1 = binarySearch(arr, pivot + 1, arr.length - 1, key);
		if (ans != -1) {
			return ans;
		} else if (ans1 != -1) {
			return ans1;
		} else if (ans3 != -1) {
			return ans3;
		} else {
			return -1;
		}

	}

	private int binarySearch(int[] arr, int low, int high, int key) {
		if (high < low) {
			return -1;
		}
		int mid = (low + high) / 2;
		if (arr[mid] == key) {
			return mid;
		} else if (arr[mid] < key) {
			return binarySearch(arr, mid + 1, high, key);
		} else if (arr[mid] > key) {
			return binarySearch(arr, low, mid - 1, key);
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[sc.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int key = sc.nextInt();
		sc.close();
		searchInSortedAndRotatedArray s = new searchInSortedAndRotatedArray();
		int index = s.search(arr, key);
		System.out.println(index);
	}
}
