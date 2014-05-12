/**
 * In-place sort, avg case time complexity O(nlogn)

 * Partition is O(n) algo which rearranges elements around pivot element in-place
 * 	---from the bottom need one marker to tell me smaller elements, from there the bigger 
 * elements till where I am right now. So if I encounter a bigger element, I will push it inside
 * the smaller marker and as usual my current marker from the smaller marker keeps track of bigger
 * elements
 */
/**
 * Tail-recursion: return x+recsum(x-1) => return tailrecsum(x-1, runningTotal+x);
 */
package practice;

import java.util.Random;

public class QuickSort {

	private static final int LEN = 9;
	public static void main(String[] args){
		
		int a[] = {6,3,7,2,4,1,8,-9,5};
		Quick_Sort1(a, 0, 8);
		for(int i=0; i<=8; i++){
			System.out.print(a[i] + " ");
		}
	}
	
	public static void Quick_Sort1(int A[], int p, int r){
		System.out.println("QuickSort(A[]," + p +","+ r + ")");
		int q = 0;
		while( p < r){
			//q = HOARE_PARTITION(A, p, r); //FIXME: doesn't work in all cases, (corner cases)
			q = Partition(A, p, r);
			Quick_Sort1(A, p, q-1);
			p = q+1;
		}
	}
	public static void Quick_Sort(int A[], int p, int r){
		
		int q = 0;
		if( p < r){
			//q = Partition(A, p, r);
			//q = RANDOMIZED_PARTITION(A, p, r);
			q = HOARE_PARTITION(A, p, r);
			Quick_Sort(A, p, q-1);
			Quick_Sort(A, q+1, r);
			
		}
	}
	
	public static int Partition(int A[], int p, int r){
		
		int i = p-1;
		int temp = 0;
		for(int j=p; j < r; j++){
			if(A[j] < A[r]){
				i++;
				temp = A[i];
				A[i] = A[j];
				A[j] = temp;
				
			}
		}
		
		temp = A[i+1];
		A[i+1] = A[r];
		A[r] = temp;
		
		return i+1;
	}
	
	/**
	 * To keep the split balanced on an average, select the pivot randomly
	 */
	
	public static int RANDOMIZED_PARTITION(int A[], int p, int r){
		int i = p + (int) (Math.random() * (r-p+1));
		int temp = A[i];
		A[i] = A[r];
		A[r] = temp;
		return Partition(A, p, r);
		//return HOARE_PARTITION(A, p, r);
	}
	
	public static int HOARE_PARTITION(int A[], int p, int r){
		int x = A[r];
		int i = p-1;
		int j = r+1;
		int temp = 0;
		while(true){
			do{
				j = j-1;
			}while(j >=0 && j <= LEN-1 && A[j] >= x);
			do{
				i = i+1;
			}while(i >=0 && i <= LEN-1 && A[i] <= x);
			
			if(i < j){
				temp = A[i];
				A[i] = A[j];
				A[j] = temp;
			}else{
				temp = A[r];
				A[r] = A[i];
				A[i] = temp;
				return i;
			}
		}
	}
}
