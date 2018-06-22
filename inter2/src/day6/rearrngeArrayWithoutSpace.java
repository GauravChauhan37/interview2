package day6;

public class rearrngeArrayWithoutSpace {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		rearrange(arr);
	}

	public static void rearrange(int[] arr) {
		int left = 0;
		int right = arr.length - 1;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) { // to find out a value we can mod
			// elements with , we can also choose a random number greater than
			// max value
			max = Math.max(max, arr[i]);
			min = Math.min(min, arr[i]);
		}
		max += min;
		int i = 0;
		while (i < arr.length) {
			if (i % 2 == 0) {
				arr[i] = (arr[right] % max) * max + arr[i];
				right--;
				i++;
			} else {
				arr[i] = (arr[left] % max) * max + arr[i];
				left++;
				i++;
			}
		}
		for (int x : arr) {
			System.out.print(x / max + " ");
		}
	}
}
