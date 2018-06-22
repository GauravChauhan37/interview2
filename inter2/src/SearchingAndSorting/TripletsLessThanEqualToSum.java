package SearchingAndSorting;

import java.util.Scanner;

public class TripletsLessThanEqualToSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[sc.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int target = sc.nextInt();
		sc.close();
		int count = 0 ;
		int i = 0, j = 1, k = arr.length - 1;
		while (i < arr.length - 1) {
			while (j < k) {
				if (arr[i] + arr[j] + arr[k] < target) {
					count += k - j; // cz it is sorted
					break;
				} else {
					k--;
				}
			}
			i++;
			j = i + 1;
			k = arr.length - 1;
		}
		System.out.println(count);
	}
}
