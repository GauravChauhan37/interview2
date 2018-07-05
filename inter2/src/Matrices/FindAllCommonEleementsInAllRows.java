package Matrices;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class FindAllCommonEleementsInAllRows {


	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[][] arr = new int[scn.nextInt()][scn.nextInt()];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = scn.nextInt();
			}
		}
		
		findallCommon(arr);

	}

	static class Pair {
		int count;
		int rowno;

		public Pair(int count, int rowno) {
			this.count = count;
			this.rowno = rowno;
		}
	}

	private static void findallCommon(int[][] arr) {
		HashMap<Integer, Pair> map = new HashMap<>();

		for (int i = 0; i < arr[0].length; i++) {
			map.put(arr[0][i], new Pair(1, 0));// value here keeps the column number
		}

		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (map.containsKey(arr[i][j])) {
					Pair pair = map.get(arr[i][j]);
					if (pair.rowno != i) {
						map.put(arr[i][j], new Pair(pair.count + 1, i));
					}
				} else {
					// it is not present in first row, but present in one of 2nd,3rd and so on rows
					// no use of it.
					// ignore it.
				}
			}
		}

		ArrayList<Integer> keys = new ArrayList<>(map.keySet());

		for (int key : keys) {
			Pair pair = map.get(key);
			if (pair.count == arr.length) {
				System.out.print(key + " ");
			}
		}
	}

}