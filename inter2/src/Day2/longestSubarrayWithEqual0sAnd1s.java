package Day2;

public class longestSubarrayWithEqual0sAnd1s {
	public void findSubArr(int[] arr) {
		int currLength = 0;
		int maxLength = 0;
		int leftIndex = 0;
		int rightIndex = 0;
		int start = 0;
		int i;
		for (i = 0; i < arr.length; i++) {
			if (arr[i] == 0 || arr[i] == 1) {
				currLength++;
			} else {
				if (currLength > maxLength) {
					maxLength = currLength;
					leftIndex = start;
					rightIndex = i - 1;
				}
				currLength = 0;
				start = i + 1;
			}
		}
		if (currLength > maxLength) {
			maxLength = currLength;
			leftIndex = start;
			rightIndex = i - 1;
		}
		System.out.println("starts from" + " " + leftIndex);
		for (int j = leftIndex; j <= rightIndex; j++) {
			System.out.print(arr[j] + " ");
		}
		System.out.println();
		System.out.println("ends at" + " " + rightIndex);
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 1, 0, 0, 1, 1, 1, 0, 0, 0, 2, 3, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
				1 };
		longestSubarrayWithEqual0sAnd1s l = new longestSubarrayWithEqual0sAnd1s();
		l.findSubArr(arr);
	}
}
