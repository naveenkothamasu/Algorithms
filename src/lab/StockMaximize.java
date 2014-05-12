package lab;

import java.util.Scanner;

public class StockMaximize {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int T = Integer.parseInt(s.nextLine());
		int N = Integer.parseInt(s.nextLine());
		String[] str = s.nextLine().split(" ");
		int j = -1;
		int i = 0;
		int[] vals = new int[N];
		for (; i < N; i++) {
			vals[i] = Integer.parseInt(str[i]);
		}
		int[] res = new int[T];
		while (++j < T) {
			res[j] = profit(vals, N);
		}
		for (j = 0; j < N; j++) {
			System.out.println(res[j]);
		}
	}

	private static int profit(int[] vals, int N) {
		int i = 0;
		int max = vals[0];
		int cost = vals[0];
		int prevProfit = 0;
		for (i = 1; i < N; i++) {
			if (max < vals[i] && prevProfit < i * (vals[i] - cost)) {
				prevProfit = (i - 1) * vals[i] - cost;
				max = vals[i];
			} else {

				cost += vals[i];
			}
		}

		return prevProfit;
	}
}
