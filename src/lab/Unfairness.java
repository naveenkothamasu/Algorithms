package lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Unfairness {

	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		int len = s.nextInt();
		int k = s.nextInt();
		int[] nBoxes = new int[len];
		for(int i=0; i < len; i++){
			nBoxes[i] = s.nextInt();
		}
		
		Arrays.sort(nBoxes);
		int unfairness = Integer.MAX_VALUE;
		for(int i=0; i+k-1 < len; i++ ){
			if( (nBoxes[i+k-1] - nBoxes[i]) < unfairness){
				unfairness = nBoxes[i+k-1] - nBoxes[i];
			}
		}
		
		System.out.println(unfairness);
		
	}
}
