package day6;

public class MaxScore {
	public void max(int[][] arr) {
		int currMax = Integer.MIN_VALUE;
		for (int i = arr[0].length-1; i >=0; i--) {
			currMax = Math.max(currMax, arr[arr.length - 1][i]);
		}
		int sum = currMax;
		for (int i = arr.length - 2; i >= 0; i--) {
			int newMax = Integer.MIN_VALUE;
			for (int j = arr[0].length - 1; j >= 0; j--) {
				if (arr[i][j] < currMax) {
					newMax = Math.max(newMax, arr[i][j]);
				}
			}
			sum += newMax;
			currMax = newMax;
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		int[][] arr = { { 7, 6, 5, 8 }, { 42, 30, 10, 50 }, { 30, 20, 45, 70 }, { 10, 20, 30, 40 }, };
		MaxScore m = new MaxScore();
		m.max(arr);
	}
}
