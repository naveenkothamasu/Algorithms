package practice;

public class InsertionSortReverse {

	public static void main(String[] args){
		System.out.println("Insertion Sort");
		
		int a[] = {2,5,2,65,32,1,4,2,6,23,5423,32,677,35,5};
		int len = 15;
		int i = 0, j =1;
		//pick j, put it a[1..j-1]
		//a[1..j-1] is sorted
		int key = a[j];
		for( ; j < len; j++){
			i = j-1;
			key = a[j];
			while( i >= 0 && a[i] < key ){
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
