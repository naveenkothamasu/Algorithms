package practice;

public class SelectionSort {

	public static void main(String[] args){
		int a[] = {7,6,5,4,3,2,1};
		int len = 7;
		selectionsort(a, len);
		for(int i=0; i < len; i++){
			System.out.print(a[i]);
		}
	}
	
	public static void selectionsort(int a[], int len){
		
		int minAt = -1, temp = 0;
		int j = 0;
		for(int i=0; i< len-1; i++ ){
			for(j=i, minAt = i; j < len; j++){
				if(a[j] < a[minAt]){
					minAt = j;
				}
			}
			temp = a[i];
			a[i] = a[minAt];
			a[minAt] = temp; 
		}
	}
}
