package practice;

public class InsertionSort {

	public static void main(String[] args){
		System.out.println("Insertion Sort");
		
		int a[] = {15,14,13,12,11,10,9,8,7,6,5,4,3,2,1};
		int len = 15;
		int i = 0, j =1;
		//pick j, put it a[1..j-1]
		//a[1..j-1] is sorted
		int key = a[j];
		for( ; j < len; j++){
			i = j-1;
			key = a[j];
			while( i >= 0 && a[i] > key ){
					a[i+1] = a[i];	
					i--;
			}
			a[i+1] = key;
		}
		System.out.println("Output:");
		for(i = 0; i < len; i++){
			System.out.print(a[i] + " ");
		}
	}
}
