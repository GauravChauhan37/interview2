package day7;

import java.util.Scanner;

public class PosOFOnlySetBitInConstantTime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if ((n & (n - 1)) != 0) {
			System.out.println("Invalid");
		} else {
			int pos = (int) (Math.log(n) / Math.log(2));
			pos += 1;
			System.out.println(pos);
		}
	}
}
