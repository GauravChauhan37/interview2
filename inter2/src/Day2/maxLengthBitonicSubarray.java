package Day2;

import java.util.Scanner;

public class maxLengthBitonicSubarray {
	public void bitonicSubarr(int[] arr) {
		int maxSoFar = Integer.MIN_VALUE;
		int currLen = 1;
		boolean sheldon = false;
		int currStart = 0;
		int startIndex = 0;
		int endIndex = 0;
		int i;
		for (i = 0; i < arr.length - 1; i++) {
			if (arr[i] < arr[i + 1] && sheldon == false) {
				currLen++;
			} else if (arr[i] > arr[i + 1] && sheldon == false) {
				sheldon = true;
				currLen++;
			} else if (arr[i] <= arr[i + 1] && sheldon == true) {
				if (currLen > maxSoFar) {
					maxSoFar = currLen;
					startIndex = currStart;
					endIndex = i;
				}
				currLen = 1;
				currStart = i + 1;
				sheldon = false;
			} else {
				if (currLen > maxSoFar) {
					maxSoFar = currLen;
					startIndex = currStart;
					endIndex = i;
				}
				currLen = 1;
				currStart = i + 1;
				sheldon = false;
			}
		}
		if (sheldon == true && i == arr.length - 1) {
			if (currLen > maxSoFar) {
				maxSoFar = currLen;
				startIndex = currStart;
				endIndex = i;
			}
		}
		for (int j = startIndex; j <= endIndex; j++) {
			System.out.print(arr[j] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[sc.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		maxLengthBitonicSubarray m = new maxLengthBitonicSubarray();
		m.bitonicSubarr(arr);
	}
}
