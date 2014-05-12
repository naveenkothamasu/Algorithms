package practice;

public class HeapSort {

	public static final int LEN = 9;
	public static int heap_size = LEN-1;
	public static int LEFT(int i){
		
		int index = 2*i+1;
		if(index <= heap_size){
			return index;
		}else{
			return -1;
		}
	}
	
	public static int RIGHT(int i){
		int index= 2*i+2;
		if(index <= heap_size){
			return index;
		}else{
			return -1;
		}
	}
	public static int PARENT(int i){
		return (i-1)/2;
	}
	public static void main(String[] args){
		
		int a[] = {16,4,10,14,7,9,3,2,8};
		/*
		MAX_HEAPIFY(a, 1);
		System.out.println();
		for(int i=0; i < LEN; i++){
			System.out.print(a[i]+" ");
		}
		*/
		BUILD_MAX_HEAP(a);
		for(int i=0; i <= heap_size; i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
		HEAP_DELETE(a, 4);
		for(int i=0; i <= heap_size; i++){
			System.out.print(a[i]+" ");
		}
		/*
		HEAP_SORT(a);
		System.out.println();
		for(int i=0; i < heap_size; i++){
			System.out.print(a[i]+" ");
		}
		*/
	}
	
	//Assumes binary trees rooted at LEFT(i) and RIGHT(i)
	// are heaps, only tree rooted at i is violating heap property
	public static void MAX_HEAPIFY(int A[], int i){
		
		if(LEFT(i) == -1 && RIGHT(i) == -1){
			return;
		}
		int temp = A[i];
		int largest = i;
		
		if(LEFT(i) != -1 && 
				A[largest] < A[LEFT(i)]){
			largest = LEFT(i);
		}
		if( (RIGHT(i) != -1) && (A[largest] < A[RIGHT(i)]) ){
			largest = RIGHT(i);
		}
		
		temp = A[i];
		A[i] = A[largest];
		A[largest] = temp;
		
		if(i != largest){
			MAX_HEAPIFY(A, largest);
		}
		
	}
	
	public static void MIN_HEAPIFY(int A[], int i){
		
		if(LEFT(i) == -1 && RIGHT(i) == -1){
			return;
		}
		int temp = A[i];
		int smallest = i;
		
		if((LEFT(i) != -1) &&
				A[LEFT(i)] < A[smallest] ){
			smallest = LEFT(i);
		}
		
		if((RIGHT(i) != -1) && 
				(A[RIGHT(i)] < A[smallest]) ){
			smallest = RIGHT(i);
		}
		
		temp = A[i];
		A[i] = A[smallest];
		A[smallest] = temp;
		
		if(i != smallest){
			MIN_HEAPIFY(A, smallest);
		}
		
	}
	public static void BUILD_MAX_HEAP(int A[]){
		
		for(int i = (heap_size/2-1); i>=0; i--){
			MAX_HEAPIFY(A, i);
		}
	}
	
	public static void HEAP_SORT(int A[]){
		int temp = A[1];
		while(heap_size > 0){
			temp = A[heap_size];
			A[heap_size] = A[0];
			A[0] = temp;
			heap_size--;
			MAX_HEAPIFY(A,0);
		}
		
	}
	
	public static void HEAP_DELETE(int S[], int i){
		
		int temp = 0;
		S[i] = S[heap_size];
		heap_size--;
		if(S[i] <= S[PARENT(i)]){
			MAX_HEAPIFY(S, i);
		}else{
			while(i > 0 && S[PARENT(i)] < S[i]){
				temp = S[PARENT(i)];
				S[PARENT(i)] = S[i];
				S[i] = temp;
				
				i = PARENT(i);
			}
		}
		
	}
}
