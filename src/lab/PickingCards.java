package lab;

import java.util.Scanner;

public class PickingCards {

	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		int testcases = Integer.parseInt(s.nextLine());
		
		int j = -1;
		long[] res = new long[testcases];
		
		while(++j < testcases){
			int len = Integer.parseInt(s.nextLine());
			String[] str = s.nextLine().split(" ");
			int i=-1;
			int[] v = new int[len];
			while(++i < len){
				v[i] = Integer.parseInt(str[i]);
			}
			res[j] = calcWays(v, len)%1000000007;
		}
	
		for(j=0; j<testcases; j++){
			System.out.println(res[j]);
		}
		
	}
	
	public static long calcWays(int[] v, int len){
		long ways =  1;
		int temp = 1;
		for(int i=0; i< len; i++){
			temp = elementsLessThan(v, len, i);
			ways *= temp;
		}
		return ways;
	}
	
	public static int elementsLessThan(int[] v, int len, int val){
		int count = 0;
		int k=0;
		for(int i=0; i<len; i++){
			if(v[i] <= val){
				k = i;
				++count;
			}
		}
		v[k] = Integer.MAX_VALUE;
		
		return count;
	}
}
