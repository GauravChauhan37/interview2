package Matrices;

import java.util.HashSet;
import java.util.LinkedList;

public class ShortestPathInMatrix {
	static class Pair {
		int row;
		int col;

		public Pair(int row, int col) {
			this.row = row;
			this.col = col;
		}

		Pair() {

		}
	}

	public static int shortestPath(int[][] mat, int srow, int scol, int drow, int dcol) {
		LinkedList<Pair> queue = new LinkedList<>();
		HashSet<Pair> visited = new HashSet<>();
		int count = 0;
		queue.add(new Pair(srow, scol));
		while (queue.size() != 0) {
			// remove
			Pair rem = queue.removeFirst();
			if (visited.contains(rem) == false) {
				count++;
			}
			visited.add(rem);
			if (rem.row == drow && rem.col == dcol) {
				return count;
			}
			// enqueue child
			int row = rem.row;
			int col = rem.col;
			Pair p = new Pair();
			if (row - 1 >= 0 && mat[row - 1][col] == 1) {
				p.row = row - 1;
				p.col = col;
				if (visited.contains(p) == false) {
					queue.addLast(p);
				}
			}
			if (col - 1 >= 0 && mat[row][col - 1] == 1) {
				p.row = row;
				p.col = col - 1;
				if (visited.contains(p) == false) {
					queue.addLast(p);
				}
			}
			if (row + 1 < mat.length && mat[row + 1][col] == 1) {
				p.row = row + 1;
				p.col = col;
				if (visited.contains(p) == false) {
					queue.addLast(p);
				}
			}
			if (col + 1 < mat[0].length && mat[row][col + 1] == 1) {
				p.row = row;
				p.col = col + 1;
				if (visited.contains(p) == false) {
					queue.addLast(p);
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int mat[][] = { { 1, 0, 1, 1, 1, 1, 0, 1, 1, 1 }, { 1, 0, 1, 0, 1, 1, 1, 0, 1, 1 },
				{ 1, 1, 1, 0, 1, 1, 0, 1, 0, 1 }, { 0, 0, 0, 0, 1, 0, 0, 0, 0, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 0 },
				{ 1, 0, 1, 1, 1, 1, 0, 1, 0, 0 }, { 1, 0, 0, 0, 0, 0, 0, 0, 0, 1 }, { 1, 0, 1, 1, 1, 1, 0, 1, 1, 1 },
				{ 1, 1, 0, 0, 0, 0, 1, 0, 0, 1 } };
		System.out.println(shortestPath(mat, 0, 0, 4, 4));
	}

}
