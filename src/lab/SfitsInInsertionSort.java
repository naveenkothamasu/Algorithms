package lab;

import java.util.Scanner;

public class SfitsInInsertionSort {

	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		int testcases = Integer.parseInt(s.nextLine());
		int len = 0;
		int j = -1;
		int[] res = new int[testcases];
		int[] A = null;
		int i = 0;
		String[] str;
		while(++j < testcases){
			len = Integer.parseInt(s.nextLine());
			str = s.nextLine().split(" ");
			A = new int[len];
			for(i=0; i<len; i++){
				A[i] = Integer.parseInt(str[i]);
			}
			res[j] = countshifts(A, 0, len-1);
		}
		for(j=0; j<testcases; j++){
			System.out.println(res[j]);
		}
	}
	
	private static int countshifts(int A[], int p, int r){
		
		int q = 0;
		if(p < r){
			q = (p+r)/2;
			return countshifts(A, p, q) + countshifts(A, q+1, r) + merge(A, p, q, r);
		}
		return 0;
	}
	
	private static int merge(int A[], int p, int q, int r){
		int count = 0;
		int[] left = new int[q-p+1];
		int[] right = new int[r-q];
		int i = 0;
		int j = 0;
		int k = p;
		for(i=0; i< q-p+1; i++){
			left[i] = A[p+i];
		}
		for(i=0; i< r-q; i++){
			right[i] = A[q+1+i];
		}
		i = 0;
		j = 0;
		
		while(i <= (q-p) && j <= (r-q-1)){
			if(left[i] <= right[j]){
				A[k] = left[i];
				i++;
			}else{
				A[k] = right[j];
				count += (q-p+1)-(i);
				j++;
			}
			k++;
		}
			if(i > (q-p)){
				while(j<=(r-q-1)){
					A[k++] = right[j++];
				}
			}else{
				while(i<=(q-p)){
					A[k++] = left[i++];
				}
			}
		
		return count;
	}
}
