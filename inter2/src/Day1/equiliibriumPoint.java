package Day1;

public class equiliibriumPoint {
	public static int eq(int[] arr) {
		int sum = 0;
		for (int i = 1; i < arr.length; i++) {
			sum += arr[i];
		}
		int leftSum = 0;
		int i = 0;
		int j = 1;
		while (j < arr.length) {
			if (leftSum == sum) {
				return i;
			} else {
				leftSum += arr[i];
				i++;
				sum -= arr[j];
				j++;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
