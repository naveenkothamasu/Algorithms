package practice;

public class D_ary_Heap {

	public static final int d = 3;
	public static int heap_size = 0;
	public static int LEN = 9;
	
	public static int PARENT(int i){
		return (i+1)/d;
	}
	
	public static void main(String[] args){
		
		int a[] = {9,8,7,6,5,4,3,2,1};
		
		BUILD_MAX_HEAP(a);
		for(int i=0; i<LEN; i++){
			System.out.print(a[i] + " ");
		}
	}
	
	public static void HEAP_SORT(int A[]){
		
		for(int i=heap_size; i>0; i--){
			System.out.print(A[0] + " ");
		}
	}
	public static void BUILD_MAX_HEAP(int A[]){
		for(int i=LEN/2; i >=0; i--){
			HEAPIFY(A, i);
		}
	}
	public static void HEAPIFY(int A[], int i){
		
		int largest = i;
		int temp = 0;
		for(int k=0; k <d; k++){
			if( (d *(i+1)+k) <= LEN && 
					A[largest] < A[d *(i+1)+k]){
				largest = d *(i+1)+k;
			}
		}
		
		if(largest != i){
			temp = A[i];
			A[i] = A[largest];
			A[largest] = temp;
		}
	}
	
	public static void INSERT(int A[], int x){
		heap_size = heap_size + 1;
		A[heap_size] = -Integer.MAX_VALUE;
		
		INCREASE_KEY(A, heap_size, x);
	}
	
	public static int INCREASE_KEY(int A[], int i, int key){
		
		if(key < A[i]){
			return -1;
		}
		int temp = 0;
		A[i] = key;
		while(i > 0 && A[PARENT(i)] < key){
			
			temp = A[PARENT(i)];
			A[PARENT(i)] = A[i];
			A[i] = temp;
			
			i = PARENT(i);
		}
		
		return 0;
	}
	
	public static int EXTRACT_MAX(int A[]){
		int max = A[0];
		
		A[0] = A[heap_size];
		heap_size = heap_size-1;
		
		HEAPIFY(A, 0);
		
		return max;
	}
}
