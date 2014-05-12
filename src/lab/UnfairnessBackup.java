package lab;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class UnfairnessBackup {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
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
			int key = 0;
			res[j] = "YES";
			for (i = 0; i < len; i++) {
				if (A[i]+B[i] < k) {
					res[j] = "NO";
				}
			}
			
		}
		for(int i=0; i<testcases; i++){
			System.out.println(res[i]);
		}

    }
    
    
}