package lab;

import java.util.Scanner;

public class ServiceLane {

	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		String[] str = s.nextLine().split(" ");;
		int len = Integer.parseInt(str[0]);
		int testcases = Integer.parseInt(str[1]);
		int j=-1;
		int[] res = new int[len];
		str = s.nextLine().split(" ");
		int[] widths = new int[len];
		for(int i=0; i< len; i++){
			widths[i] = Integer.parseInt(str[i]);
		}
		int entry =0, exit =0;
		while(++j < testcases){
			str = s.nextLine().split(" ");
			entry = Integer.parseInt(str[0]);
			exit = Integer.parseInt(str[1]);
			
			res[j] = findMin(widths, entry, exit);
		}
		
		for(j=0; j<testcases; j++){
			System.out.println(res[j]);
		}
		
	}
	
	private static int findMin(int A[], int s, int t){
		int min = A[s];
		for(int i=s; i<=t; i++){
			if(A[i] < min){
				min = A[i];
			}
		}
		
		return min;
	}
}
