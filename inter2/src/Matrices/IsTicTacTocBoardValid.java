package Matrices;

import java.util.Scanner;

public class IsTicTacTocBoardValid {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		char[] arr = new char[9];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.next().charAt(0);
		}

		System.out.println(checkvalidity(arr));
		scn.close();
	}

	private static boolean checkvalidity(char[] arr) {
		int countOfOs = 0;
		int countOfXs = 0;
		for(int i=0;i<arr.length;i++){
			if(arr[i] == 'X'){
				countOfXs++;
			}else if(arr[i] == 'O'){
				countOfOs++;
			}
		}
		if (Math.abs(countOfXs - countOfOs) > 1 ) {
			return false;
		} else if (oWins(arr, 'O')) {
			if (oWins(arr, 'X')) {
				return false;
			} else {
				return countOfOs == countOfXs + 1;
			}
		} else {
			if (oWins(arr, 'X') && countOfXs != countOfOs + 1) {
				return false;
			}
		}
		return true;
	}

	private static boolean oWins(char[] arr, char ch) {
		int[][] winMoves = { { 0, 3, 6 }, { 1, 4, 7 }, { 2, 5, 8 }, { 0, 1, 2 }, { 3, 4, 5 }, { 6, 7, 8 }, { 0, 4, 8 },
				{ 6, 7, 8 }, };
		for (int i = 0; i < winMoves.length; i++) {
			if (arr[winMoves[i][0]] == ch && arr[winMoves[i][1]] == ch && arr[winMoves[i][2]] == ch) {
				return true;
			}
		}
		return false;

	}
}
