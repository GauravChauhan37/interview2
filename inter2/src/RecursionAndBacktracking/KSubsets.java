package RecursionAndBacktracking;


import java.util.ArrayList;
import java.util.Scanner;

public class KSubsets {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int[] arr = new int[sc.nextInt()];
        for(int i=0;i<arr.length;i++){
            arr[i] =sc.nextInt();
        }
		int k =sc.nextInt();
		ArrayList<Integer>[] al = new ArrayList[k];
		for (int i = 0; i < al.length; i++) {
			al[i] = new ArrayList<>();
		}
		boolean ans = kSubsets(arr, k, new int[k], 0, al);
		if(ans){
            System.out.println("Yes");
        }else{
             System.out.println("No");
        }

	}

	private static boolean kSubsets(int[] arr, int k, int[] sp, int vidx, ArrayList<Integer>[] al) {
		if (vidx >= arr.length) {
			for (int i = 1; i < k; i++) {
				if (sp[i - 1] != sp[i]) {
					return false;
				}
			}
			// for (int i = 0; i < al.length; i++) {
			// System.out.println(al[i]);
			// }
			// System.out.println("true");
			// System.out.println("**********");
			return true;
		}
		boolean ans = false;
		for (int i = 0; i < k; i++) {
			sp[i] += arr[vidx];
			// al[i].add(arr[vidx]);
			ans = ans || kSubsets(arr, k, sp, vidx + 1, al);
			sp[i] -= arr[vidx];
			// al[i].remove(al[i].size() - 1);
		}
		return ans;
	}

}
