/**
	 * while(cond1){
	 * 	if(cond2){
	 * 	}else{
	 * 		break;
	 * 	}
	 * }
	 * SAME AS
	 * while(cond1 && cond2){
	 * }
	 */
package practice;

import java.util.HashMap;
import java.util.Map;

public class MaxPriority {

	public static final int LEN = 9;
	public static int heap_size = -1;
	
	public static void main(String[] args){
		int a[] = {1,2,3,4,5,6,7,8,9};
		int S[] = new int[LEN];
		/*
		for(int i=0; i<LEN; i++){
			INSERT(S, a[i]);
		}
		for(int i=0; i<LEN; i++){
			System.out.print(EXTRACT_MAX(S) + " ");
		}
		*/
		/*for(int i=0; i<LEN; i++){
			enqueue(S, a[i]);
		}
		for(int i=0; i<LEN; i++){
			System.out.print(dequeue(S) + " ");
		}*/
		
		for(int i=0; i<LEN; i++){
			push(S, a[i]);
		}
		for(int i=0; i<LEN; i++){
			System.out.print(pull(S) + " ");
		}
		
	}
	/**
	 * Inefficient O(n), follows an efficient O(lgn)
	 * @param S
	 * @param x
	 */
	/*
	public static void INSERT(int S[], int x){
		
		S[heap_size] = x;
		//HeapSort.MAX_HEAPIFY(S, 0);
		HeapSort.heap_size = heap_size;
		HeapSort.BUILD_MAX_HEAP(S);
		heap_size++;
	}
	*/
	public static void INSERT(int S[], int x){
		heap_size++;
		S[heap_size] = -Integer.MAX_VALUE;
		INCREASE_KEY(S, heap_size, x);
		
	}
	public static int MAXIMUM(int S[]){
		return S[0];
	}
	
	public static int EXTRACT_MAX(int S[]){
		
		if(heap_size < 0){
			return -1;
		}
		int max = S[0];
		
		S[0] = S[heap_size];
		heap_size = heap_size-1;
		HeapSort.heap_size = heap_size;
		HeapSort.MAX_HEAPIFY(S, 0);
		
		
		return max;
	}
	/**
	 *	Kind of an inversion of MaxHeapify  
	 */
	public static int INCREASE_KEY(int S[], int i, int key){
		//x-->k
		if(key < S[i]){
			return -1;
		}
		int temp = 0;
		S[i] = key;
		//travel up the route to root fixing the heap property
		while(i > 0 && S[HeapSort.PARENT(i)] < S[i]){
				temp = S[HeapSort.PARENT(i)];
				S[HeapSort.PARENT(i)] = S[i];
				S[i] = temp;
				i = HeapSort.PARENT(i);
		}
		return 0;
	}
	static int priority = LEN;
	static Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	public static void enqueue(int S[], int x){
		//FIFO
		//key value
		INSERT(S, priority);
		map.put(priority, x);
		priority--;
			
	}
	
	public static int dequeue(int S[]){
		
		int key = EXTRACT_MAX(S);
		int val = map.get(key);
		map.remove(key);
		
		return val;
	}
	static int stack_priority = 0;
	public static void push(int S[], int x){
		//LIFO
		INSERT(S, stack_priority);
		map.put(stack_priority, x);
		stack_priority++;
	}
	
	public static int pull(int S[]){
		
		int key = EXTRACT_MAX(S);
		int val = map.get(key);
		map.remove(key);
		
		return val;
	}
	
}
