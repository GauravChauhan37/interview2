package Matrices;

import java.util.PriorityQueue;
import java.util.Scanner;

public class SortedRowColumnWiseSortedMatrix {
	private static class Pair implements Comparable<Pair> {
		int data;
		int row;
		int idx;

		private Pair(int data, int row, int idx) {
			this.data = data;
			this.row = row;
			this.idx = idx;
		}

		@Override
		public int compareTo(Pair o) {
			return this.data - o.data;
		}
	}

	private static void sort(int[][] mat) {
		PriorityQueue<Pair> pq = new PriorityQueue<Pair>();
		for (int i = 0; i < mat.length; i++) {
			Pair p = new Pair(mat[i][0], i, 0);
			pq.add(p);
		}
		while (pq.size() != 0) {
			Pair rem = pq.remove();
			System.out.print(rem.data + " ");
			rem.idx++;
			if (rem.idx < mat[0].length) {
				rem.data = mat[rem.row][rem.idx];
				pq.add(rem);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[sc.nextInt()][sc.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		sc.close();
		sort(arr);
	}
}
