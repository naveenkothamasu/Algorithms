package practice;

public class RecursiveInsertionSort {

	public static void main(String[] args){
		
		int a[] = {-10,9,8,7,6,5,4,3,2,1};
		int len = 10;
		recursiveinsertionsort(a, len-1);
		for(int i=0; i< len; i++){
			System.out.print(a[i] + " ");
		}
	}
	
	public static void recursiveinsertionsort(int a[], int len){
		
		if(len == 0){
			return;
		}
		recursiveinsertionsort(a, len-1);
		//insert a[len] into a[1...len-1]
		int i = len-1;
		int key = a[len];
		while( i >= 0 && a[i] > key){
			
			a[i+1] = a[i];
			i--;
		}
		
		a[i+1] = key;
	}
}
