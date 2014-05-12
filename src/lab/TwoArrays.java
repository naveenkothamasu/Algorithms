package lab;

import java.util.Arrays;
import java.util.Scanner;

public class TwoArrays {

	public static void main(String[] args) {
		/*
		Scanner s = new Scanner(System.in);
		int testcases = s.nextInt();
		int j = 0;
		String[] res = new String[testcases+1];
		s.nextLine();
		while (j < testcases) {
			String str = s.nextLine();
			String[] line = str.split(" ");
			int len = Integer.parseInt(line[0]);
			int k = Integer.parseInt(line[1]);
			int[] A = new int[len];
			int[] B = new int[len];
			str = s.nextLine();
			String[] sNum = str.split(" ");
			int i = 0;
			for (; i < len; i++) {
				A[i] = Integer.parseInt(sNum[i]);
			}
			str = s.nextLine();
			sNum = str.split(" ");
			i = 0;
			for (; i < len; i++) {
				B[i] = Integer.parseInt(sNum[i]);
			}
			Arrays.sort(B);
			int key = 0;
			for (i = 0; i < len; i++) {
				// Is there a B[i] >= k-A[i]
				key = k - A[i];
				if (Arrays.binarySearch(B, key) > 0) {
					res[j++] = "Yes";
					continue;
				}
			}
			res[j++] = "No";
		}
		for(int i=0; i<testcases; i++){
			System.out.println(res[i]);
		}*/
		Scanner s = new Scanner(System.in);
		int testcases = s.nextInt();
		int j = -1;
		String[] res = new String[testcases];
        s.nextLine();
		while (++j < testcases) {
            String str = s.nextLine();
			String[] line = str.split(" ");
            int len = Integer.parseInt(line[0]);
			int k = Integer.parseInt(line[1]);			
			int[] A = new int[len];
			int[] B = new int[len];
			str = s.nextLine();
			String[] sNum = str.split(" ");
			int i = 0;
			for (; i < len; i++) {
				A[i] = Integer.parseInt(sNum[i].trim());
			}
			str = s.nextLine();
			sNum = str.split(" ");
			i = 0;
			for (; i < len; i++) {
				B[i] = Integer.parseInt(sNum[i]);
			}
			Arrays.sort(B);
			int key = 0;
			for (i = 0; i < len; i++) {
				// Is there a B[i] >= k-A[i]
				key = k - A[i];
				if (Arrays.binarySearch(B, key) > 0) {
					res[j] = "YES";
					break;
				}
			}
			res[j] = "NO";
		}
		for(int i=0; i<testcases; i++){
			System.out.println(res[i]);
		}
	}
		
}
/**
BACKUP

**/