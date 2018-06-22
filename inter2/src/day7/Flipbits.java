package day7;

import java.util.Scanner;

public class Flipbits {
	public static void flip(int n, int m) {
		int num = 0;
		num ^= n;
		num ^= m;
		countSetBits(num);
	}

	private static void countSetBits(int num) {
		int count = 0;
		while (num != 0) {
			if ((num & 1) == 1) {
				count++;
			}
			num>>=1;
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.close();
		flip(n, m);
	}
}
