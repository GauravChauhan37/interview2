package RecursionAndBacktracking;

import java.util.Scanner;

public class PrintAllPalindromicPartitions {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		printPalindromic(s, "", "");
	}

	private static void printPalindromic(String ques, String ans, String prefix) {
		if (ques.length() == 0) {
			if (prefix.length() == 0) {
				System.out.println(ans);
			}
			return;
		}
		char ch = ques.charAt(0);
		ques = ques.substring(1);
		if (palindrome(prefix + ch)) {
			printPalindromic(ques, ans + prefix + ch + " ", "");
		}
		printPalindromic(ques, ans, prefix + ch);
	}

	private static boolean palindrome(String s) {
		int low = 0;
		int high = s.length() - 1;
		while (low < high) {
			if (s.charAt(low) != s.charAt(high)) {
				return false;
			}
			low++;
			high--;
		}
		return true;
	}

}
