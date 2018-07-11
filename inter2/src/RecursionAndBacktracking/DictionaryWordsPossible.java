package RecursionAndBacktracking;

import java.util.HashSet;
import java.util.Scanner;

public class DictionaryWordsPossible {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] arr = new String[sc.nextInt()];
		sc.nextLine();
		String ques = sc.nextLine();
		arr = ques.split(" ");
		String s = sc.nextLine();
		sc.close();
		HashSet<String> hs = new HashSet<String>();
		for (int i = 0; i < arr.length; i++) {
			hs.add(arr[i]);
		}
		sc.close();
		printPossibleWords(hs, s, "", "");
	}

	private static void printPossibleWords(HashSet<String> hs, String ques, String ans, String prefix) {
		if (ques.length() == 0) {
			if (prefix.length() == 0) {
				ans = ans.substring(0, ans.length() - 1); // to match the
															// testcases'
															// pattern
				System.out.print("(" + ans + ")");
			}
			return;
		}
		char ch = ques.charAt(0);
		ques = ques.substring(1);
		if (hs.contains(prefix + ch)) {
			printPossibleWords(hs, ques, ans + prefix + ch + " ", "");
			printPossibleWords(hs, ques, ans, prefix + ch);
		} else {
			printPossibleWords(hs, ques, ans, prefix + ch);
		}
	}

}
