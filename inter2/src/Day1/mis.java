package Day1;

public class mis {
	private static void solve(int[] arr) {
		int[] mis = new int[arr.length];

		mis[0] = arr[0];

		int omax = 0;

		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j <= i - 1; j++) {
				if (arr[i] > arr[j]) {
					if (mis[j] > mis[i]) {
						mis[i] = mis[j];
					}
				}
			}
			mis[i] += arr[i];
			if (omax < mis[i]) {
				mis[i] = omax;
			}
		}

		System.out.println(omax);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
