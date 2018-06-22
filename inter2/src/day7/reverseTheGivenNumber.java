package day7;

import java.util.Scanner;

public class reverseTheGivenNumber {
	public static int reverse(int n) {
		int num = 0;
		while (n != 0) {
			int temp=n&1;
			n >>= 1;
			num <<= 1;
			num |= temp;

		}
		return num;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		System.out.println(reverse(n));
	}
}
