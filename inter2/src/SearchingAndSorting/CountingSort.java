package SearchingAndSorting;

import java.util.Scanner;

public class CountingSort {
	public static void countingSort(String s) {
		int[] freq = new int[26];
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			freq[ch - 'a']++;
		}
		int[] pos = new int[26];
		pos[0] = freq[0];
		for (int i = 1; i < pos.length; i++) {
			pos[i] = freq[i] + pos[i - 1];
		}
		char[] arr = new char[s.length()];
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			int index = ch - 'a';
			arr[pos[index]-1] = ch;
			pos[index]--;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		countingSort(s);

	}

}
