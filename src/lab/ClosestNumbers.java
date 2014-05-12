package lab;

import java.util.Arrays;
import java.util.Scanner;

public class ClosestNumbers {

	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		int len = Integer.parseInt(s.nextLine());
		String[] str = s.nextLine().split(" ");
		int[] a = new int[len];
		int i=0;
		for(i=0; i<len; i++){
			a[i] = Integer.parseInt(str[i]);
		}
		
		Arrays.sort(a);
		int min=Integer.MAX_VALUE;
		int res = 0;
		for(i=1; i<len; i++){
			int diff = a[i]-a[i-1];
			if(diff < min){
				min = diff;
			}
		}
		
		for(i=1; i<len; i++){
			if(min == (a[i]-a[i-1])){
				System.out.print(a[i-1] + " " + a[i]+ " ");		
			}
		}
	}
}
