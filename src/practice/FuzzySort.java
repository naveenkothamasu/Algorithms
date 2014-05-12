package practice;

public class FuzzySort {

	public static final int LEN = 3;
	public static void main(String[] args){
		
		int[][] a = new int[][]{{10,12},
								{86,90},
								{95,106}
								};
		FuzzySort(a, 0, 2);
		for(int i=0; i<=2; i++){
			System.out.print(a[i][0] + " ");
		}
		
	}
	/**
	 * if [a1,b1] and [a2,b2] overlap, you know that they should be next to each other
	 * call it a pack [a1,b2]
	 * @param A
	 */
	public static void FuzzySort(int A[][], int p, int r){
		if( p < r){
			int q = partition(A, p ,r);
			FuzzySort(A, p, q-1);
			FuzzySort(A, q+1, r);
		}
	}
	
	public static int partition(int A[][], int p, int r){
		int i = p-1;
		int[] temp;
		int j = 0;
		for(j = p; j < LEN-2; j++){
			
			if(A[j][0] < A[r][0]){
				i++;
			}else{
				temp = A[j];
				A[j] = A[i+1];
				A[i+1] = temp;
			}
			IsOverlap(A[j][0], A[j][1], A[r][0], A[r][1]);
		}
		
		temp = A[j];
		A[j] = A[r];
		A[r] = temp;
		return j;
	}
	
	public static int IsOverlap(int s1, int e1, int s2, int e2){
		
		if(s2 <= e1 && s1 <= e2){
			return 1;
		}else{
			return 0;
		}
	
	}
}
